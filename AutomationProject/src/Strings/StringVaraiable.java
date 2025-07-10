package Strings;

public class StringVaraiable {

	public static void main(String[] args) {
		// syntax: datatype varaiablename = value;
		
		String name =  "test $%^%$% 432345 AFDR";
		
		String day = " ";
		
		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(day); //
		
		System.out.println("=========================================");
		
		System.out.println(name.length());// 23
		
		System.out.println("=========================================");
		  
		System.out.println(name.charAt(0)); //t
		
		System.out.println(name.charAt(4));//
		
		System.out.println(name.charAt(5));// $
		
		System.out.println(name.charAt(15)); // 3
		
		System.out.println(name.charAt(16));
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.indexOf("t")); //0
		
		System.out.println(name.indexOf(" ")); // 4
		
		System.out.println(name.indexOf(" A")); // 19
		
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		
		System	.out.println(name.toUpperCase());// TEST $%^%$% 432345 AFDR

		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.toLowerCase()); // test $%^%$% 432345 afdr
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
       System.out.println("=========================================");
		
		System.out.println(name); // test $%^%$% 432345 AFDR 
		
		System.out.println(name.isEmpty()); // FALSE
		
		System.out.println(day); //
		
		System.out.println(day.isEmpty()); // true
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.startsWith("test"));// true
		
		System.out.println(name.startsWith("satya"));// false
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.endsWith("DR")); //
		
		System.out.println(name.endsWith("satya")); // false
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		System.out.println(name.contains("$%^%$%"));//true
		
		System.out.println(name.contains("123")); // false
		
		System.out.println("=========================================");

		System.out.println(name); // test $%^%$% 432345 AFDR
		
		 System.out.println(name.concat("HI RADHA AND KRISHNA"));//test $%^%$% 432345 AFDR HI RADHA AND KRISHNA
		 
		
		
		
		

		
		
		
		

		
		


		
		
		
		
	}

}
