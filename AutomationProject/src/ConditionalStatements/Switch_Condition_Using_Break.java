package ConditionalStatements;

public class Switch_Condition_Using_Break {

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
				break;
				
			case "satya":	
				System.out.println("name is satya");//name is satya
				break;
				
			case " sandhya":
				System.out.println("name is sandhya");
				break;
				
				
			default:	
				System.out.println("today is saturday");
		}
		
		
		
		
		
		
		
		
		
		
	
		System.out.println("Hi livetech team"); // Hi livetech team
	}

}
