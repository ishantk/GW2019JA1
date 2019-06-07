
public class MVC {

	public static void main(String[] args) {
		
		// Single Value Container
		int num = 10;
		
		// Multi Value Container: Array
		// Arrays are Homogeneous
		int[] numbers = {10, 20, 30, 40, 50};
		
		// Read Containers:
		System.out.println(">> num is: "+num);
		System.out.println(">> numbers is: "+numbers);
		
		// num contains value -> Primitive
		// number contains HashCode -> Reference -> numbers is a Reference Variable
		
		// Update Data in MVC
		numbers[1] = 222;

		// Read Data
		System.out.println(">> numbers[1] is: "+numbers[1]);
		System.out.println(">> numbers[3] is: "+numbers[3]);
		
		System.out.println(">> size of numbers is: "+numbers.length);
		
		// Read All
		/*for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+"  ");
		}*/
		
		// Enhanced For Loop / For-Each Loop
		for(int elm : numbers){
			System.out.print(elm+"  ");
		}
	}

}
