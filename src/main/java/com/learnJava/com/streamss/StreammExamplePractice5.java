package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;

public class StreammExamplePractice5 {

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

		// natural order -ascending order
		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Smallest no. of array: " + min);// 20
		// natural order -ascending order
		Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Greatest no. of array: " + max);// 65

		// natural order -descending order
		Integer min1 = list.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Smallest no. of array: " + min1);// 65
		// natural order -descending order
		Integer max1 = list.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Greatest no. of array: " + max1);// 20
	}

}
