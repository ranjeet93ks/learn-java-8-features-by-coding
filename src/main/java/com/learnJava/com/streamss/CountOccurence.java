package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("A");
		System.out.println(lst);

		Object[] inp = lst.toArray();

		HashMap<String, Integer> hsh = new HashMap<>();

		for (int i = 0; i < inp.length; i++) {

			hsh.put(inp[i].toString(), hsh.getOrDefault(inp[i], 0) + 1);

			// if (hsh.containsKey(inp[i])) {
//				hsh.put(inp[i], hsh.get(inp[i]) + 1);
//			} else
//				hsh.put(inp[i], 1);
		}

		hsh.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
