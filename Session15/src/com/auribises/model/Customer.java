package com.auribises.model;

public class Customer {

	// Attributes: Property of Object
	public String name;
	public String phone;
	public String email;
	
	public Customer(){
		name = "NA";
		phone = "NA";
		email = "NA";
	}
	
	public Customer(String name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String toCSV(){
		return name+","+phone+","+email+"\n";
	}
}
