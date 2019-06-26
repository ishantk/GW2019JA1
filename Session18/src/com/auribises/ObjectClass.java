package com.auribises;

class MyInteger{// extends Object{
	
	int x;
	
	MyInteger(int i) {
		x = i;
	}
	
	int intValue(){
		return x;
	}
	
	public String toString(){
		return String.valueOf(x);
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		
		int i = 10;
		MyInteger mRef = new MyInteger(i);
		System.out.println(">> mRef intValue gives: "+mRef.intValue());
		System.out.println(">> mRef is: "+mRef);
		
		System.out.println(">> mRef hashcode is:"+mRef.hashCode());
		System.out.println(">> mRef type is: "+mRef.getClass());
		System.out.println(">> mRef type is: "+mRef.getClass().getSimpleName());

	}

}
