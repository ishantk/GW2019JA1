package com.auribises.model;

// Model or Bean or POJO (Plain Old Java Object)
public class Customer {

	// Attributes: Property of Object
	public int cid;
	public String name;
	public String phone;
	public String email;
	
	public Customer() {
	}

	public Customer(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override // Annotation
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
