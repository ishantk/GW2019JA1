
public class BreakAndContinue {

	public static void main(String[] args) {
	
		int myFloor = 5;
		
		for(int i=1;i<=10;i++){
			System.out.println(">> Floor #"+i);
			
			if(i == myFloor){
				System.out.println(">> I am on my Floor5 :)");
				break; // break will terminate the loop
			}
			
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i++){
			
			if(i<5){
				continue; // continue skips the statements below and moves to next iteration
			}
			
			System.out.println("i is: "+i);
		}
		
		// HW: Explore break and continue in NESTED LOOPS

	}

}
