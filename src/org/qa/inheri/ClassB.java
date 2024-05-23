package org.qa.inheri;

public class ClassB extends ClassA {

	public void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.m1();
		obj.m2();
	}

}
