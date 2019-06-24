package com.auribises;

/*
class MyTask{
	
	void executeTask(){
		for(int i=1;i<=100;i++){
			System.out.println("** Printing LearningPython.pdf Page#"+i);
		}
	}
}*/

class MyTask extends Thread{ // MyTask IS-A Thread
	// run is a method which we need to override
	// all tasks to be executed by child thread must be written in run method
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("** Printing LearningPython.pdf Page#"+i);
		}
	}
}

class CA{
	
}

// Multiple Inheritance is not Supported
//class YourTask extends CA, Thread{ // error
class YourTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("@@ Printing LearningGo.pdf Page#"+i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		// Task1
		System.out.println(">> App Started");
		
		// Task 1.5
		MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r);
		
		mRef.setDaemon(true);
		
		Thread.currentThread().setName("John");
		mRef.setName("Fionna");
		yRef.setName("Leo");
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 10
		mRef.setPriority(Thread.MIN_PRIORITY);  // 1
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start(); // Internally execute run method
		
		try {
			mRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		yRef.start();
				
		// Task2
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> Printing LearningJava.pdf Page#"+i);
		}
		
		System.out.println("== main thread name: "+Thread.currentThread().getName());	
		System.out.println("== MyTask name is: "+mRef.getName());
		System.out.println("== YourTask name is: "+yRef.getName());
		
		System.out.println("== main thread priority: "+Thread.currentThread().getPriority());	
		System.out.println("== MyTask priority is: "+mRef.getPriority());
		System.out.println("== YourTask priority is: "+yRef.getPriority());
		
		// Task3
		System.out.println(">> App Finished");

	}

}
