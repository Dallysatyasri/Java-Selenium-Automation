package ConditionalStatements;

public class IfElseIf_Condition {

	public static void main(String[] args) {
		
		
		String name = "satya";
		
		if(name.equalsIgnoreCase("live tech")) {
			
			System.out.println(" name is live tech");
		}
		else if (name.equalsIgnoreCase("satya")) {
			System.out.println("name is satya "); //name is satya
			
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
