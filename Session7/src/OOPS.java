/*
 	
 	OOPS : Object Oriented Programming Structure
 		   Object
 		   Class
 		   
 	Real World:
 		   Object is anything which we can see and touch
 		   Object is a Reality or Real Thing -> Real Time Entity
 		   
 		   Class is drawing of an Object
 		   
 		   What will you think of first ? Class or Object ??
 		   
 		   1. Think of Object
 		   2. Create its Drawing
 		   3. Looking into the Drawing create a Real Object
 		   
 	Computer Science:
 		   Object : Multi Value Container. Its a Box which shall contain data !!
 		   	        Homo or Hetro
 		   	        
 		   Class  : Textual Representation how an object will look like
 		   	        Description of Object
 		   	        
 		   Requirement: Create an Application where user will register. 
 		   User should be able to add food items to cart. Than make a payment.
 		   We will connect the request to Restaurant and assign a Delivery Person to deliver food item	        
 		   
 		   Model View Controller Architecture
 		   Model :  Means Data
 		   Object : Data Storage Container
 		   
 		   1. Identify Object
 		      Whatsoever term will have lot of data associated with it is an Object
 		      eg: User, FoodItem, Restaurant, Payment, DeliverPerson etc..
 		      		 		      		
 		   2. Think of Object 
 		   		User
 		   			name
 		      		phone
 		      		email
 		      		gender
 		      		age
 		      		address
				User is an Object and data associated is called its attributes
					
 		   3. Draw Object i.e. Create its class -> Textual Representation
 		   
 		   4. Create a Real Object from Class
 	
 */

// Textual Representation of Object
// What you need in your object, you write in class !!
class User{
	// Attributes: Property of User Object and not of class
	String name;
	long phone;
	String email;
	byte age;
	char gender;
	String address;
	
	// Methods: Property of User Object and not of class
	// non static method is property of Object
	// For Write Operation
	void setDetailsOfUser(String n, long p, String e, byte a, char g, String ad){
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	// For Read Operation
	void showDetailsOfUser(){
		System.out.println("==========================");
		System.out.println("Name:\t"+name);
		System.out.println("Phone"+phone);
		System.out.println("Eamil:\t"+email);
		System.out.println("Age:\t"+age);
		System.out.println("Gender:\t"+gender);
		System.out.println("Address:\t"+address);
		System.out.println("==========================");
	}
}

class FoodItem{
	String name;
	String desription;
	int price;
	char type;
}

public class OOPS {

	public static void main(String[] args) {
		
		int i = 10;
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// Object Construction Statement
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy
		
		// uRef1, uRef2 and uRef3 are Reference Variables and contains HashCode of Object
		// new creates object which is a container in the Heap Area at Run Time 
		
		System.out.println(">> i is: "+i);
		System.out.println(">> arr is: "+arr);
		System.out.println(">> uRef1 is: "+uRef1);
		System.out.println(">> uRef2 is: "+uRef2);
		System.out.println(">> uRef3 is: "+uRef3);
		
		//1. Write Data in Object
		/*uRef1.name = "John";
		uRef1.phone = 9999988888l;
		uRef1.email = "john@example.com";
		uRef1.age = 30;
		uRef3.gender = 'M';
		uRef3.address = "Redwood Shores";
		
		uRef2.name = "Fionna";
		uRef2.phone = 9999977777l;
		uRef2.email = "fionna@example.com";
		uRef2.age = 33;
		uRef2.gender = 'F';
		uRef2.address = "Country Homes";*/
		
		uRef1.setDetailsOfUser("John", 9999988888l, "john@example.com", (byte)30, 'M', "Redwood Shores");
		uRef2.setDetailsOfUser("Fionna", 9999977777l, "fionna@example.com", (byte)33, 'F', "Country Homes");
		
		// 2. Update Data in Object
		uRef1.name = "John Watson";
		uRef2.name = "Fionna Flynn";
		
		// 3. Read Data from Object
		//System.out.println(uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		uRef1.showDetailsOfUser();
		uRef2.showDetailsOfUser();
		
		// 4. Delete Operation
		// Objects are deleted automatically in Java by Garbage Collector which is in JVM
	}
	

}
