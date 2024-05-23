package org.qa.javabasics;

public class SwtichStatement {

	public static void main(String[] args) {

		int num = 1;

		switch (num) {
		case 0: {

			System.out.println("Value 0");
			break;
		}
		case 1: {

			System.out.println("Value 1");
			break;
		}
		case 2: {

			System.out.println("Value 2");
		}
		case 3: {

			System.out.println("Value 3");
		}
		case 4: {

			System.out.println("Value 4");
		}
		default:
			System.out.println("Default");
		}

	}

}
