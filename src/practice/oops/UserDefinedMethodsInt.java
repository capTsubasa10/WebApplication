package practice.oops;

import java.util.Scanner;

public class UserDefinedMethodsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value of a = ");

		int a = s.nextInt(); // pre-defined methods

		System.out.println("Value of a = " + a);

		System.out.println("Enter the value of b = ");

		int b = s.nextInt();

		System.out.println("Value of b = " + b);

		System.out.println("Adiition of A & B is = " + (a + b));
	}

}
