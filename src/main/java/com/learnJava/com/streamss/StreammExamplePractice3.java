package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreammExamplePractice3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("BCD");
		list.add("CDE");
		list.add("DEF");
		list.add("EFG");
		list.add("FGH");

		System.out.println(list);
		// asceding order --
		List<String> list0 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("ascending order  : " + list0);

		// asceding order -- comparable interface
		List<String> list1 = list.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("ascending order using comparable interface : " + list1);

		// desceding order -- comparable interface
		List<String> list2 = list.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("descending order using comparable interface : " + list2);
		// desceding order -- comparable interface
		List<String> list3 = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("descending order using comparable interface : " + list3);
	}

}
