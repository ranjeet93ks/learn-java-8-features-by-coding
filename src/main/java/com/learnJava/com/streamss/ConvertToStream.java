package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ConvertToStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		// constructor reference
		// list to array
		Integer[] arr = list.stream().toArray(Integer[]::new);
		// Integer[]::new means -- it will return integer array object

		// two ways to create stram from array :-- >>>>>>>>>>>>...
		// array to stream
		Stream.of(arr).forEach(System.out::println);
		// array to stream
		String[] strArr = { "ABC", "BDG", "PQR" };
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach(System.out::println);

		// Arraylist to stream
		list.stream().forEach(System.out::println);

		// set to stream
		// Set<Integer> hsh1 = new HashSet<>(list); //list to set
		Set<String> hsh = new HashSet<>();
		hsh.add("ABD");
		hsh.add("XYZ");
		hsh.add("GGHHH");
		hsh.add("PPPP");
		hsh.stream().forEach(System.out::println);

		// map to stream
		Map<String, Integer> mapp = new HashMap<>();
		mapp.put("A", 1);
		mapp.put("B", 3);
		mapp.put("C", 5);
		mapp.put("D", 1);
		mapp.entrySet().stream().forEach(System.out::println);

	}

}
