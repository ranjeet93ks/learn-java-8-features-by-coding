package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreammExamplePractice8 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		Consumer<Integer> c = i -> {
			System.out.println("The square of elemtnt is : " + (i * i));
		};
		list.stream().forEach(c);

	}

}
