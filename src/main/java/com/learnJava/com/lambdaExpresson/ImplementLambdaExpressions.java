package com.learnJava.com.lambdaExpresson;

interface InterfA {
	public void square(int a);

}

public class ImplementLambdaExpressions {

	public static void main(String[] args) {
		InterfA i = a -> System.out.println("square using lambda expression " + (a * a));
		// InterfA i = a -> a * a;
		i.square(10);
		i.square(18);

	}

}
