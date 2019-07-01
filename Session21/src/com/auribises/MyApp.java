package com.auribises;

class YourApp{

	//String[] args -> Command Line Arguments
	public static void main(String[] args) {
	
		System.out.println("Hello World");
		//System.out.println(args[0]);

		for(String data : args){
			System.out.println(data);			
		}

	}
}