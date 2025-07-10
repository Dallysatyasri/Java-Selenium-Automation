package Varaiables;

public class Instance_Variable {
	
	// instance variable
	
	String day = "monday";
	
	void car() {
		int age = 100;

		System.out.println(age); // 100

		age = 250;

		System.out.println(age); // 250
	}
	 int a = 6;
	 
	void cars() {
		
		System.out.println(day);
		
	}

	public static void main(String[] args) {
		

		// creating an object

		// Syntax: classname objectname = new classname();
		
		
		
      Instance_Variable iv = new  Instance_Variable();
      
      System.out.println(iv.day);//monday
      
      iv.day="my day";
      
      System.out.println(iv.day);//my day
      
      System.out.println(iv.a);
            
      
	
	
	}

}
