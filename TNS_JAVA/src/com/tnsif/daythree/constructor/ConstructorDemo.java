package com.tnsif.daythree.constructor;
import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name, city;
		int id;
	
		
		sc.nextInt();
		System.out.println("Enter Customer Name");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		/*Customer c2 = new Customer(name, id, city);
		System.out.println(c2); */
		
		
		
		Customer c1 = new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		
		
		
		
		

	}

}
