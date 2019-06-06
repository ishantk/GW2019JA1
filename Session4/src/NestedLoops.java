
public class NestedLoops {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++){
			
			//System.out.println(">> i is: "+i);
			
			for(int j=1;j<=i;j++){
				//System.out.println(">> j is: "+j);
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		

	}
	
	/*
	 	1 
	    2 3 
		3 4 5
		5 6 7 8
		8 9 10 11 12 
	 */

}
