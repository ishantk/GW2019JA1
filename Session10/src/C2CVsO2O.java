class CA{
	
	// Property of Object
	int a;
	// Property of class
	static int b;
	
	CA(){
		System.out.println(">> CA Object Constructed");
	}
	
	// Property of Object
	void showA(){
		System.out.println(">> a is: "+a);
	}
	
	// Property of class
	static void showB(){
		System.out.println(">> b is: "+b);
	}
	
}

class CB extends CA{ // IS-A Relationship
	
	static int b;
	
	CB(){
		System.out.println(">> CB Object Constructed");
	}
	
	// Property of class
	static void showB(){
		System.out.println(">> b is: "+b);
	}
}

public class C2CVsO2O {

	public static void main(String[] args) {
	
		CB cRef = new CB(); 

		CB.b = 100;
		CB.showB();
		
	}

}
