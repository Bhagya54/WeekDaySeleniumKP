package day7;

public class Student{
/*
 * Constructor: 
 * have same name as that of class name
 * 
 * forces the user to initialize values.
 * Java create a default constructor 
 * 
 * 
 * Constructor Overloaded
 * 
 * if global variable and local variable have same name
 */
	
	int id;
	String name;
	int age;
	String address;
	int grade;
	char section;
	static String schoolName;
	String pancard;
	
	/* Parameterized Constructor
	 * 
	 */
	public Student(int id, String name,String pancard) {
		System.out.println("Inside Constructor");
		//id -- 1
		this.id = id;
		this.name = name;
		this.pancard = pancard;
	}
	
	public Student(int id, String name, int age) {
		//id - 2
		this.id = id;
		this.name = name;
		this.age = age;
	}

	

	public Student(int a, String n) {
		System.out.println("Inside Constructor");
		id = a;//123
		name = n;//student1
		
	}
	
	
	
	public void attendSessions() {
		System.out.println("Student Attending Sessions");
		
	}
	
	public void submitProject() {
		System.out.println("Student submitting the project");
	}
	
	
	
	
}
