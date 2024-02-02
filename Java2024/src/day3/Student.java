package day3;

public class Student {

	int id;//instance variables
	String name;
	int age;
	String address;
	int grade;
	char section;
	static String schoolName;
	
	public void attendSessions() {
		int a =10;//local variable
		System.out.println("Attend Sessions");
		System.out.println(a);
		
	}
	
	public void submitProject() {
		System.out.println(schoolName);
		System.out.println(id);
		System.out.println("Submit Project");
		
	}
	
	public int getAge() {
		
				return age;
	}
	
	public static void m1() {
		System.out.println("Static Method");
	}
	
	public static void getSchoolName() {
		System.out.println(schoolName);
		
	}
	public static void main(String[] args) {
		
		//Object
		Student s1 = new Student();//instantiation / Object Creation
		s1.id = 1;
		s1.name = "koushik";
		schoolName = "ETS";
		System.out.println(s1.id + " " +s1.name + " " +s1.address + " " +s1.age);
		s1.attendSessions();
		s1.submitProject();
		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Abhisekh";
		s2.age = 23;
		
		System.out.println(s2.id + " " +s2.name + " " +s2.address + " " +s2.age);
		System.out.println(s2.getAge());
		
	}	
}
