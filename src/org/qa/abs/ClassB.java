package org.qa.abs;

public class ClassB extends ClassA {

	public static void main(String[] args) {

		ClassB obj = new ClassB();
		obj.method1();
		obj.M2();

	}

	@Override
	void method1() {
		System.out.println("m1");

	}

}
