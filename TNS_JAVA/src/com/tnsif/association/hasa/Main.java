package com.tnsif.association.hasa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("405 Laxmi nagar", "Pune", "Maharashtra", "4001");
		
		Person p = new Person("Bhakti", address);
		
		//  displaying the output 
		
		p.displayInfo();
		System.out.println(p);
		

	}

}
