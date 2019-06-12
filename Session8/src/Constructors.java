/*
 	Order
 		oid
 		name
 		restaurant
 		price
 */

class Order{
	
	// Attributes: Property of Object
	int oid;
	String name;
	String restaurant;
	int price;
	
	// Special Method : Property of Object
	// Default Constructor
	// So that we can provide some initial values to the attributes of our Objects
	Order(){
		oid = 1;
		name = "NA";
		restaurant = "NA";
		price = 100;
	}
	
	// Parameterized Constructor
	Order(int o, String n, String r, int p){
		oid = o;
		name = n;
		restaurant = r;
		price = p;
	}
	
	// Method : Property of Object
	void showOrderDetails(){
		System.out.println(">> Thank You "+name+" for placing Order from "+restaurant);
		System.out.println(">> You Order id is: "+oid+". Please Pay ₹"+price);
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		Order oRef1 = new Order();
		/*oRef1.oid = 101;
		oRef1.name = "John";
		oRef1.restaurant = "ABC";
		oRef1.price = 200;*/
		Order oRef2 = new Order();
		Order oRef3 = new Order(201, "Fionna", "XYZ", 500);
		
		oRef1.showOrderDetails();
		oRef2.showOrderDetails();
		oRef3.showOrderDetails();
	}

}
