package org.qa.oops;

public class MethodCons {

	int id;
	String name;

	public MethodCons(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String display() {
		return (id + " " + name);
	}

	public static void main(String[] args) {

		MethodCons obj = new MethodCons(101, "Ram");
		System.out.println(obj.display());

	}

}
