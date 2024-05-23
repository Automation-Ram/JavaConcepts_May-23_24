package org.qa.exceptionhandling;

public class ArthExcep {

	public static void main(String[] args) {

		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception has been handled");
		} finally {
			System.out.println("Block executed");
		}

	}

}
