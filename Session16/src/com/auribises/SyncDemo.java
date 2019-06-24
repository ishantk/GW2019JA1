package com.auribises;

class Printer{
	
//	synchronized void printDocument(String name, int copies){
	void printDocument(String name, int copies){
		// Lock will be acquired by a thread when execution will start
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+name+" Copy#"+i);
		}
		// Lock will be released by a thread when execution will finish
	}
	
	//synchronized void showInkStatus(){
	void showInkStatus(){
		System.out.println(">> Ink Status is 80%");
	}
	
}

class Laptop extends Thread{
	
	Printer pRef; // HAS-A
	
	Laptop(Printer p){
		pRef = p;
	}
	
	public void run(){
		synchronized (pRef) {
			
			try {
				pRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			pRef.printDocument("**JohnsProfile.pdf**", 100);
			pRef.showInkStatus();
		}
	}
}

class Desktop extends Thread{
	
	Printer pRef; // HAS-A
	
	Desktop(Printer p){
		pRef = p;
	}
	
	public void run(){
		
		synchronized (pRef) {
			pRef.printDocument("##FionnaProfile.pdf##", 10);
			
			pRef.notify();
			//pRef.notifyAll();
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		Printer pRef = new Printer();
		//pRef.printDocument("**JohnsProfile.pdf**", 10);
				
		Laptop lRef = new Laptop(pRef);
		Desktop dRef = new Desktop(pRef);
		
		lRef.start();
		dRef.start();
		
		System.out.println(">> App Finished");
	}

}

// Assignment : Implement Stack DataStructure with Arrays in Java
// 				Create 2 threads: 1. PushThread which adds data 
//								  2. PopThread which removes data
//				Producer Consumer Problem