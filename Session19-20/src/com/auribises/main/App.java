package com.auribises.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.auribises.controller.DBHelper;
import com.auribises.model.Customer;
import com.auribises.view.AddCustomerGUI;

public class App {

	public static void main(String[] args) {
		
		/*
		
		// Write Data directly in attributes
		Customer cRef1 = new Customer();
		cRef1.cid = 0;
		cRef1.name = "John";
		cRef1.phone = "+91 99999 88888";
		cRef1.email = "john@example.com";

		// Used Setter Method to write Data in attributes
		Customer cRef2 = new Customer();
		cRef2.setCid(0);
		cRef2.setName("Fionna");
		cRef2.setPhone("+91 98765 98765");
		cRef2.setEmail("fionna@example.com");
		
		// Used Constructor to write Data in attributes
		Customer cRef3 = new Customer(0, "Leo", "+91 90909 90909", "leo@example.com");

		System.out.println(">> cRef1 Details:");
		System.out.println(cRef1);
		
		System.out.println();
		
		System.out.println(">> cRef2 Details:");
		System.out.println(cRef2);
		
		System.out.println();
		
		System.out.println(">> cRef3 Details:");
		System.out.println(cRef3);
		
		*/
		
		/*
		Customer customer = new Customer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name: ");
		customer.name = scanner.nextLine();
		
		System.out.println(">> Enter Customer Phone: ");
		customer.phone = scanner.nextLine();
		
		System.out.println(">> Enter Customer Email: ");
		customer.email = scanner.nextLine();
		
		System.out.println(">> Customer Details: ");
		System.out.println(customer);
		
		
		// Problem : Data in Objects is temporary !!
		// Persistence : Save the state of an Object
		// Solution: 1. Files
		// 			 2. DataBase | Data will be stored Permanently
		// DataBase : ORM | Object Relational Mapping
		// Class Name -> Table Name
		// Attributes -> Column Names
		
		System.out.println(">> Would you like to Save "+customer.name+" ? (yes/no)");
		String choice = scanner.nextLine();
		
		if(choice.equals("yes")){	
			// Driver Loaded
			DBHelper db = new DBHelper();
			// Connection Created
			db.createConenction();
			// Write and Execute SQL Statement
			db.saveCustomerInDB(customer);
			// Close the Connection
			db.closeConnection();
		}
		*/
		
		/*
		Customer customer = new Customer(2, "Fionna Flynn", "+91 90000 80000", "fionna.flynn@example.com");
		System.out.println(">> Customer Details: ");
		System.out.println(customer);*/
		
		/*
		DBHelper db = new DBHelper();
		db.createConenction();
		//db.updateCustomerInDB(customer);
		
		//db.deleteCustomerFromDB(2);
		ArrayList<Customer> customersList = db.fetchCustomersFromDB();
		
		System.out.println(">> Viewing "+customersList.size()+" Customers:");
		for(Customer cRef : customersList){
			System.out.println(cRef);
		}
		
		
		db.closeConnection(); 
		*/
		
		AddCustomerGUI gui = new AddCustomerGUI();
		gui.showGUI();
		
		
	}
	
	

}
