/*
class Parent{
	// Rule:Constructor will be executed when object will be created in memory !!
	Parent(){
		System.out.println(">> Parent Object Constructed");
	}
}

class Child extends Parent{ // extends -> Relationship | Inheritance
	Child(){
		System.out.println(">> Child Object Constructed");
	}
}*/

// Whatever we write in Parent Class is actually property of Object
// if anything in class is marked as static is porperty of class
class Parent{
	
	// Attributes: Property of Parent Object | non static 
	String fname;
	String lname;
	int money;
	
	Parent(){
		System.out.println(">> Parent Object Constructed");
	}
	
	// Method : Property of Parent Object | non static
	void setDetails(String fname, String lname, int money){
		this.fname = fname;
		this.lname = lname;
		this.money = money;
	}
	
	void showDetails(){
		System.out.println("******************");
		System.out.println(">> Name: "+fname+" "+lname);
		System.out.println(">> Money: "+money);
		System.out.println("******************");
	}
}

class Child extends Parent{ // extends -> Relationship | Inheritance
	
	String fname;
	String lname;
	//int money;
	
	Child(){
		System.out.println(">> Child Object Constructed");
	}
	
	// Overriding
	void setDetails(String fname, String lname, int money){
		super.setDetails("George", lname, 200000);
		this.fname = fname;
		this.lname = lname;
		//this.money = money;
	}
	
	// Overriding
	void showDetails(){
		super.showDetails();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(">> Name: "+fname+" "+lname);
		System.out.println(">> Money: "+money);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
	}
}


public class ISA {

	public static void main(String[] args) {
	
		//Parent pRef = new Parent();
		Child cRef = new Child();
		
		// Rule1 : When we give command to create object of Child, 
		//         Object of Parent is created before Object of child in memory

		cRef.setDetails("John", "Watson", 100000);
		
		// Rule2 : Whatsoever is in Parent Object can be accessed by Child Object
		//         If something is private in Parent Object that Child cannot access
		
		cRef.showDetails();
		
		// Rule3 : If Child has attribute or method which is in the Parent as well
		//		   In this case, Child will access its own attributes or methods
	}

}
