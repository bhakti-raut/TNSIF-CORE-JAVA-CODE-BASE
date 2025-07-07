package com.tnsif.daythree.EncapsulationDemo;

public class OopsConceptDemo {
	
	private String Name;
	private int Age;
	private int SerialNum;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + Name + ", Age=" + Age + ", SerialNum=" + SerialNum + "]";
	}
	
	
	
	
	

}
