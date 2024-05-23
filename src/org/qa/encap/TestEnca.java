package org.qa.encap;

public class TestEnca {

	public static void main(String[] args) {

		EncapEG obj = new EncapEG();
		obj.setId(121);
		obj.setName("Ram");
		obj.setRollNum(122233);
		obj.setAddress("Colombo");
		System.out.println(obj.getId() + " " + obj.getName() + " " + obj.getRollNum() + " " + obj.getAddress());

	}

}
