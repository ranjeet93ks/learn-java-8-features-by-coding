package com.learnJava.lambda;

public class TestClass {

	public static void main(String[] args) {

		RunnablePractice1 t1 = new RunnablePractice1();
		// t1.start(); //compilation error
		new Thread(t1).start();

		ThreadClass1 tt2 = new ThreadClass1();
		tt2.start();

		Runnable tt3 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 1 without using lambda");
			}
		};

		// tt3.start(); //compilation error
		new Thread(tt3).start();

		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2 using lambda");
		};

		new Thread(runnableLambda).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 3 without using lambda");
			}
		}).start();

		new Thread(() -> System.out.println("Inside Runnable 4 using lambda")).start();

	}

}
