package com.auribises.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
 	
 	update Customer set name = 'john watson', phone = '+91 90009 90009', email='john.w@example.com' where cid = 1
 	
 	delete from Customer where cid = 2
 	
 */

/*
 	JDBC Procedure:
 	--------------
 	1. Load the Driver
 		1.1 Download type 4 Driver form MySql Website (https://dev.mysql.com/downloads/connector/j/)
 		1.2 Link Downloaded library in eclipse project
 		1.3 Use Class.forName API to load the driver in java program
 	
 	2. Create the Connection with DataBase
 		2.1 We need username and password
 		2.2 We need a url to database
 		2.3 Use API: Connection and DriverManager to create connection
 		
 	3. Create SQL Statement to be executed and Execute the same
 		3.1 Write SQL Statement using String
 		3.2 Execute SQL Statement with Statement API
 		
 	4. Close Connection	
 */


public class DBHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	
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
			
			//executeUpdate -> insert, delete and update
			int i = stmt.executeUpdate(sql); // execute SQL Statement
			System.out.println(">> 3. "+cRef.name+" Saved in DB "+i);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void updateCustomerInDB(Customer cRef){
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "update Customer set name=?, phone=?, email=? where cid=?";
			
			// 3.2 Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, cRef.name);
			pStmt.setString(2, cRef.phone);
			pStmt.setString(3, cRef.email);
			pStmt.setInt(4, cRef.cid);
			
			//executeUpdate -> insert, delete and update
			int i = pStmt.executeUpdate(); // execute SQL Statement
			System.out.println(">> 3. "+cRef.name+" Updated in DB "+i);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void deleteCustomerFromDB(int cid){
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "delete from Customer where cid=?";
			
			// 3.2 Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, cid);
			
			//executeUpdate -> insert, delete and update
			int i = pStmt.executeUpdate(); // execute SQL Statement
			System.out.println(">> 3. Customer with ID "+cid+" Deleted from DB "+i);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public ArrayList<Customer> fetchCustomersFromDB(){
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "select * from Customer";
			
			// 3.2 Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			
			// executeUpdate  -> insert, delete and update	| Write
			// executeQuery() -> select					    | Read
			
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()){
				Customer cRef = new Customer();
				cRef.cid = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				//System.out.println(cRef);
				customers.add(cRef);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
		
		return customers;
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
