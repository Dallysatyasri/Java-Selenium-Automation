package Varaiables;

public class Instance_Varaible2 {
	
	//instance variable
	
		String day = "Thrusday";
		
		
		void car() {
			
			System.out.println(day); 
			
			day = "myday";
			
			System.out.println(day); 

			// local variable

			int age = 100;

			System.out.println(age); // 100

			age = 250;

			System.out.println(age); // 250
		}

	public static void main(String[] args) {

		// creating an object

		// Syntax: classname objectname = new classname();

		 Instance_Varaible2 lv = new  Instance_Varaible2();	
		 

		lv.car();

		System.out.println(lv.day); //Thrusday

		lv.day = "today";
		
		System.out.println(lv.day); //today
		
		lv.car();

	}

}
