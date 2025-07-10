package Varaiables;

public class Static_Variable {
	
	// static instance variable or static variable
	
	static String day = "monday";
	
	void car() {

		System.out.println(day); // Thrusday
		
		day = "workingday";

		System.out.println(day); // holiday
		
		
	}
	
	void bus() {

		day = "holiday";

		System.out.println(day); // holiday
	}

	public static void main(String[] args) {
		// 1st way - direct calling

				System.out.println("===================1st way==============");

				System.out.println(day); // monday
				

				// 2nd way - using the class name

				System.out.println("===================2nd way==============");

				System.out.println(Static_Variable.day); // monday
				
				// 3rd way - using the object

				System.out.println("===================3rd way==============");

				Static_Variable sv = new Static_Variable();

				sv.car();

				System.out.println(sv.day); // monday

				System.out.println("===================reinitialziation in main method==============");

				day = "today";

				System.out.println(day);

				System.out.println("===================reinitialziation in normal method level==============");

				sv.bus();

	}

}
