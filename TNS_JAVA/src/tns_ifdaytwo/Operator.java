package tns_ifdaytwo;

public class Operator {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println("A and B value before the operator " + a);
		
		int e = ++a + b + a--;
		System.out.println("C value after the operator : " + e);
		
		int d = c++ + a + a--;
		System.out.println("d value after the operator :" + d);
	}

}
