package org.qa.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArayListEmp {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();

		Employee emp1 = new Employee(121, "Ram");
		Employee emp2 = new Employee(101, "Rajiv");

		emp.add(emp1);
		emp.add(emp2);

		Iterator<Employee> e = emp.iterator();
		while (e.hasNext()) {
			Employee em = e.next();
			System.out.println(em.id + " " + em.name);
		}

	}

}
