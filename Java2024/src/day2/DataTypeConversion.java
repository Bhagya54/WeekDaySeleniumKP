package day2;

public class DataTypeConversion {
	
	/*
	 * B1: 3L
	 * B2: 5L: 2l
	 * Task1: B1--> B2
	 * Task2: B2--> B1; is a possibility of Data loss,
	 * take confirmation
	 */

	public static void main(String[] args) {
		
		byte b1 = 23;
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
		
		int i2 = 34;
		byte b2 = (byte) i2;
		System.out.println(i2);
		System.out.println(b2);
		
		float f1 = 34.81f;
		int i3 = (int) f1;
		System.out.println(f1);
		System.out.println(i3);
		
		int i4 = 67;
		float f2 = i4;
		
		System.out.println(i4);
		System.out.println(f2);
		
		char c1 = 'f';
		int i5 = c1;
		
		System.out.println(c1);
		System.out.println(i5);
		
		
		int i6 = 108;
		char c2 = (char) i6;
		
		System.out.println(i6);
		System.out.println(c2);
		
		
		/*
		 * Wrapper Class:
		 * int : Integer
		 * float: Float
		 * double: Double
		 * char: Character
		 * 
		 * 
		 */
		String s1 = "123";
		int i7 = Integer.parseInt(s1);
		System.out.println(s1);
		System.out.println(i7);
		
				
		Float i8 = 56.7f;
		String s2 = Float.toString(i8);
		System.out.println(i8);
		System.out.println(s2);

	}

}
