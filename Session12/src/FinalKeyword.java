final class Parent{ // final class cannot be extended i.e. inherited | No O2O / C2C
	
	// final method in Parent cannot be overrided by Child :)
	final void purchaseBike(){
		System.out.println(">> Lets buy Bajaj Pulsar");
	}
}

/*class Child extends Parent{
	
	
	void purchaseBike(){
		System.out.println(">> Lets buy Royal Enfield");
	}
	
}
*/


public class FinalKeyword {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// FINAL VARIABLE
		final int j = 20;
		//j = 200; // error 
		// final j cannot be modified and its a read-only container
		
		// BLANK FINAL VARIABLE
		final int k;
		k = 10;
		//k = 1000; // error

	}

}
