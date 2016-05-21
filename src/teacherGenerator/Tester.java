package teacherGenerator;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Student> test = new ArrayList<>(); 
		
		test.add(new Student("joea")); 
		test.add(new Student("bob")); 
		test.add(new Student("billy")); 
		test.add(new Student("billybobjoe"));
		test.add(new Student("james"));
		Class testClass = new Class(test, 2, 2); 
		System.out.println(testClass);
	}
}
