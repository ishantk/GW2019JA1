
public class StringDataType {

	public static void main(String[] args) {
		
		// Interned Way
		// s1 and s2 are reference variable which contains hashcode of Strings :)
		String s1 = "Hello";
		String s2 = "Hello";
		
		// Object Way
		// s3 and s4 are reference variable which contains hashcode of Strings :)
		String s3 = new String("HeLLo");
		String s4 = new String("Hello");
		
		// == will compare Reference Variables and Not Data :)
		
		if(s1 == s2){
			System.out.println(">> s1 == s2");
		}else{
			System.out.println(">> s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println(">> s3 == s4");
		}else{
			System.out.println(">> s3 != s4");
		}

		if(s1 == s3){
			System.out.println(">> s1 == s3");
		}else{
			System.out.println(">> s1 != s3");
		}
		
		
		// Printing reference variables
		System.out.println(">> s1 is: "+s1);
		System.out.println(">> s2 is: "+s2);
		System.out.println(">> s3 is: "+s3);
		System.out.println(">> s4 is: "+s4);
		
		System.out.println(">> s1.toString() is: "+s1.toString());
		System.out.println(">> s2.toString() is: "+s2.toString());
		System.out.println(">> s3.toString() is: "+s3.toString());
		System.out.println(">> s4.toString() is: "+s4.toString());
		
		// toString will be executed automatically and it will give data rather than hashcode
		
		// equals method is a built in method of String which will compare the data :)
		if(s1.equals(s2)){
			System.out.println(">> s1 equals s2");
		}else{
			System.out.println(">> s1 not equals s2");
		}
		
		//if(s3.equals(s4)){
		if(s3.equalsIgnoreCase(s4)){
			System.out.println(">> s3 equals s4");
		}else{
			System.out.println(">> s3 not equals s4");
		}
		
		if(s1.equals(s3)){
			System.out.println(">> s1 equals s3");
		}else{
			System.out.println(">> s1 not equals s3");
		}
		
		// compareTo method is a built in method of String which will compare the data if result comes to be 0:)
		//if(s3.compareTo(s4) == 0){
		if(s3.compareToIgnoreCase(s4) == 0){
			System.out.println(">> s3 compared to s4");
		}else{
			System.out.println(">> s3 not compared to s4");
		}
		
	}

}
