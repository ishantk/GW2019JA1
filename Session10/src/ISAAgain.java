class Product{
	
	// Property of Parent Object
	int pid;
	String name;
	String brandName; // private String brandName; | Will not be accessible by Child now !!
	int price;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setProductDetails(int pid, String name, String brandName, int price){
		System.out.println(">> Product setProductDetails");
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	
	void showProductDetails(){
		System.out.println(">> Product showProductDetails");
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println("Pid: "+pid+" Name: "+name);
		System.out.println("Brand: "+brandName);
		System.out.println("Price: "+price);
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
	}
	
}

class Mobile extends Product{

	// Attributes: Property of Child Object
	int pid;
	String name;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setProductDetails(int pid, String name, String brandName, int price){
		System.out.println(">> Mobile setProductDetails");
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	
	void showProductDetails(){
		System.out.println("** Mobile showProductDetails");
		System.out.println("*********************");
		System.out.println("Pid: "+pid+" Name: "+name);
		System.out.println("Brand: "+brandName);
		System.out.println("Price: "+price);
		System.out.println("*********************");
	}
	
}


public class ISAAgain {

	public static void main(String[] args) {
		
		Mobile mRef = new Mobile();
		
		System.out.println();
		
		mRef.setProductDetails(101, "iPhoneX", "Apple", 60000);
		
		System.out.println();
		
		mRef.showProductDetails();
	}

}
