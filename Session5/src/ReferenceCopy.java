
public class ReferenceCopy {

	public static void main(String[] args) {
		
		int num = 10;
		int[] numbers = {10, 20, 30, 40, 50};
		
		int num1 = num; 			// Value Copy	  | Data/Value is copied
		int[] numbers1 = numbers; 	// Reference Copy | HashCode is copied
		
		System.out.println(">> num is: "+num);
		System.out.println(">> num1 is: "+num);
		System.out.println(">> numbers is: "+numbers);
		System.out.println(">> numbers1 is: "+numbers1);
		
		numbers1[3] = 111;
		numbers1[1] = 555;
		
		for(int elm : numbers){
			System.out.print(elm+"  ");
		}
		

	}

}
