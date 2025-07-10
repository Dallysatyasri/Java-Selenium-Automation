package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArrayObject {

	public static void main(String[] args) {
		
		
	
		/*  Syantax: datatype[] objectename = new datatype[size of an array];
		 * ex: int[] satya = new int[3];
		 *     satya[0] = 1;
		 *     satya[1] =14;
		 *     satya[2] = 78;
		 */
		
		 int[] satya = new int[5];
		 satya[0] = 89;
		 satya[1] = 890;
		 satya[2] = 8009;
		 satya[3] = 1289;
		 satya[4] = 80009;
		 
		 System.out.println(satya.length); // 5
		 
		 System.out.println("***********************");
		 
		 System.out.println(satya[4]);//80009
		 
		 System.out.println(satya[0]);//89
		 
		 System.out.println(satya[2]);//8009
		 
	//	 System.out.println(satya[5]);// java.lang.ArrayIndexOutOfBoundsException
		 
		 
		 System.out.println("***********static way************");
		 
		 
	/*	 for(intialization,condition,increment/decrement){
		 
	} */
		 
	for(int i= 0;i<= 4;i++)	{
		
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



