package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArrayVaraiable {

	public static void main(String[] args) {
		
		
	
		/*  Syantax: datatype[] varaiblename = {value1,value2,..valuen}
		 *  ex: int[] satya = {1,29,30,90} */
		 
		
		 int[] satya = {0,90,78,90,78,67,76,1,2,44};
		 
		 System.out.println(satya.length); // 10
		 
		 System.out.println("***********************");
		 
		 System.out.println(satya[5]);// 67
		 
		 System.out.println(satya[0]);//0
		 
		 System.out.println(satya[9]);//44
		 
	//	 System.out.println(satya[10]);// java.lang.ArrayIndexOutOfBoundsException
		 
		 
		 System.out.println("***********static way************");
		 
		 
	/*	 for(intialization,condition,increment/decrement){
		 
	} */
		 
	for(int i= 0;i<= 9;i++)	{
		
		System.out.println(satya[i]);
	}
	
	
	System.out.println("***********dynamic way**********");
	for (int i = 0; i < satya.length; i++) {
		
		System.out.println(satya[i]);
		}
	
	System.out.println("***********Asscending order**********");
	Arrays.sort(satya);
	for (int i = 0; i < satya.length; i++) {
		
		System.out.println(satya[i]);
		}
	
	System.out.println("***********Descending order**********");
	Arrays.sort(satya);
	for (int i = satya.length-1; i >=0; i--) {
		
		System.out.println(satya[i]);
	
	
	
		
	}	 
	
	
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
	}	 

	}



