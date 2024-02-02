package day4;

import java.util.Iterator;

public class LoopsDemo {

	public static void main(String[] args) {

		/*
		 * Loops: for print 10 to 100
		 * 10 20 30 .. 100
		 * 100... 10
		 * 
		 * while loop
		 * do while
		 */
		int j = 10;
		// j++;
		// j--;
		j = j * 12;
		System.out.println(j);

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=100;i>=10;i=i-10) {
			System.out.print(i+ " ");
		}
		System.out.println();
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println();
		int count = 105;
		while(count <=100) {
			System.out.print(count + " ");
			count = count+10;
		}
		System.out.println();
		System.out.println("Learning do while loop");
		int k = 105;
		do {
			System.out.print(k + " ");//105
			k = k+5;//110
		}while(k <=50);
		
	System.out.println("For double values");	
	System.out.println();
	for(double d = 10.50;d<=50.15;d = d+5.5) {
		System.out.println(d);
	}
	
	

}
}
