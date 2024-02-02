package day7;

public class ConstructorDemo {

	public static void main(String[] args) {
		Student s1 = new Student(123,"Student1");
		System.out.println(s1.id + " " + s1.name);

		Student s2 = new Student(234,"Student2","qwe1323dfsd");
		System.out.println(s2.id + " " +s2.name + " " + s2.pancard);
	}

}
