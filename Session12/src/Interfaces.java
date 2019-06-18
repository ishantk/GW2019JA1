// Rule Book
interface Inf1{
	
	int i = 10; // public static final int i = 10;
	
	// Rules:
	void show(); //public abstract void show();
	void fun();
}

//Rule Book
interface Inf2{
	
	int i = 100; 
	
	// Rules:
	void hello();
	void fun();
}

// 3. Interface to Interface
// Multiple Inheritance is Supported
interface Inf3 extends Inf1, Inf2{
	
}

// Multiple Implementation and Not Multiple Inheritance :)
class CA implements Inf3{//Inf1, Inf2{
	
	public void show(){
		System.out.println(">> This is show");
	}
	
	public void fun(){
		System.out.println(">> This is fun");
	}
	
	void bye(){
		System.out.println(">> This is bye");
	}
	
	public void hello(){
		System.out.println(">> This is hello");
	}
}


public class Interfaces {

	public static void main(String[] args) {
		
		//1. Direct Object Construction
		CA cRef = new CA();
		cRef.show();
		cRef.fun();
		cRef.bye();
		
		//2. Polymorphic Statement : Ref Var of Interface can access the Object which implements it
		Inf1 iRef1 = new CA();
		iRef1.show();
		iRef1.fun();
		//iRef1.bye(); // error
		//iRef1.hello(); // err
		
		Inf2 iRef2 = new CA();
		//iRef2.show(); // err
		iRef2.fun();
		iRef2.hello();
		//iRef2.bye(); // err

		//Inf1.i = 100; // error
		
		//System.out.println(">> i is: "+CA.i);
		System.out.println(">>Inf1 i is: "+Inf1.i);
		System.out.println(">>Inf2 i is: "+Inf2.i);
		
		Inf3 iRef3 = new CA();
		iRef3.show();
		iRef3.hello();
		iRef3.fun();
		
		//iRef3.bye(); error
		
	}

}
