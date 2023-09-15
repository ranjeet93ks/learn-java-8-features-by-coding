package com.learnJava.com.lambdaExpresson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionLambdaExample1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(31);
		list.add(14);
		list.add(51);

		System.out.println("Ascending order : ");
		Collections.sort(list, new MyAscedingComparator());
		System.out.println(list);
		System.out.println("Descending order : ");
		Collections.sort(list, new MyDescedingComparator());
		System.out.println(list);

		// no need to create separate comparator class implementing Comparator
		// interface
		System.out.println("Ascending order using lambda exp: ");
//		Comparator<Integer> c = (o1, o2) -> {
//			if (o1 > o2)
//				return +1;
//			else if (o1 < o2)
//				return -1;
//			else
//				return 0;
//		};
		Comparator<Integer> c = (o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
		Collections.sort(list, c);
		System.out.println(list);

		System.out.println("Descending order using lambda exp: ");
		Comparator<Integer> c1 = (o1, o2) -> {
			if (o1 > o2)
				return -1;
			else if (o1 < o2)
				return +1;
			else
				return 0;
		};

		Collections.sort(list, c1);
		System.out.println(list);
		list.stream().forEach(System.out::println);

		List<Integer> list1 = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(list1);

	}

}