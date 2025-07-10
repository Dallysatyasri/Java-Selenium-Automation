package Varaiables;

public class Final_Variable {
	
	//final instance variable or final variable
	
	final String day = "monday";
	
void car() {
		
		System.out.println(day); // Thrusday
		
		// final local variable or local variable

		final int age = 100;

		System.out.println(age); // 100
	}

	public static void main(String[] args) {
		
		Final_Variable fv = new Final_Variable();
		
		System.out.println(fv.day); //monday	
		
		

	}

}
