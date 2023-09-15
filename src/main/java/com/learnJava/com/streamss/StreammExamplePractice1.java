package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreammExamplePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(50);
		list.add(55);
		list.add(65);
		list.add(45);
		list.add(25);
		list.add(20);

		Object[] arr = list.toArray();
		List<Object> list8 = Arrays.asList(arr);

		List<Integer> list1 = list.stream().collect(Collectors.toList());
		long noOfElements = list.stream().count();
		System.out.println("original list: " + list1);
		System.out.println("No. Of Elements: " + noOfElements);

		// only even
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("list with only even values: " + list2);

		// add 10 to each value of list
		List<Integer> list3 = list.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("list with 10 added to each of its elements: " + list3);

		// natural order sorting -- ascending
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("list with natural order soting: " + sortedList);

	}

}
