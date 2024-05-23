package org.qa.collections;

import java.util.ArrayList;

public class AryList {

	public static void main(String[] args) {

		ArrayList<String> arlist = new ArrayList<String>();
		arlist.add("Ram");
		arlist.add("Rakesh");
		arlist.add("Godwin");
		arlist.add("Deva");
		arlist.add("Krishna");

		for (int i = 0; i < arlist.size(); i++) {
			System.out.println(arlist.get(i));
		}

	}

}
