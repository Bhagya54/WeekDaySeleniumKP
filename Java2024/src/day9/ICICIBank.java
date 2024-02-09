package day9;

public class ICICIBank implements IRBI {
	//definition of methods
public void deposit() {
	System.out.println("ICICI deposit money: 50000");
}

@Override
public void withdraw() {
	System.out.println("ICICI withdraw money: 5000");
	
}
}
