package Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEach_Loop2 {

	public static void main(String[] args) {
		/*
		 * Syntax:
For (datatypeofanarray/wrapperclassofancollection variablename : array variable/object/collection object) {
variablename
}

		 */
		
		System.out.println("====================Arrays=================");

		int a[] = { 1, 90, 8, 4, 77 };

		System.out.println(a.length);

		System.out.println("====================Arrays in=================");

		
		for(int number:a) {
			
			if(number == 90) {
				break;
			}
			
			System.out.println(number);
		}
		
		System.out.println("====================Arrays in ascending order=================");

		Arrays.sort(a);
		
		for(int number:a) {
			
			if(number==4) {
				
				continue;
			}
			System.out.println(number);
			
			
		}
		

	}

}
