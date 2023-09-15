package com.learnJava.com.lambdaExpresson;

public class AnnonymousClassExample1 {

	public static void main(String[] args) {

		// anonymous class
		// below is the implementation class of Runnable interface but this have no name
		// here r is not object of runnable interface but it is object anonymous class
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("child thread");
				}
			}
		};

		// lambda expression --equivalent of above
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("child thread");
//			}
//		};

		Thread thread = new Thread(r);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}

}