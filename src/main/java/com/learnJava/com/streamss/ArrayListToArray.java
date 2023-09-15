package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		// constructor reference
		Integer[] arr = list.stream().toArray(Integer[]::new);
		// Integer[]::new means -- it will return integer array object
		// System.out.println(Arrays.toString(arr));

	}

}
