package Loops;

import java.util.Arrays;

public class For_Loop2 {

	public static void main(String[] args) {
		/** Syntax: For (initialization; condition; increment/decrement) {
		 * 
		 * }
		 * 
		 */
		System.out.println("====================numbers=================");//====================numbers=================
       
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);// 0 to10
		}
		
		System.out.println("====================numbers in reverse order=================");//====================numbers in reverse order=================
	       
		for(int i=10;i>=0;i--) {
			
			System.out.println(i);// 10 to 0
		}
		
		System.out.println("====================Arrays=================");	//====================Arrays=================
		
		  int a[] = { 1, 90, 8, 4, 77};
		  
		  System.out.println(a.length);//5
		  System.out.println("====================Arrays in=================");

		  
		   for (int i = 0; i < a.length; i++) {
			   
			   System.out.println(a[i]);//it will print numbers from array
			
		}
		   
		   System.out.println("====================Arrays in ascending order=================");

		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
		
		System.out.println("====================Arrays in descending order=================");

		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.println(a[i]);
		}

		
		
		
		
		
	}

}
