package com.auribises;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyGUI implements ActionListener, WindowListener, MouseListener, MouseMotionListener, FocusListener{
	
	// Created HAS-A Relationship
	// These are all Reference Variables:
	
	//Frame fr;
	JFrame fr;
	
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlButton, pnlAll;
	
	JLabel lblTitle, lblName, lblPhone, lblEmail;
	
	JTextField txtName, txtPhone, txtEmail;
	
	JButton btnAddCustomer;
	
	public MyGUI() {
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
		
		txtName.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnAddCustomer = new JButton("Add Customer");
		//btnAddCustomer.addActionListener(this);
		
		//MyListener lRef = new MyListener();
		//btnAddCustomer.addActionListener(lRef);
		
		
		// Anonymous Class
		// new ActionListener() -> This is an Object of Interface But this is not !!
		// Definition of Anonymous Class
		/*
		ActionListener lRef = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">> Button Clicked");
				
			}
		};
		
		
		btnAddCustomer.addActionListener(lRef);
		*/
		
		btnAddCustomer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">> Button Clicked");
			}
		});
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
		
		//fr.add(pnlAll);
		
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		
		fr.setSize(400, 400);
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(">> Button Clicked");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
		System.out.println(">> Mouse Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(">> Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(">> Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Mouse Moved: "+e.getX()+":"+e.getY());
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class MyListener  implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(">> Button Clicked");
	}
	
}


public class ListenersApp {

	public static void main(String[] args) {

		MyGUI mRef = new MyGUI();
		mRef.showGUI();
		

	}

}
