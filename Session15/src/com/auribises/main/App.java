package com.auribises.main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.auribises.model.Customer;

public class App {

	public static void main(String[] args) {
		
		
		Customer cRef = new Customer();
		
		Scanner sRef = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name: ");
		cRef.name = sRef.nextLine();
		
		System.out.println(">> Enter Customer Phone: ");
		cRef.phone = sRef.nextLine();
		
		System.out.println(">> Enter Customer Email: ");
		cRef.email = sRef.nextLine();
		
		System.out.println(">> Customer Details:");
		System.out.println(cRef.toCSV());
		
		
		// Problem : When Object is created in memory it is in RAM
		//  	 	 Data in object and object itself is temporarily available
		//			 When Program will finish, data will be lost i.e. Object will be deleted from memory
		
		// Solution:
		// Persistence :) -> Saving data of Object :)
		// Save Object's Data somewhere:
		// 1. Files
		// 2. DataBase
		
		System.out.println(">> Would you like to save "+cRef.name+"? yes/no: ");
		String choice = sRef.nextLine();
		
		if(choice.equals("yes")){
			try {
				//   D:\\training\\java\\
				File file = new File("/Users/ishantkumar/Downloads/customers.csv");
				//FileWriter writer = new FileWriter(file);
				FileWriter writer = new FileWriter(file, true); // true means append mode
				
				String data = cRef.toCSV();
				writer.write(data);
				
				writer.close(); // Release memory Resources
				System.out.println(">> File Written with Data");
				
				/*if(file.exists()){
					System.out.println(file.getName()+" exists");
				}else{
					System.out.println(file.getName()+" does not exist");
				}*/
				
			} catch (Exception e) {
				System.out.println(">> Some Error: "+e);
			}
		
		}
	}

}
