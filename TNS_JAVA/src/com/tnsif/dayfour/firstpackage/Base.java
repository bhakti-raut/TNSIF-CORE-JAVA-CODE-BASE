package com.tnsif.dayfour.firstpackage;

public class Base {
	
	// declare default, private, protected and public variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	// declare default, protected, public and private
	
	void methodDefault()
	{
		System.out.println("default access base class");
		System.out.println("Public variable : " + varDefault);
	}
	public void  methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("Public variable : " + varPublic);
	}
	
	private void  methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println("Private variable : " + varPrivate);
	}
	
	public void  methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected variable : " + varProtected);
	}
}
