package teacherGenerator;

import java.util.ArrayList;

public class Class {
	static ArrayList<Student> students;
	int r; 
	int c;
	static Student[][] student; 

	public static void main(String[] args) {
		Student[][] grid = init(); 

	}

	Class(ArrayList<Student> students, int r, int c){
		this.students = students; 
		this.r = r; 
		this.c = c; 


		student = new Student[r][this.c];


	}
	public static Student[][] init(){
		int firstStudent = (int)Math.floor(Math.random()*students.size()); 
		student[0][0] = students.get(firstStudent);
		students.remove(firstStudent); 
		// initially puts in a student in one of the spots of each group of two 
		for(int i = 0; i < student.length; i++){
			for(int j = 2; j < student[0].length; j++){
				 if(j % 2 == 0  && student[i][j] != null){
					 int index = (int)Math.floor(Math.random()*students.size()); 
					 student[i][j] = students.get(index);
					 students.remove(index); 
				 }
			}

		}
		
		// focusing on placing students 
		for(int i = 0; i < student.length; i++){
			for(int j = 0; j < student[0].length; j++){
				if(j % 2 == 0  && student[i][j] != null){
					Student s = student[i][j]; 
					// loop through all the students, sees if any are not 
					//friends with the current student 
					for(Student stu : students){
						if(!s.isFriends(stu)){
							student[i][j+1] = stu; 
						}
					}
				}
			}
		}
		
		return student; 
	}
	
	void addMethod(Student student){
		students.add(student); 
	}
	public String toString(){
		for(int i = 0; i < student.length; i++){
			for(int j = 0; j < student[0].length; j++){
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		return "done"; 

	}

}
