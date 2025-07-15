package com.tnsif.day14.mapDemo;

import java.util.Hashtable;
import java.util.Set;
import java.util.Collection;

public class HashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101,  "Mumbai");
		ht.put(102,  "New Mumbai");
		ht.put(103,  "Pune");
		ht.put(101,  "Solapur");
		ht.put(104,  "New Mumbai");
		
		System.out.println(ht);
		
		ht.putIfAbsent(105,  "PCMC");
		ht.put(101, "BMT");
		
		System.out.println(ht);
		
		
		//ht.put(null, "Loni");    //   we can't included null in map
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102,  "Bombay"));
		System.out.println(ht);
		ht.clone();
		System.out.println(ht);
		
		
		Set s = ht.keySet();
		System.out.println(s);
		Collection<String> c = ht.values();
		System.out.println(c);
		
	
		
		
	}

}
