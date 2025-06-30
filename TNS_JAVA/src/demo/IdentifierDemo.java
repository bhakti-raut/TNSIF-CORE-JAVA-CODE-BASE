package demo;

public class IdentifierDemo {

	public static void main(String[] args) {
		// Variables declaration - invalid identifier examples
		
		// int for = 13; error because keyword cannot  to be  declare as variables
		
		// int num 1 = 5; error because of space
		
		//int @num =13;  special symbols are not allowed only $ and _ ARE ALLOWED
		
		// valid identifiers
		
		int $num1 = 12;
		
		String StudentName = "Bhakti";
		
		int FOR = 12;
		
		System.out.println("Values of the number variable is : " + $num1);
		
		System.out.println("Student Name is : " + StudentName);
	}

}
