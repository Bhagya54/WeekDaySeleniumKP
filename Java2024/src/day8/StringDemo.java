package day8;

public class StringDemo {

	/*String
	 * class
	 * Non-Primitive
	 * 
	 * String Object is immutable(cannot be changed)
	 * 2 ways:
	 * 1. String Literal
	 * 	Object is created inside SCP
	 * 	New Object will not be created when value is duplicate, the reference will point to alreday existing object 
	 * 2. New Keyword
	 * 	Object is created everytime, irrespective of values being duplicate or not
	 */
	
	public static void main(String[] args) {
		String str = "bhagya";
		System.out.println(str);
		str = str.concat("trainer");
		System.out.println(str);
		
		
		String sl1 = "Java";
		String sl2 = "python";
		String sl3 = "Java";
		
		String sn1 = new String("Bhagya");
		String sn2 = new String("Azai");
		String sn3 = new String("Bhagya");
		
		System.out.println(sl1==sl2);
		System.out.println(sl1==sl3);
		System.out.println(sn1==sn3);
		
		System.out.println(sn1.equals(sn3));
		
		int a=10;
		int b=20;
		System.out.println(a==b);
		
		System.out.println("Welcome");
		System.out.println("Welcome" + 10);
		System.out.println("Welcome" + 10 + 20);
		System.out.println(10 + 20 + "Welcome");
		
		//String buffer is mutable(can change its value)
		StringBuffer sb1 = new StringBuffer("tea");
		System.out.println(sb1);
		sb1.append("coffee");
		System.out.println(sb1);//teacoffee
		System.out.println(sb1.charAt(2));
		
		System.out.println(sb1.reverse());
		
		String str1 = new String("selenium");
		System.out.println(str1.length());
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		
		
		
	}

}
