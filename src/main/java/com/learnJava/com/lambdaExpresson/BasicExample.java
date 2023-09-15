package com.learnJava.com.lambdaExpresson;

import java.util.function.Function;
import java.util.function.Predicate;

public class BasicExample {

	public static int squareIt(int n) {
		return n * n;
	}

	static Function<Integer, Integer> f = n -> n * n;

	public static void main(String[] args) {
		Function<Integer, Integer> funct = n -> n * n;
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println("The square of 4: " + squareIt(4));
		System.out.println("The square of 4 using java 8 : " + f.apply(4));
		System.out.println("The square of 5 using java 8 : " + funct.apply(5));

		System.out.println("4 is even : " + p.test(4));

	}

}
