package Loops;

import java.util.Arrays;

public class While_Loop {

	public static void main(String[] args) {
		/*Syntax:
		 *  Initialization;
		 *   do{
		 *    increment/decrement 
		 *    } while (condition);
		 * 
		 * 
		 */
		System.out.println("====================numbers=================");//====================numbers=================
       
		int i=0;
		do {
			
			System.out.println(i);// 0 to10
			
			i++;
		}while(i<=10);
		
		System.out.println("====================numbers in reverse order=================");//====================numbers in reverse order=================
	     
		 i=10;
		do {
			
			System.out.println(i);// 10 to 0
			
			i--;
		}while(i>=0);
		
		System.out.println("====================Arrays=================");	//====================Arrays=================
		
		  int a[] = { 1, 90, 8, 4, 77};
		  
		  System.out.println(a.length);//5
		  System.out.println("====================Arrays in=================");

		  i = 0;
		   do {
			   
			   System.out.println(a[i]);//it will print numbers from array
			   i++;
		}while(i < a.length);
		   
		   System.out.println("====================Arrays in ascending order=================");

		Arrays.sort(a);
		i = 0;
		
           do{
		
			System.out.println(a[i]);
			i++;
			
		}while ( i < a.length);
		
		System.out.println("====================Arrays in descending order=================");

		Arrays.sort(a);

		 i = a.length - 1;
		 
		do {
		 
			
			System.out.println(a[i]);
			i--;
		}while (i >= 0 );

		
		
		
		
		
	}

}
