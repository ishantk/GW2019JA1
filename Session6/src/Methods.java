/*
 	Method or Function or Procedure or Routine
 	f(x) = x*x
 	f(2) = 4
 	sin(x)
 	
 	In our program we can create functions to solve problems:
 	Syntax : Ack FunctionName(Inputs){
 				definition
 			 }
 			 
 			 // void -> No Ack
 			 void payMoney(int amount, int uid){
 			 	//...
 			 }
 			 
 			 boolean payMoney(int amount, int uid){
 			 	//...
 			 	return true;
 			 }
 			 
 			 In a Program, we have small logics which do a desired task.
 			 And this task is suppose to be done repeatedly.
 			 We can create a Method do solve this problem.
 			 
 			 With Methods we achieve Modularization
 	
 */

public class Methods {
	
	// Creating Functions/Methods: Within the Class
	/*
	// Non Static
	void addNumbers(int num1, int num2){
		int sum = num1 + num2;
		System.out.println(">> sum is: "+sum);
	}
	
	// Static
	static void addNumbersAgain(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("** sum is: "+sum);
	}
	*/
	
	// Non Static
	int addNumbers(int num1, int num2){
		int sum = num1 + num2;
		//System.out.println(">> sum is: "+sum);
		return sum;
	}
	
	// Static
	static int addNumbersAgain(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("** sum is: "+sum);
		return 1;
	}	
	
	// Whenever we execute our program main is executed
	// Whatever we write in main is executed in a sequence
	public static void main(String[] args) {
		/*
		int num1 = 10;
		int num2 = 20;
		
		int sum = num1 + num2;
		System.out.println("sum is: "+sum);
		
		num1 = 12;
		num2 = 30;
		sum = num1 + num2;
		System.out.println("sum is: "+sum);
		
		num1 = 22;
		num2 = 39;
		sum = num1 + num2;
		System.out.println("sum is: "+sum);
		*/
		
		//1. Execution(Calling) of Non Static Method
		// We need object of class
		//int[] a1 = new int[5];	  // Array Construction Statement
		Methods mRef = new Methods(); // Object Construction Statement
		int ack = mRef.addNumbers(10, 20);
		//System.out.println("## Ack is:"+ack);
		
		//if(ack==100){
			System.out.println(">> Your Sum Operation is scuccessfully completed and sum is: "+ack);
		//}
		
		mRef.addNumbers(11, 22);
		mRef.addNumbers(-12, 99);
		
		//2. Execution(Calling) of Static Method
		// We don't need objects here
		Methods.addNumbersAgain(11, 19);
		Methods.addNumbersAgain(17, 90);
	}

}
