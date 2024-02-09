package day9;

public class MainClass {

	public static void main(String[] args) {
		ICICIBank icici = new ICICIBank();
		icici.deposit();
		icici.withdraw();
		
		IRBI hdfc = new HDFCBank();
		hdfc.deposit();
		hdfc.withdraw();

		/*
		 * Selenium WebDriver -- Interface
		 * ChromeDriver - class
		 * IEDriver -- Class
		 * SafariDriver-- class
		 */
	}

}
