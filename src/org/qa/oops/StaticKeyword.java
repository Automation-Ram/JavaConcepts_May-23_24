package org.qa.oops;

public class StaticKeyword {

	int id = 101;
	String name;
	static int rollnum = 10001;

	public void m1() {
		System.out.println("m1");
	}

	public static void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();
		System.out.println(obj.id);
		System.out.println(StaticKeyword.rollnum);
		StaticKeyword.m2();

	}

}
