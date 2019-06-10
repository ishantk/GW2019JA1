
public class ValueVsRef {

	static void squareOfNum(int num){ // Passing Value (Copying the Data)
		num = num * num;
		System.out.println(">> num is: "+num);
	}
	
	static void squareOfNumbers(int[] nums){ // Passing Reference (Copying the HashCode)
		System.out.println(">> nums is:"+nums);
		for(int i=0;i<nums.length;i++){
			nums[i] = nums[i]*nums[i];
		}
	}
	
	public static void main(String[] args) {
		
		int number = 10;
		
		//ValueVsRef.squareOfNum(number);
		squareOfNum(number); // only if main and squareOfNum is in the same class
		
		System.out.println(">> number is: "+number);
		
		int[] arr ={1, 2, 3, 4, 5};
		System.out.println(">> arr is:"+arr);
		squareOfNumbers(arr);
		
		for(int elm : arr){
			System.out.print(elm+"  ");
		}

	}

}
