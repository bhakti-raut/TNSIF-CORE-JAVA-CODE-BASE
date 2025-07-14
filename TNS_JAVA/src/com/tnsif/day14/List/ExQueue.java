package com.tnsif.day14.List;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList; 

public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> r = new LinkedList<Integer>();
		
		r.add(6);
		r.add(10);
		r.add(12);
		r.add(13);
		r.add(2);
		
		System.out.println("Queue: " + r);
		
		int positionPeek = r.peek();
		System.out.println("Using peek method first value from queue: " + positionPeek);
		
		
		System.out.println("Removed element: " + r.remove());
		System.out.println("Queue after remove: " + r);
		
		Iterator<Integer> itr = r.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next()+ "\t");
		}
		System.out.println();
		
		System.out.println("Polled element: " + r.poll());
		System.out.println("Queue after poll: " + r);
		
		
		
		

	}

}
