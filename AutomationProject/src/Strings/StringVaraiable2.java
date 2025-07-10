package Strings;

public class StringVaraiable2 {

	public static void main(String[] args) {
		// // Syntax: datatype variblename = value;

		String name = "test $%^%$% 432345 AFDR";

		String name1 = "test $%^%$% 432345 AFDR";

		String name2 = "Test $%^%$% 432345 AFDR";

		String name3 = "Test $%^%$% 432346 AFDR";
		
		System.out.println("=========================================");

		System.out.println(name.equals(name1)); // true
		
		System.out.println(name1.equals(name2)); //false
		
		System.out.println(name.equals(name2)); //false
		
		System.out.println("=========================================");
		
		System.out.println(name.equalsIgnoreCase(name1));//true
		
		System.out.println(name.equalsIgnoreCase(name2));//true
		
		System.out.println(name1.equalsIgnoreCase(name2));//true
		
		System.out.println(name2.equalsIgnoreCase(name3));//false
		
		System.out.println("=========================================");
		
		
				char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
				
		System.out.println(ch.length);//8
		
		System.out.println(ch);
		
		System.out.println("==============convert character array into string===========================");
		
		String CharacterArray = new String(ch);
		
		System.out.println(CharacterArray);
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.substring(6));//%^%$% 432345 AFDR
		
	
		
		System.out.println(name.substring(16)); // 45 AFDR

		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		// the compiler will starts from 6 the index and ends with lastindex-1 = 15-1 =14
		
		System.out.println(name.substring(6, 15)); //%^%$% 432
		
		System.out.println(name.substring(3, 20)); //t $%^%$% 432345 A
		

		
		System.out.println("=========================================");
		
		for (int i = 0; i < name.length(); i++) {
			
			
			
			System.out.println(name.charAt(i)); 
			
			
		}
		

		
		
		

		
		
		
		
		
		
		
		


	}

}
