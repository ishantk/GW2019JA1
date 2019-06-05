/*
 Java Editions
	1. JSE
		Java Standard Edition 		| 	Core Java
									|   Desktop Application
	2. JEE
		Java Enterprise Edition 	|   Adv. Java
									|   Web Applications
	3. JME
		Java Mobile Edition 		|   Mobile Applications 
										(Feature Phones)


	JDK : Java Development Kit
	JRE : Java Runtime Environment
	JVM : Java Virtual Machine		
 */


public class DataTypes {

	public static void main(String[] args) {
		
		/*
		 	Floating Points
		 	float 	32bits
		 	double  64bits
		 */
		
		byte discount = 20;
		long phone = 9915571177L;
		
		// byte data = 20L; -> error
		
		float pi = 3.14F;
		//double pi = 3.14;
		
		// character type | 16 bits
		//char ch = 'A';
		//char ch = 65;
		char ch = '\u20b9';
		System.out.println("ch is: "+ch);
		
		// 8 bits -> 1 bit (1/0)
		boolean isInternetOn = true;
		isInternetOn = false;
		
		System.out.println(">> isInternetOn "+isInternetOn);
		
		// Primitive Types : Work on Values !!
		
	}

}
