/*
class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destination){
		System.out.println(">> Cab Booked from "+source+" to "+destination);
	}
}
*/

// We are refining RTP
// abstract class cannot have objects
// You cannot create objects but RTE i.e. JVM will create to satisfy Rule of Inheritance
// Rule Book created by Parent
/*
abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract method cannot have definition
	// can only be created in an abstract class
	// abstract method is a RULE or PROTOCOL created by Parent
	// for n number of abstract method children should define all those abstract methods
	abstract void bookCab(String source, String destination);
	
	void show(){
		System.out.println(">> show of Cab");
	}
}*/

// Rule Book but not by Parent
interface Cab{
	
	// Neither we nor RTE i.e. JVM can create Objects of Interfaces
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// abstract method cannot have definition
	// can only be created in an abstract class or interfaces
	// abstract method is a RULE or PROTOCOL not by Parent
	// for n number of classes which follows interfaces should define all those abstract methods
	//abstract void bookCab(String source, String destination);
	void bookCab(String source, String destination); // -> public abstract void bookCab(String source, String destination);
	
	/*void show(){
		System.out.println(">> show of Cab");
	}*/ // error
}

class UberPool implements Cab{//extends Cab{
	
	UberPool(){
		System.out.println(">> UberPool Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> UberPool Booked from "+source+" to "+destination);
	}
	
}

class UberGo implements Cab{//extends Cab{
	
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> UberGo Booked from "+source+" to "+destination);
	}
	
}

class UberX implements Cab{//extends Cab{
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> UberX Booked from "+source+" to "+destination);
	}
	
}

public class RTP { // Run Time Ploymorphism

	public static void main(String[] args) {
		
		//Cab cRef = new Cab();
		
		/*
		Cab cRef;
		cRef = new Cab();
		cRef.bookCab("SilverArc", "MBD");*/
		
		/*UberPool uRef;
		uRef = new UberPool();
		uRef.bookCab("SilverArc", "MBD");*/
		
		Cab cRef;
		cRef = new UberPool(); // Polymorphic Statement
		// Rule : Reference Variable of Parent can Point to Object of Child. But Vice versa inst allowed
		// Rule : Reference Variable of Interface can Point to Object which implements it. But Vice versa inst allowed
		cRef.bookCab("SilverArc", "MBD");
		
		System.out.println();
		
		cRef = new UberX();
		cRef.bookCab("SilverArc", "MBD");
		
		System.out.println();
		
		cRef = new UberGo();
		cRef.bookCab("SilverArc", "MBD");
		
		System.out.println();
		
		// Challenge : Cab Object has no purpose :(
		//cRef = new Cab(); // Direct Object Construction
		//cRef.bookCab("SilverArc", "MBD"); // :(
		
	}
	

}
