package com.tnsif.day14.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Shruti");
		list.add("heti");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(20.24f);
		list.add(10);
		
		System.out.println("List is: " + list);
		System.out.println(list.isEmpty());
		
		
		
		System.out.println(list.size());
		
		
		
		list.remove(false);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		
		System.out.println(list);
		
		System.out.println(list.indexOf(20));
		
		list.clear();
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		// Generics
		
		List<String> names = new ArrayList<String>();
		names.add("Heti");
		names.add("hema");
		names.add("aditya");
		names.add("vedant");
		names.add("hema");
		
		System.out.println(names);
		
		
		Collections.reverse(names);
		System.out.println(names);
		
		
		System.out.println(names.contains("omkar"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		
		// traversing in list using iterator
		
		Iterator<String> i = names.iterator();
		while(i.hasNext()) 
		{
			String nm = i.next();
			System.out.println(nm+ " ");
		}
		
		System.out.println();
		System.out.println(names);
		
		
		ListIterator<String> li = names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);
		}

	}

}
