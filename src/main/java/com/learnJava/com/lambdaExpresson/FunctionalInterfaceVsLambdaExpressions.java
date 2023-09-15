package com.learnJava.com.lambdaExpresson;

interface Interf {
	public void sum(int a, int b);

	// public void add(int a, int b);
}

// note :- Interf is functional interface as it has only 1 abstract method
//although it lacks @FunctionalInterface annotation
public class FunctionalInterfaceVsLambdaExpressions {

	// Once we write Lambda expressions to invoke it�s functionality, then
	// Functional Interface is required.
	// We can use Functional Interface reference to refer Lambda Expression.
	// Where ever Functional Interface concept is applicable there we can use Lambda
	// Expressions.

	public static void main(String[] args) {

		// with lambda expression -- implementation of sum method of functional
		// interface
		Interf i = (a, b) -> System.out.println("sum Execution using lambda expression " + (a + b));
		// The target type of this expression must be a functional interface - if we add
		// more than 1 abstract method in Interf
		i.sum(10, 20);

		// without lambda expression
		Interf demo = new Demo();
		demo.sum(30, 40);

	}

}

//without Lambda Expression

class Demo implements Interf {
	@Override
	public void sum(int a, int b) {
		System.out.println("sum Execution without using lambda expression " + (a + b));
	}
}
