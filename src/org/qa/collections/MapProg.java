package org.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProg {

	public static void main(String[] args) {

		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(1, "Ram");
		hp.put(2, "Rakesh");
		hp.put(3, "Deva");

		for (Map.Entry<Integer, String> mp : hp.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}

	}

}
