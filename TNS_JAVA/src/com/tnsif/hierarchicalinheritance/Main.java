package com.tnsif.hierarchicalinheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("-----Person Details-----");
		Person p1 = new Person();
		System.out.println("p1");
		
		System.out.println("------------------------");
		//Student s = new Student();
		
		System.out.println("Person Details with Constructor");
		Person p2=new Person("Bhakti", "Solapur");
		
		
		System.out.println("Student Details:");
		Person p = new Student("Radha", "Pune", "SY", 67.47f);
		System.out.println(p);  // Calls Student's toString()

		System.out.println(); // Just a line break for clarity
		
		
		
		Person p3 = new Employee("Bhakti", "Pune", 101, 10000.00f, "IT");
		System.out.println("Employee Details:");
		System.out.println(p3);

	}

}
