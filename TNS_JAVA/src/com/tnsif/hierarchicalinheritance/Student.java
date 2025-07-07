package com.tnsif.hierarchicalinheritance;

public class Student extends Person {
	
	private String clas;
	private float percentage;
	
	// default constructor
	
	public Student() {
		super();
		System.out.println("default of student ");
		clas="A";
		percentage=55.5f;
	}

	public Student( String clas, float percentage) {
		super();
		this.clas = clas;
		this.percentage = percentage;
	}
	
	public Student(String name, String city, String clas, float percentage) {
		super(name, city);
		this.clas = clas;
		this.percentage = percentage;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	  @Override
	    public String toString() {
	        return super.toString() + ", Class: " + clas + ", Percentage: " + percentage;
	    }
	
	
	
	

}
