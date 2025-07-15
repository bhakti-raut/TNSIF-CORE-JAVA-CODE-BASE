package com.tnsif.day14.SetDemo;

import java.util.HashSet;
import java.util.Set;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(101, "Vedant", 45.09));
		set.add(new Student(102, "Heti", 60.45));
		set.add(new Student(103, "Kiran", 57.56));
		set.add(new Student(104, "Shruti", 67.34));
		
		System.out.println(set);

	}

}
