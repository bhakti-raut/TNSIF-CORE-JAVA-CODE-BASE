package com.tnsif.day14.mapDemo;

import java.util.LinkedHashMap;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, Object>  ht = new LinkedHashMap<>();
		
		ht.put(101, 1000);
		ht.put(1012, 23.43);
		ht.put(401, 10);
		ht.put(101, 3000);
		ht.put(102, 3000);
		
		System.out.println(ht);

	}

}
