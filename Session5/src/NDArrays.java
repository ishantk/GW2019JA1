
public class NDArrays {

	public static void main(String[] args) {
	
		// Array of Arrays and not a MATRIX
		// We can represent Matrix with Array of Arrays
		int[][] arr = {
						{10, 20, 30},			// 0
						{10, 20},				// 1
						{10, 20, 30, 40, 50},	// 2
						{10, 20, 30, 40},		// 3
						{10}					// 4
					  };
		
		System.out.println("arr is: "+arr+" and length is: "+arr.length);
		//System.out.println("arr[0] is: "+arr[0]+" and length is: "+arr[0].length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"] is: "+arr[i]+" and length is: "+arr[i].length);
		}
		
		System.out.println(">> arr[1] is: "+arr[1]);		// HashCode
		System.out.println(">> arr[1][1] is: "+arr[1][1]);  // 20 
		
		// arr -> Reference Variable which refers to an Array
		// That Array is containing References which further points to Arrays
		
		System.out.println("=======");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){ // i:0, j:3 | i:1, j:2 | i:2, j:5 ....
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("=======");
		
		System.out.println("=======");
		for(int[] ar : arr){
			for(int elm : ar){
				System.out.print(elm+"  ");
			}
			System.out.println();
		}
		System.out.println("=======");

		int[][][] array = {
							{
								{10, 20, 30},			// 0
								{10, 20},				// 1
								{10, 20, 30, 40, 50},	// 2
								{10, 20, 30, 40},		// 3
								{10}					// 4
						   },
						
							{
								{10, 20, 30},			// 0
								{10, 20},				// 1
								{10, 20, 30, 40, 50},	// 2
								{10, 20, 30, 40},		// 3
								{10}					// 4
							}
						};
		
		System.out.println("array is: "+array+" and length is "+array.length);
		// HW : Draw the same array in memory
		//		Read 3-D Array
		//      Apply/Explore Enhanced For Loop on N-D Arrays :)
		// N-D Array is collection of n-1 D Arrays
		
		
		
	}

}
