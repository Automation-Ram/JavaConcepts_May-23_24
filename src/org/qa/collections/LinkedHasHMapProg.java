package org.qa.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasHMapProg {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Employee> lhp = new LinkedHashMap<Integer, Employee>();

		Employee emp1 = new Employee(121, "Ram");
		Employee emp2 = new Employee(101, "Rajiv");

		lhp.put(1, emp1);
		lhp.put(2, emp2);

		for (Map.Entry<Integer, Employee> m : lhp.entrySet()) {
			int keyNum = m.getKey();
			Employee e = m.getValue();
			System.out.println("KeyDetails:" + keyNum);
			System.out.println(e.id + " " + e.name);
		}

	}

}
