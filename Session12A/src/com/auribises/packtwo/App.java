package com.auribises.packtwo;

import com.auribises.packone.One; // import is used to access a class in some other packge
//import com.auribises.packone.Two; // err : default class cannot be imported 

// Package Level Inheritance
class Three extends One{
	
	void show(){
		protShow(); // Indirectly
		//defShow(); err
		//pvtShow(); err
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		
		//oRef.pvtShow(); : Not Accessible error
		//oRef.defShow(); : err
		//oRef.protShow();: err
		//oRef.pubShow(); : OK
		
		
		Three tRef = new Three();
		tRef.pubShow();
		//tRef.protShow(); // err Directly not Accessible
		
	}

}

// default 		: is accessible only within the package
// protected 	: is accessible only within the package. 
//				  protected is accessible by the child after inheritance relationship outside the package
// public  		: is accessible within the package and outside the package also

// 1. private 
// 2. default
// 3. protected
// 4. public
