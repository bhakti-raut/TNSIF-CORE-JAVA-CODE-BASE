package com.tnsif.singleinheritance;

public class Student extends Citizen{
	
	//private String sname;
	//private String  address;
	//private long sphone;
	private int rollno;
	private String collegeName;
	
	
	// non para constructor
	public Student() {
		super();
		
	}
	
	// para constructor
	
	public Student(String name, String adharNo, String address, long phone , int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}

	
	
	
	

}
