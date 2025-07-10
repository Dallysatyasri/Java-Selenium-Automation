package Varaiables;

public class Local_Varaible {
	
	/*
	 * Syntax: Void methodname() { 
	 *               block/set of statements (code) 
	 *               }
	 */
	
	void car() {
		
		int age = 100;
		
		System.out.println(age); //100 //it will not be displayed until and unless it is called in main method
	
		age= 250;
		
		System.out.println(age);//250
	
	}
	
	
	

	public static void main(String[] args) {
		
		// 1st way: directly calling is not possible it show error because age is a local variable
		//System.out.println(age); // not possible
		
		// 2nd way- creating an object 
		
		//  syntax:classname objectname = new classname();
		
		Local_Varaible lv = new Local_Varaible();
		
	//	System.out.println(lv.age);// it is also not possible becsuse it is a local variable
		
		lv.car();//it executes everything that is peresent in the method
		

	}

}
