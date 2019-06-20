package com.auribises.exceptions;

/*
 	java.lang or may be some other package in java
 	
 	Throwable
 		- Error 		-> Memory eg. StackOverflow -> Cannot be Handled
 		- Exception 	-> Can be Handled
 			
 			- RuntimeException
 				-ArrayIndexOutOfBoundsException
 				-ArithmeticException
 				-NullPOinterException
 				.
 				...
 			- IOException
 				- FileNotFoundException
 				.
 				..
 			- SQLException
 			.
 			..
 			....
 			
 			PS: RuntimeException and all its children are known as UNCHECKED EXCEPTIONS
 				Other than everyone is a CHECKED EXCEPTION
 	
 */


// User-Defined Exception - UNCHECKED Exception :)
class MyBankingException extends RuntimeException{ // IS-A
	MyBankingException(String message){
		super(message); // To show the message on Console
	}
}

//User-Defined Exception - CHECKED Exception :)
class YourBankingException extends Exception{ // IS-A
	YourBankingException(String message){
		super(message); // To show the message on Console
	}
}

class BankAccount{
	
	// Attribute
	int balance = 10000;
	int minAttempts = 0;
	
	void withdraw(int amount) throws YourBankingException{
		
		balance = balance - amount;
		
		if(balance<0){
			balance = balance + amount;
			System.out.println(">> Sorry !! You cannot Withdraw. Balance is LOW: "+balance);
			minAttempts++;
		}else{
			System.out.println(">> New Balance after withdrawl is: Rs."+balance);
		}
		
		if(minAttempts == 3){
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts");
			//throw aRef; // Throwing an Exception tp CRASH the Program
			
			// UNCHECKED
			//MyBankingException mRef = new MyBankingException("Illegal Attempts");
			//throw mRef;

			// CHECKED
			YourBankingException yRef = new YourBankingException("Illegal Attempts");
			throw yRef;
		}
	}
	
}

public class Banking {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");

		BankAccount bRef = new BankAccount();
		
		try{
			for(int i=0;i<1000;i++){
				bRef.withdraw(3000);
			}
		}//catch(YourBankingException yRef){
		catch(Exception yRef){ // RTP
			System.out.println(">> Some Exception "+yRef.getMessage());
		}
		
		System.out.println(">> Banking Finished");
	}

}
