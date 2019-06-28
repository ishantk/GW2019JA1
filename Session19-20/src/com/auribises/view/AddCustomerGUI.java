package com.auribises.view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribises.controller.DBHelper;
import com.auribises.model.Customer;

public class AddCustomerGUI implements ActionListener{
	
	// Created HAS-A Relationship
	// These are all Reference Variables:
	
	//Frame fr;
	JFrame fr;
	
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlButton, pnlAll;
	
	JLabel lblTitle, lblName, lblPhone, lblEmail;
	
	JTextField txtName, txtPhone, txtEmail;
	
	JButton btnAddCustomer;
	
	public AddCustomerGUI() {
		fr = new JFrame("Add Customer");
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlEmail = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
		lblTitle = new JLabel("Enter Customer Details");
		
		lblName = new JLabel();
		lblName.setText("Enter Customer Name");
		
		lblPhone = new JLabel("Enter Customer Phone");
		lblEmail = new JLabel("Enter Customer Email");
		
		txtName = new JTextField(16);
		txtPhone = new JTextField(16);
		txtEmail = new JTextField(16);
		
		btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(this);
	}
	
	public void showGUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlButton.add(btnAddCustomer);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhone);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		fr.setSize(400, 400);
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Customer cRef = new Customer();
		cRef.name = txtName.getText();
		cRef.phone = txtPhone.getText();
		cRef.email = txtEmail.getText();
		
//		System.out.println(">> Button Clicked");
		System.out.println(cRef);
		
		// Driver Loaded
		DBHelper db = new DBHelper();
		// Connection Created
		db.createConenction();
		// Write and Execute SQL Statement
		db.saveCustomerInDB(cRef);
		// Close the Connection
		db.closeConnection();
	}

}
