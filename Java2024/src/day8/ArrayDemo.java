package day8;

public class ArrayDemo {

	//Array -- to store values of same datatype. 3 parts 
	
	/*1.An Array shuld provide size while instantiation
	 * 2.indexing starts from zero
	 * 3.if the value of an array is not initialized it gives the default value
	 * 4.duplicate values are allowed
	 * 
	 * 3 parts of an array
	 *declaration
	 *instantation
	 *initialization
	 */
	public static void main(String[] args) {
		
		int[] id = new int[5];
		/*
		 * int[] id;//declaration id = new int[5];
		 *///instantation
		//5 -- 0 1 2 3 4
		id[0] = 123;
		id[1] = 234;
		id[3] = 568;
		id[4] = 123;
		
		
		System.out.println("Size of an array: " +id.length);
		System.out.println("Array Values: ");
		//System.out.println(id[5]);
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		
		//declaration and initialization
		//int[] b
		int b[] = {34,45,56,67,78};
		
		//a1 of size 10. 1,2,... 10 -- for loop
				//a2 of size .. 10,20,... 100
		int[] a1 = new int[10];
		for(int i=0;i<a1.length;i++) {
			a1[i] = (i+1);
			System.out.println(a1[i]);
		}
		
		

	}

}
