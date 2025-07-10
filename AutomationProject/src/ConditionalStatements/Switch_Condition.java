package ConditionalStatements;

public class Switch_Condition {

	public static void main(String[] args) {
		
		/*
		 * Syntax: Switch (variablename) { Case thedatatypeofthevariable: set/block of code
		 *            Case thedatatypeofthevariable: set/block of code 

		 *            Case thedatatypeofthevariable: set/block of code 
		 *            
		 *            Case thedatatypeofthevariable:set/block of code
		 *            
		 *            Case thedatatypeofthevariable: set/block of code
		 *            
		 *             default:  set/block of code }
		 */
		
		
		
		
		
		String name = "satya";
		
		switch (name){
			
			case "live tech":
				System.out.println("name is livetech");
				
			case "satya":	
				System.out.println("name is satya");//name is satya
				
			case " sandhya":
				System.out.println("name is sandhya");//name is sandhya
				
			default:	
				System.out.println("today is saturday");//today is saturday
		}
		
		
		
		
		
		
		
		
		
		
	
		System.out.println("Hi livetech team"); // Hi livetech team
	}

}
