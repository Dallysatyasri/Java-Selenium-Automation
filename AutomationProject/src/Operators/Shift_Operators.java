package Operators;

public class Shift_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =4;
		
		int b = 3;
		
		int c=10;
		
		int d = 5;
		
		System.out.println(a<<b);// 4 * 2^3=4 *(2*2*2)= 4*8 = 32
		
		System.out.println(d << a);// 5 * 2^ 4 =5 *(2*2*2*2) = 5* 16= 80
		
		
		System.out.println(c >> b);// 10 / 2^ 3 =10  /(2*2*2) = 10/8= 1
		
		
	}

}
