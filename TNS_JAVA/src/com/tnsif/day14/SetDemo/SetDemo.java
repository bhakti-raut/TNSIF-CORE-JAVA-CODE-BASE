package com.tnsif.day14.SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(35);
		set.add(20);
		set.add(40);
		
		System.out.println(set);
		
		boolean b = set.contains(20);
		System.out.println(b);
		
		boolean b1 = set.isEmpty();
		System.out.println(b1);
		
		set.remove(20);
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+ " ");
		}

	}

}
