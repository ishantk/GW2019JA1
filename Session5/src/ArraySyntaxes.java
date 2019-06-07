
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// 1. Bracket Before
		int[] a1 = {10, 20, 30, 40, 50};	// Implicit Statement
		
		// 2. Bracket After
		int a2[] = {40, 50, 60, 70, 80};
		
		// 3. with new keyword
		int[] a3 = new int[]{10, 20, 30, 40, 50}; // Explicit Statement
		// new int[] is a request to JVM to create a new array in the Heap at Run Time
		// Further, return a HashCode of created array in heap and store it in a3
		
		// 4. with size
		int[] a4 = new int[10]; // Create an Array with 10 integers having all as value 0
		
		a4[1] = 111;
		a4[9] = 999;
		
		a4[10] = 1000; // Not a compiler error. Run Time Error : Exception
		
		for(int elm : a4){
			System.out.print(elm+"  ");
		}
		
		

	}

}
