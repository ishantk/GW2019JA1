
public class Operators {

	public static void main(String[] args) {
		
		int x = 12; 		// 1 1 0 0
		int y = 3;
		//int z = x >> y; 	// 1 1 0 0 >> 3
							// _ _ _ 1 -> 0 0 0 1 -> 1 (12 / 2pow3)
		
		int z = x << y;    // 12 -> . . . 0 0 0 0  0 0 0 0  0 1 1 0  0 0 0 0
		System.out.println(">> z is: "+z); // 96
		
		
		int actualData = z >> y;
		System.out.println(">> actual data is: "+actualData);
		
		x = -13; 			// 1 0 1 1
		y = 2;
		z = x >> y; 		// _ _ 1 0 -> 0 0 1 0
							// 1 0 1 1
							// 0 1 0 0
							//       1
							// 0 1 0 1
							// _ _ 0 1 -> 1 1 0 1
							// 1 1 0 1
							// 0 0 1 0
							//       1
							// 0 0 1 1 -> -3
		
		System.out.println(">> z is: "+z);
		
		x = 12;			// 1 1 0 0
		y = 8;			// 1 0 0 0
		int z1 = x & y;	// 1 0 0 0
		int z2 = x | y;	// 1 1 0 0
		int z3 = x ^ y; // 0 1 0 0
		System.out.println(">> z1 is: "+z1);
		System.out.println(">> z2 is: "+z2);
		System.out.println(">> z3 is: "+z3);
		

	}

}
