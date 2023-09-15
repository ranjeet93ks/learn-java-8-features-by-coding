package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramsExampless1 {

	public static void main(String[] args) {
		SteramsExampless1 obj = new SteramsExampless1();
		obj.main1();
	}

	public  void main1() {

		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(50);
		list.add(55);
		list.add(30);
		list.add(35);
		list.add(40);

		System.out.println(list);// [45, 50, 55, 30, 35, 40]
		list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);// no impact -->>[45, 50, 55, 30, 35, 40]

		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);// [50, 30, 40]

		List<Integer> list2 = list1.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(list2);// [55, 35, 45]

		long count = list1.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);// 3

		// natural sorting
		List<Integer> sortedList = list1.stream().map(i -> i + 5).sorted().collect(Collectors.toList());
		System.out.println(sortedList);// [35, 45, 55]

		// natural sorting -->>internally calling i1.compareTo(i2)
		// sorted() ->> sorted((i1, i2) -> i1.compareTo(i2))
		List<Integer> naturallySortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(naturallySortedList);// [30, 35, 40, 45, 50, 55]

		List<Integer> naturallySortedAscendingList = list.stream().sorted((i1, i2) -> i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println(naturallySortedAscendingList);// [30, 35, 40, 45, 50, 55]

		List<Integer> naturallySortedDescendingList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println(naturallySortedDescendingList);// [55, 50, 45, 40, 35, 30]

		// ------------->>>>>customized sorting ----------->>>>>>>>

		// ascending order
		// -- greater value comes after(+1) and lesser value comes before(-1)
		List<Integer> ascendingList = list.stream().sorted((i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(ascendingList);// [30, 35, 40, 45, 50, 55]

		// descending order
		// -- greater value comes before(-1) and lesser value comes after(+1)
		List<Integer> descendingList = list.stream().sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println(descendingList);// [55, 50, 45, 40, 35, 30]

		// --->>>>min and max and get -->>>>>>>

		int max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);// 55

		int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);// 30

		// print all values of list
		list.stream().forEach(System.out::println);

		// to call customized method
		Consumer<Integer> customizedFunction = i -> {
			System.out.println("The square of " + i + " is :" + (i * i));
		};
		list.stream().forEach(customizedFunction);

		// to array
		Integer[] array = list.stream().toArray(Integer[]::new);
		Stream.of(array).forEach(System.out::println);///printing all elements

	}

}
