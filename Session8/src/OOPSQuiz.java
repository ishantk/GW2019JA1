class Counter{
	
	// Attribute : Property of Class
	static int scount;
	
	// Attribute : Property of Object
	int count;
	// Constructor : Property of Object	 | Executed when object is created in memory
	Counter(){
		count = 1;
		scount = 1;
	}
	// Method : Business Method (Because it will have some logical instruction)
	void incrementCount(){
		count++;
		scount++;
	}
	// Read Method
	void showCounter(){
		System.out.println(">> count is: "+count+" and scount is: "+scount);
	}	

}

public class OOPSQuiz {

	public static void main(String[] args) {
	
		Counter c1 = new Counter(); // Object Construction Statement
		Counter c2 = new Counter(); // Object Construction Statement
		Counter c3 = c1; 			// Reference Copy
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c3.incrementCount();
		c3.incrementCount();
		c1.incrementCount();
		
		c2.incrementCount();
		
		Counter c4 = new Counter();
		
		c1.showCounter(); // >> count is: 6 and scount is: 8
		c2.showCounter(); // >> count is: 3 and scount is: 8
		c3.showCounter(); // >> count is: 6 and scount is: 8
		c4.showCounter(); // >> count is: 1 and scount is: 

	}

}
