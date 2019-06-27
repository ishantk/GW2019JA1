package com.auribises.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.auribises.model.Customer;

//DataBase : ORM | Object Relational Mapping
		// Class Name -> Table Name
		// Attributes -> Column Names
/*
 	
 	public class Customer {
		// Attributes: Property of Object
		public int cid;
		public String name;
		public String phone;
		public String email;
	}
 	
 	create table Customer(
 		cid int primary key auto_increment,
 		name varchar(256),
 		phone varchar(20),
 		email varchar(256)
 	)
 	
 	// SQL Command/Query to add data in table
 	insert into Customer values(null, 'john', '+91 99999 88888', 'john@example.com')
 	
 */

/*
 	JDBC Procedure:
 	--------------
 	1. Load the Driver
 		1.1 Download type 4 Driver form MySql Website (https://dev.mysql.com/downloads/connector/j/)
 		1.2 Link Downloaded library in eclipse project
 		1.3 Use Class.forname API to load the driver in java program
 	
 	2. Create the Connection with DataBase
 		2.1 We need username and password
 		2.2 We need a url to database
 		2.3 Use API Connection and DriverManager to create connection
 		
 	3. Create SQL Statement to be executed and Execute the same
 		3.1 Write SQL Statement using String
 		3.2 Execute SQL Statement with Statement API
 		
 	4. Close Connection	
 */


public class DBHelper {
	
	Connection con;
	Statement stmt;
	
	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void createConenction(){
		try {
			String user = "root";
			String password = "";
			//String url = "jdbc:mysql://localhost/auridb?serverTimezone=UTC"; // For server timezone errors :)
			String url = "jdbc:mysql://localhost/auridb";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void saveCustomerInDB(Customer cRef){
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "insert into Customer values(null, '"+cRef.name+"', '"+cRef.phone+"', '"+cRef.email+"')";
			// 3.2 Execute SQL Statement
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println(">> 3. "+cRef.name+" Saved in DB "+i);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}

}
