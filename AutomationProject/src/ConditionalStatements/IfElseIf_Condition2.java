package ConditionalStatements;

public class IfElseIf_Condition2 {

	public static void main(String[] args) {
		
		
		String name = "satya";
		
		if(name.equalsIgnoreCase("live tech")) {
			
			System.out.println(" name is live tech");
		}
		else if (name.equalsIgnoreCase("sunday")) {
			System.out.println("name is sunday "); 
			
		}
		else if (name.equalsIgnoreCase("sandhya")) {
			System.out.println("name is Sandhya"); 
			
		}
		else {
			System.out.println("today is saturday");
		}
	
		System.out.println("Hi livetech team"); // Hi livetech team
	}

}
