package com.tnsif.hierarchicalinheritance;

public class Person {
	
	
	private String name;
	private String city;
	
	
	// Default constructor
	public Person() {
		System.out.println("person class default value created.");
		name="Bhakti";
		city="Pune";
	}
	
	// non para
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

}
