package day6;

public class MethodOverloadingDemo {
	
	/*Method Overloading
	 *  --- same method name but
	 *  - with different number of parameters
	 *  - with different datatype
	 * 
	 * void - return type
	 * not returning anything
	 * 
	 * accessspectifier returntype methodName(){
	 * 
	 * }
	 */
	public float demo() {
		int a=10;
		int b=30;
		float diff = b-a;//20
		return diff;
	}
	
	public char demo1() {
		return 'a';
	}
	
	public  boolean demo2() {
		return true;
	}
	
	public void sum(int a,int b) {
		int c = a+b;
		System.out.println("Sum of 2 integer numbers: " + c);
	}
	public void sum(float a,float b) {
		float c = a+b;
		System.out.println("Sum of 2 float numbers: " + c);
	}
	public void sum(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("Sum of 3 numbers: " + sum);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo m1 = new MethodOverloadingDemo();
		m1.sum(34.45f,56.67f);
		m1.sum(23,45,56);
		m1.sum(34,56);
		
		System.out.println(m1.demo2());
		

	}

}
