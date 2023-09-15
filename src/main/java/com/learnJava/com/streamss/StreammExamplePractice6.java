package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;

public class StreammExamplePractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(60);

		for (Integer i1 : list)
			System.out.println(i1);

		// alternative of above ::
		System.out.println("using stream. and method reference");
		list.stream().forEach(System.out::println);
	}

}
