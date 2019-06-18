package com.auribises.packone;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); : Not Accessible error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); : Not Accessible error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		
	}

}

// Rule: In 1 source file we can have only 1 public class
// private : which is not accessible outside class/object
