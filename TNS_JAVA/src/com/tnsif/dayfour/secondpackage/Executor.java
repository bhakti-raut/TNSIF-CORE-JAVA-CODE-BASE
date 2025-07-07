package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accessing different  package class
		
		Base b1 = new Base();
		
		// private, default, protected and public
		
		
		b1.methodPublic();
		b1.varPublic=3456;
		b1.methodPublic();

	}

}
