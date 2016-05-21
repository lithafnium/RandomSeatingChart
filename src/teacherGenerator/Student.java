package teacherGenerator;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	//friend, rating 
	
	ArrayList<Student> friends = new ArrayList<>(); 
	String name; 
	
	Student(String name){
		this.name = name; 
	}
	// int rating:
	// 1 = barely know each other 
	// 5 = talk non-stop 
	void add(Student student, boolean rating){
		friends.add(student); 
	}
	public String toString(){
		return name; 
	}
	
	public boolean isFriends(Student s){
		if(friends.contains(s)) return true; 
		else return false; 
	}
	
}
