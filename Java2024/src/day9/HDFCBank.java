package day9;

public class HDFCBank implements IRBI{
public void deposit() {
	System.out.println("HDFC deposit money: 100000");
}

@Override
public void withdraw() {
	System.out.println("HDFC withdraw money: 50000");
	
}
}
