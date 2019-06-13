/*
	Relationship Mapping : HAS-A Relation
 	Use Case:
 		1 Customer Has 1 Address		   | 1 to 1
 		1 Customer Has Many Addresses      | 1 to many
 		Many Customers Have Many Addresses | many to many
 		
 	Customer
 		name
 		phone
 		email
 		
 	Address
 		adrsLine
 		city
 		state
 	
 */

class Customer{
	
	// Attributes: Non Static | Property of Object
	String name;
	String phone;
	String email;
	//Address adrs; // Has-A Relationship | 1 to 1
	Address[] adrs; // Has-A Relationship | 1 to many
	
	// Default Constructor : Which is executed when object is created
	Customer(){
		name = "NA";
		phone = "NA";
		email = "NA";
		adrs = null; // Ref Var -> let default value be null
	}
	// Parmeterized Constructor : To write data in Object at the time of creation
	// Inputs of Constructor is property of Constructor
	Customer(String name, String phone, String email, Address[] adrs){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.adrs = adrs;
		// this.name means attribute of object and name means property/input of constructor
		// this is a reference variable which will hold hashcode of current object
	}
	
	// Update Operation on Attributes of Object
	void updateCutomerDetails(String name, String phone, String email, Address[] adrs){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.adrs = adrs;
	}
	
	// Read Operation for Customer Object
	void showCustomerDetails(){
		System.out.println("=================");
		System.out.println("Name:\t"+name);
		System.out.println("Phone:\t"+phone);
		System.out.println("Email:\t"+email);
		System.out.println("=================");
		
		//adrs.showAddressDetails();
		
		for(Address a : adrs){
			a.showAddressDetails();
		}
	}
}

class Address{
	
	// Attributes: Property of Object
	String adrsLine;
	String city;
	String state;
	
	// Default Constructor
	Address(){
		adrsLine = "No Address";
		city = "Ludhiana";
		state = "Punjab";
	}
	
	Address(String adrsLine, String city, String state){
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
	}
	
	void updateAddressDetails(String adrsLine, String city, String state){
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
	}
	
	void showAddressDetails(){
		System.out.println("=================");
		System.out.println("AdrsLine:\t"+adrsLine);
		System.out.println("City:\t"+city);
		System.out.println("State:\t"+state);
		System.out.println("=================");
	}
}


public class HAS_A {

	public static void main(String[] args) {
		/*
		Customer c1 = new Customer();
		c1.updateCutomerDetails("Fionna", "+91 99999 88888", "fionna@example.com");
		c1.showCustomerDetails();
		*/
		/*
		Customer c1 = new Customer("Fionna", "+91 99999 88888", "fionna@example.com");
		c1.updateCutomerDetails("Fionna Flynn", "+91 99999 88888", "fionna.flynn@example.com");
		c1.showCustomerDetails();
		*/
		
		Address a1 = new Address("Pristine Magnum", "Bangalore", "Karnataka");
		//a1.showAddressDetails();
		Address a2 = new Address("Country Homes", "Ludhiana", "Punjab");
	
//		int a = 10;
//		int b = 20;
//		int[] arr = {a, b};
		
		Address[] adrsArr = {a1, a2}; // Array of Objects
		
//		System.out.println(">> a1 is:"+a1);
//		System.out.println(">> adrsArr[0] is:"+adrsArr[0]);
		
		//Customer c1 = new Customer("Fionna", "+91 99999 88888", "fionna@example.com", a1);
		Customer c1 = new Customer("Fionna", "+91 99999 88888", "fionna@example.com", adrsArr);
		c1.showCustomerDetails();
	}

}


// https://www.geeksforgeeks.org/sorting-algorithms/ -> Write Algos on Sorting using Arrays in Java
/*
 
 	You can use Scanner to read data from console !!
	1 Order has Many FoodItems
	
	class Order{
		
		int getTotalPrice(){
		
		}
		
		void applyPromoCode(...){
		
		}
	
		void sortFoodItems(){
		
		}
	}
	
	class FoodItem{
	}
	
	Order o1 = new Order(..);
	syso(o1.getTotalPrice());
	o1.applyPromoCode(..);
	o1.sortFoodItems(); -> display all food items on the basis of price (Asc)
	
*/