package com.auribises;

class Point{
	int x, y;
	
	// finalize will be executed when object will be deleted from memory
	protected void finalize() throws Throwable {
		System.out.println(">> Object Deleted with "+x+" and "+y+" values");
	}

}

class MyThread extends Thread{
	public void run(){
		System.out.println(">> MyThread Executed :) ");
	}
}

public class RTE {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		Point p2 = new Point();
		p2.x = 100;
		p2.y = 200;
		
		MyThread mRef = new MyThread();
		
		Runtime rt = Runtime.getRuntime(); // Reference to JVM
		System.out.println("Free Memeory: "+rt.freeMemory());
		System.out.println("Max Memeory: "+rt.maxMemory());
		System.out.println("Total Memeory: "+rt.totalMemory());
		
		rt.addShutdownHook(mRef);
		
		System.out.println();
		
		p1 = null;
		p2 = null;
		
		System.out.println(">> GC in Execution");
		rt.gc(); // Garbage Collector Execution
		
		//System.gc();
		
		System.out.println();
		
		System.out.println("Free Memeory: "+rt.freeMemory());
		System.out.println("Max Memeory: "+rt.maxMemory());
		System.out.println("Total Memeory: "+rt.totalMemory());
		
		System.out.println(">> App Finished");
		
	}

}
