package main;

import ArrayQueue.ArrayQueue;

public class mainClass {

	public static void main(String[] args) {


		//qeueue==	FIFO
		//stack	==	FILO
		
		ArrayQueue queue = new ArrayQueue(10);
		
		if(queue.isEmpty()) {
			
			String str = "Tigers";
			queue.push(str);
			
			String s = (String)queue.peek();
			System.out.println("front == "+s);
			
			queue.push("Lions");
			s = (String)queue.peek();
			System.out.println("front == "+s);
			
			queue.pop();
			s = (String)queue.peek();
			System.out.println("front == "+s);
			
		}

	}

}
