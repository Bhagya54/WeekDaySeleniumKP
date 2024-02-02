package day5;

public class Staff extends BaseClass{

	public void processSalary() {
		System.out.println("Process Salary");
	}
	
	public void calculateAttendance() {
		System.out.println("Calculate Attendance");
	}
	
	//Method overriding
	//-- if child class and parent class
	// have same method name but with different implementation
	public void lunchTime() {
		System.out.println("Lunch Time for 1.5 hour");
	}
	
	
}
