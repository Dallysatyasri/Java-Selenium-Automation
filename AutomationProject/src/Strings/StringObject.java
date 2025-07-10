package Strings;

public class StringObject {

	public static void main(String[] args) {
		
		// datatype objectname = new datyatype;
		
		String name = "test $%^%$% 432345 AFDR";

		String name1 = "test $%^%$% 432345 AFDR";

		String name2 = "Test $%^%$% 432345 AFDR";

		String name3 = "Test $%^%$% 432346 AFDR";
		
		System.out.println("=========================================");
		
		// comapreto comapres askey values
		
		
		System.out.println(name.compareTo(name1)); // 0
		
		System.out.println(name.compareTo(name2)); //32
		
		System.out.println(name1.compareTo(name2)); // 32
		
		System.out.println("=========================================");
		
		System.out.println(name.compareToIgnoreCase(name1));//0
		
		System.out.println(name.compareToIgnoreCase(name2));//0
		
		System.out.println(name1.compareToIgnoreCase(name2));//0
		 
		
		

		
		
	}

}
