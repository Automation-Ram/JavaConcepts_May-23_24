package org.qa.oops;

public class Methods {

	int id = 101;
	String name = "Ram";
	static String coll = "SKCET";

	public void m1() {
		System.out.println("M1");
	}

	public String display() {
		return (id + " " + name + " " + coll);
	}

	public static void main(String[] args) {

		Methods obj = new Methods();
		obj.m1();
		System.out.println(obj.display());

	}

}
