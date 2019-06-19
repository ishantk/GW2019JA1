
public class StringMethods {

	public static void main(String[] args) {
		
		// String in Java is a Class i.e. Built In Class
		// It has so many methods so that we can process textual data 
		
		// 1. String -> Strings are IMMUTABLE
		//			    Strings cannot be modified after they are created
		// Modification on a String will generate a new String in return
		
		// Problem : Anytime if we will modify a String, a new String is created in memory 
		
		String names = "John, Jennie, Jim, Jack, Joe";
		System.out.println(">> names before is: "+names);
		String newNames = names.toUpperCase();
		System.out.println(">> names after is: "+names);
		System.out.println(">> newNames is: "+newNames);
		
		// toLowerCase()
		
		String s1 = names.concat(", Mike");
		System.out.println(">> names now is: "+names);
		System.out.println(">> s1 is: "+s1);
		
		String s2 = names.replace('J', 'K');
		System.out.println(">> names after replace is: "+names);
		System.out.println(">> s2 is: "+s2);
		
		int length = names.length();
		System.out.println(">> names is "+length+" characters wide");
		
		//char ch = names.charAt(2);
		char ch = names.charAt(length-1);
		System.out.println(">> ch is: "+ch);

		//String names = "John, Jennie, Jim, Jack, Joe";
		//int idx = names.indexOf('o');
		//int idx = names.lastIndexOf('o');
		
		int idx = names.indexOf("Jennie"); // lastIndexOf
		System.out.println("idx is: "+idx);
		
		char[] chArr = names.toCharArray(); // Get Data as Character Arrays from String
		
		/*
		int count = 0;
		
		for(char c : chArr){
			if(c=='J'){
				count++;
			}
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println(">> J found "+count+" times");
		*/
		
		for(int i=0;i<chArr.length;i++){
			if(chArr[i] == 'n'){
				System.out.println(">> n found at index #"+i);
			}
		}
		
		String email = "john@example.com";
		String password = "pass123";
		
		if(email.contains("@") && email.contains(".")){
			System.out.println(">> "+email+" is a Valid Email");
		}else{
			System.out.println(">> "+email+" Invalid Email");
		}
		
		if(password.length() >=6){
			
		}
		
		String song = "somesongname.mp3";
		if(song.endsWith(".mp3")){ // startsWith
			System.out.println(">> We can play "+song);
		}
		
		String students = "Mike, Leo, Harry, George, Dave";
		String[] sArr = students.split(",");
		for(String s : sArr){
			System.out.println(s.trim());
		}
		
		String quote = "Search the candle rather than cursing the darkness";
		String[] words = quote.split(" ");
		System.out.println(">> Words in quote: "+words.length);	
		// HW: 1. Count number of spaces ?
		//     2. Eliminate Spaces and tell how many alphabets ?
		
		//String word = quote.substring(5); 		// from 5 till end
		String word = quote.substring(7, 10);		// from 7 less than 10 
		System.out.println(">> word is: "+word);
		
		String saluation = "Mr.";
		String name = "John";
		//String greeting = "Hello, "+ saluation + name;
		String greeting = "Hello, ".concat(saluation).concat(name);
		System.out.println("Greeting is: "+greeting);
		System.out.println("saluation is: "+saluation);
		System.out.println("name is: "+name);
		
	}

}
