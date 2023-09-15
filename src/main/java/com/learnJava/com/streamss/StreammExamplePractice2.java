package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreammExamplePractice2 {

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

		// custom sorting
		List<Integer> customisedIncreaingSortedList = list.stream()
				.sorted((I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? +1 : 0).collect(Collectors.toList());
		System.out.println("list with customised increasing order Sorting: " + customisedIncreaingSortedList);

		List<Integer> customisedDecreaingSortedList = list.stream()
				.sorted((I1, I2) -> (I1 < I2) ? +1 : (I1 > I2) ? -1 : 0).collect(Collectors.toList());
		System.out.println("list with customised decreasing order Sorting: " + customisedDecreaingSortedList);

		// in other way --custom sorting
		Comparator<Integer> cIn = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? +1 : 0;
		List<Integer> customisedIncreaingSortedList1 = list.stream().sorted(cIn).collect(Collectors.toList());
		System.out.println("list with customised increasing order Sorting: " + customisedIncreaingSortedList1);

	}

}
