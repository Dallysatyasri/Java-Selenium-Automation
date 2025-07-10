package Arrays;

import java.util.Iterator;

public class MultiDimensionalVaraiable {

	public static void main(String[] args) {
		/* creating a varaiable
		 * syntax: datatypep+[][] varaiablename = {{value1,value2},{value3,value3},...{valuen,valuen}};
		 * ex: int[][] satya={(0,90),(78,90)};
		 * 
		 * 
		*/
		
		double[][] satya = {{1d,10d,},{2d,20d},{3d,30d}};
		
         System.out.println(satya.length);//3
         System.out.println("***********************************");//3
         System.out.println(satya[0][0]);//1.0
         System.out.println(satya[1][1]);//20.0
         System.out.println(satya[2][0]);//3.0
         
         
         
         System.out.println("******************static way*****************");//3
         
         
         for (int i = 0; i <=2; i++) { //rows
        	 for (int j = 0; j <=1; j++) { // cloumns
        		  System.out.println(satya[i][j]);
				
			}
			
		}
         
 System.out.println("******************dynamic way*****************");//3
         
         
         for (int i = 0; i < satya.length; i++) { //rows
        	 for (int j = 0; j < satya.length-1; j++) { // cloumns
        		  System.out.println(satya[i][j]);
        	 }
		
         
         
         
		}
         
         
	}

}
