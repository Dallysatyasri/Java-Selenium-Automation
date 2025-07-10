package Operators;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		
		int b = 4;
		
		int c = 5;
		
		int d = 5;
		
		
		System.out.println(a>b && b<c);// true && true = true
		
		System.out.println(a>b && b>c );//true && false = false
	
		
		System.out.println(a<b && b>c);//false && false = false 
		
		System.out.println(a>b || b<c);//true || true = true

		
		System.out.println(a>b || b>c);//true || false = true
		
		System.out.println(a<b || b>c);//false || false = false
		
		System.out.println(c != d);// 5 !=5 = false
		

	}

}
