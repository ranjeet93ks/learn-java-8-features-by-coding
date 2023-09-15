package com.learnJava.method.constructor.references;


public class MethodReferenceMultiThreadingExample {

	public static void main(String[] args) {

		MethodReferenceMultiThreadingExample ex = new MethodReferenceMultiThreadingExample();

		// method reference
		Runnable r = ex::methodA;// implementation of run method referred to methodA
		// run method is no-arg and here methodA is also no-arg method

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

	public void methodA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

}
