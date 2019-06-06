
public class Conditions {

	public static void main(String[] args) {
		
		final int olaMicro = 1;   // final is a constant
		int olaMini = 2;
		int olaSedan = 3;
		int olaShare = 4;
		int olaBike = 5;
		
		int selectedTypeOfCab = olaSedan;
		
		//olaMicro = 4; // error final cannot be modified, we can make our container as read only
		
		/*
		// Ladder if/else
		if(selectedTypeOfCab == olaMicro){
			System.out.println(">> OLA Micro Cab booked. Please Pay 100.");
		}else if(selectedTypeOfCab == olaMini){
			System.out.println(">> OLA Mini Cab booked. Please Pay 150.");
		}else if(selectedTypeOfCab == olaSedan){
			System.out.println(">> OLA Sedan Cab booked. Please Pay 200.");
		}else if(selectedTypeOfCab == olaShare){
			System.out.println(">> OLA Shared Cab booked. Please Pay 75.");
		}else if(selectedTypeOfCab == olaBike){
			System.out.println(">> OLA Bike booked. Please Pay 50.");
		}else{
			System.out.println(">> Please Select Type of Cab First !!");
		}
		*/
		
		
		switch(selectedTypeOfCab){
		
			case olaMicro:
				System.out.println(">> OLA Micro Cab booked. Please Pay 100.");
				break;
				
			case 2:
				System.out.println(">> OLA Mini Cab booked. Please Pay 150.");
				break;
				
			case 3:
				System.out.println(">> OLA Sedan Cab booked. Please Pay 200.");
				break;
				
			case 4:
				System.out.println(">> OLA Shared Cab booked. Please Pay 75.");
				break;
				
			case 5:
				System.out.println(">> OLA Bike booked. Please Pay 50.");
				break;
				
			default:
				System.out.println(">> Please Select Type of Cab First !!");
				break;
	
		}
		

		
		
	}

}
