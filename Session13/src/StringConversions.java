
public class StringConversions {

	public static void main(String[] args) {
		
		int i = 10;
		float f = 2.2f;
		char ch = 'A';
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(f);
		String s3 = String.valueOf(ch);
		System.out.println(">> s1: "+s1);
		System.out.println(">> s2: "+s2);
		System.out.println(">> s3: "+s3);
		

		char[] chArr = {'J', 'O', 'H', 'N'};
		String s4 = new String(chArr);
		String s5 = chArr.toString(); // Reference Copy of Array into String
		System.out.println(">> s4 is: "+s4);
		System.out.println(">> s5 is: "+s5);
		
		String n1 = "Harry";
		String n2 = n1.replace('a', 'u');
		System.out.println(">> n2: "+n2);
		
		String n3 = n2.replace('u', 'a');
		System.out.println(">> n3: "+n3);
		
		if(n1 == n3){
			System.out.println(">> n1 == n3");
		}else{
			System.out.println(">> n1 != n3");
		}
		
	}

}
