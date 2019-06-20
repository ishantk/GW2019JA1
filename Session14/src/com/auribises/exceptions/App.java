package com.auribises.exceptions;

public class App {

	public static void main(String[] args) {
		
		boolean DEBUG = false;
		
		System.out.println(">> App Started");

		int[] arr = {10, 20, 30, 40, 50};
		int a=10,b=0,c=0;
		try{
			System.out.println(">> arr[1] is: "+arr[1]);
			c = a/b;
			//System.out.println(">> Thank You !!");
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.err.println(">> Some Error Occurred: "+aRef);
			System.out.println(">> Some Error Occurred: "+aRef);
		}catch(ArithmeticException ae){
			//System.out.println(">> Some Arithmetic Error: "+ae);
			//System.out.println(">> Error: "+ae.getMessage());
			
			if(DEBUG){
				ae.printStackTrace();
			}else{
				System.out.println(">> Some Arithmetic Error !!"+ae.getMessage());
			}
		}*/
		catch(Exception e){ // RTP :)
			System.out.println(">> Error: "+e.getMessage());
		}
		finally{
			System.out.println(">> Thank You !!");
		}
	
		System.out.println(">> c is: "+c);
		
		System.out.println(">> Hello, John !! Thank You for using our App !!");
		
		System.out.println(">> App Finished");
	}
	
	// Exception : is an error at run time
	// Whenever exception will come program will terminate abnormally
	// Program i.e. App will CRASH !!

}

/*
 	
 	try{
 	
 	}catch(){
 	
 	}
 	
 	try{
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	try{
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}catch(){
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}finally{
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 	
 	
 */
