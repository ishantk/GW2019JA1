package com.auribises;

import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String[] args) {
		
		// Wrapper Classes: Used for Converting Primitives to Objects :)
		// int -> Integer
		// float -> Float
		// char -> Character
		// double -> Double
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}

//		queue.add(99);
//		queue.add(77);
		
		// (Head)10 9 8 7 6 5 4 3 2 1(Tail)
		
		// PriorityQueue will sort the data as well:
		// (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		
		/*
		// peek will tell us the head of queue
		int head = queue.peek();
		System.out.println(">> head is: "+head+" and size is: "+queue.size());
		
		// poll will remove head of queue
		queue.poll();
		head = queue.peek();
		System.out.println(">> head is: "+head+" and size is: "+queue.size());
		*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println(">> head is: "+queue.peek());
			queue.poll();
		}
	}
	
	

}
