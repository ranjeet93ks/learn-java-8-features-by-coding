package com.learnJava.com.streamss;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreammExamplePractice4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ABCABDZZZZZZZZZZ");
		list.add("BCDZXX");
		list.add("CDETUVBS");
		list.add("DEFKKK");
		list.add("EFGJHHKHKHK");
		list.add("FGHJKJKMKK");

		System.out.println(list);
		// asceding order of length of element--
		List<String> list0 = list.stream().sorted((s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 > l2)
				return +1;
			else if (l2 > l1)
				return -1;
			else
				return 0;
		}).collect(Collectors.toList());
		System.out.println("ascending order of length of element : " + list0);

	}

}
