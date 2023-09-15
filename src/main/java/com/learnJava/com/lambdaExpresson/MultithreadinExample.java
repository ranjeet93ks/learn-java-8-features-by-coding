package com.learnJava.com.lambdaExpresson;

public class MultithreadinExample extends Thread {

	public static void main(String[] args) {
		MultithreadinExample ex = new MultithreadinExample();
		ex.start();

		System.out.println(Thread.activeCount());
		System.out.println(ex.getName());

	}

}

class MultithreadinExample1 implements Runnable {

	public static void main(String[] args) {
		MultithreadinExample ex = new MultithreadinExample();
		ex.start();

		System.out.println(Thread.activeCount());
		System.out.println(ex.getName());

	}

	@Override
	public void run() {
		System.out.println("run() method of class implemnting runnable ");
	}

}