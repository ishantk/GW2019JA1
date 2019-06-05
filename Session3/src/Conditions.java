
public class Conditions {

	public static void main(String[] args) {
		
		int totalBill = 100;
		
		// Regular if/else
		if(totalBill > 500){
			System.out.println(">> Flat 40% Off");
		}else{
			System.out.println(">> Sorry No Discounts");
		}

		
		boolean isInternetOn = false;
		boolean isGPSOn = false;
		
		// Nested if/else
		if(isInternetOn){
			if(isGPSOn){
				System.out.println(">> You can browse Google Maps and Navigate");
			}else{
				System.out.println(">> Please Connect to GPS and try Again");
			}
		}else{
			System.out.println(">> Please Connect to Internet and try Again");
		}
	}

}
