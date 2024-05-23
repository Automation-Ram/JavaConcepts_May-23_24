package org.qa.poly;

public class MO2 extends MO1 {

	public void m1() {
		System.out.println("child class m1");
		System.out.println(super.a);
		super.m2();
	}

	public static void main(String[] args) {

		MO2 obj = new MO2();
		obj.m1();
		obj.m1(20, 100);
	}

}
