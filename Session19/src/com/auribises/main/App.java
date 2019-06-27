package com.auribises.main;

import java.util.Scanner;

import com.auribises.controller.DBHelper;
import com.auribises.model.Customer;

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
		
		// Driver Loaded
		DBHelper db = new DBHelper();
		// Connection Created
		db.createConenction();
		db.saveCustomerInDB(customer);
		db.closeConnection();
		
	}

}
