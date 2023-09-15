package com.learnJava.com.lambdaExpresson;

public class MultithreadinExample2 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		};

		Thread thread = new Thread(r);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("parent thread");
		}

	}

}