package day4;

public class ControlStatements {

	/*
	 * if - else
	 * if -- else if - else
	 * switch
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int age = 12;

		if (age >= 18) {
			System.out.println("Allowed to vote");
		} else {
			System.out.println("Not Allowed to vote");
		}

		/*
		 * perc >75 --- Distinction perc <75 and perc >=65 --- first class perc <65 and
		 * perc >=45 -- second class perc<45 -- fail
		 * 
		 */
		int perc = 68;
		if (perc > 75) {
			System.out.println("Distinction");
		} else if (perc < 75 && perc >= 65) {
			System.out.println("first class");
		} else if (perc < 65 && perc >= 45) {
			System.out.println("second class");
		} else {
			System.out.println("fail");
		}

		// = assign i=10
		/*
		 * int day = 5; if (day == 1) { System.out.println("Monday"); } else if (day ==
		 * 2) { System.out.println("Tuesday"); } else if (day == 3) {
		 * System.out.println("Wednesday"); } else if (day == 4) {
		 * System.out.println("Thursday"); } else if (day == 5) {
		 * System.out.println("Friday"); } else if (day == 6) {
		 * System.out.println("Saturday"); } else if (day == 7) {
		 * System.out.println("Sunday"); }
		 */

		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day.");
			break;
		}

	}

}
