package com.learnJava.com.lambdaExpresson;

public class BasicExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//ex. 1
	public void method1() {
		System.out.println("Welcome to Lambda Expression");
	}
	// its equivalent code
	// () -> System.out.println("Welcome to Lambda Expression");

	// ex. 2

	public void method2(int a, int b) {
		System.out.println(a + b);
	}
	// its equivalent code
	// (int a, int b) -> System.out.println(a+b); // or
	// (a,b) -> System.out.println(a+b);
	
	//ex. 3
	public String method3(String str) {
		return str;
	}
	// its equivalent code
	//(String str) -> str;
		// () -> str;

}
