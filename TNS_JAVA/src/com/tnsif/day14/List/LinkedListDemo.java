package com.tnsif.day14.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		li.addFirst(5);
		System.out.println(li);
		li.add(2, 60);
		System.out.println(li);
		
		li.addLast(20);
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println(li);
		
		ListIterator<Integer> l1 = li.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next()+"\t");
		}
		
		System.out.println();
		
		l1=li.listIterator(li.size());
		while(l1.hasPrevious())
		{
			int n=l1.previous();
		}
			
		}
}
		
	
