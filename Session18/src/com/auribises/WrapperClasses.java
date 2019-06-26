package com.auribises;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitives: They hold value
		int i = 10;
		char c = 'A';
		double d = 2.2;
		
		// We can convert a primitive into an Object
		// BOXING
		Integer iRef = new Integer(i);
		Character cRef = new Character(c);
		Double dRef = new Double(d);
		
		System.out.println("iRef is: "+iRef);
		
		// AUTO-BOXING
		Integer iRef1 = i; // -> Integer iRef1 = new Integer(i);
		Character cRef1 = c;
		Double dRef1 = d;
		
		
		// Extracting primitive from Object
		// UNBOXING
		int j = iRef.intValue();
		char ch = cRef.charValue();
		double e = dRef.doubleValue();
		
		// AUTO-UNBOXING
		int j1 = iRef;
		char ch1 = cRef;
		double e1 = dRef;

	}

}
