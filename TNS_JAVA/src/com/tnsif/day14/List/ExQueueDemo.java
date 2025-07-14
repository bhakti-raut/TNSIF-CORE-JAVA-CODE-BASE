package com.tnsif.day14.List;

import java.util.Deque;
import java.util.ArrayDeque; 

public class ExQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque1 = new ArrayDeque<String>();
		deque1.add("Gautam");
		deque1.add("Kiran");
		deque1.add("Sanika");
		deque1.add("heti");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("queue is :" + str);
		}
		
		System.out.println(deque1);

	}

}
