
public class NDArrays {

	public static void main(String[] args) {
		
		int[][] a1 = {
						{10, 20},
						{10, 20, 30},
						{10, 20, 40, 50}
					 };

		// Create a 2-D Array in memory either 3 Arrays having 3 elements each
		// and all the elements will have 0 value
		int[][] a2 = new int[3][3];
		
		a2[0][1] = 11;
		
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] a3 = new int[3][];
		a3[0] = new int[5];
		a3[1] = new int[10];
		a3[2] = new int[8];
		
		for(int i=0;i<a3.length;i++){
			for(int j=0;j<a3[i].length;j++){
				System.out.print(a3[i][j]+"  ");
			}
			System.out.println();
		}
	}

}











