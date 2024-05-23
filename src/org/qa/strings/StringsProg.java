package org.qa.strings;

public class StringsProg {

	public static void main(String[] args) {

		String n1 = "Ram";
		String n2 = "Ram";
		System.out.println(n1.equals(n2));
		System.out.println(n1.compareTo(n2));
		System.out.println(n1 == n2);

		String n11 = "Ram";
		String n12 = " Vishwa Bhai";
		System.out.println(n11.concat(n12));

		String subStr = "Welcome to the World";
		System.out.println(subStr.substring(0, 6));
		
		StringBuffer str=new StringBuffer("Welcome to the world of Abudhabi");
		System.out.println(str.reverse());

	}

}
