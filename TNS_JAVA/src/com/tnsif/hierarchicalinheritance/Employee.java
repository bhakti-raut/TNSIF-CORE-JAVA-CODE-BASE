package com.tnsif.hierarchicalinheritance;

public class Employee extends Person {

		// TODO Auto-generated method stub
		
		// data members
		
		private int empId;
		private float salary;
		private String dept;
		
		
		// para 
		
		public Employee() {
			super();
			System.out.println("employee class default constuructor created.");
			empId=12;
			salary=10002.2f;
			dept="Computer";
		}
		
		// non para
		
		public Employee(int empId, float salary, String dept) {
			super();
			this.empId = empId;
			this.salary = salary;
			this.dept = dept;
		}
		
		  // ✅ Constructor with Person + Employee fields
	    public Employee(String name, String city, int empId, float salary, String dept) {
	        super(name, city);  // call Person's constructor
	        this.empId = empId;
	        this.salary = salary;
	        this.dept = dept;
	    }
		// getter and setter
		
		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
		
		 @Override
		    public String toString() {
		        return super.toString() + ", EmpID: " + empId + ", Salary: " + salary + ", Dept: " + dept;
		    }
		
		


	}


