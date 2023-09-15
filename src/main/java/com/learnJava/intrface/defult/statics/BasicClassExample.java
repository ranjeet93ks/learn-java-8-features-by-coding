package com.learnJava.intrface.defult.statics;

public class BasicClassExample implements BasicInterrface {

	@Override
	public void methodA() {
		System.out.println("methodA in child class ");
	}

	// can't write default in method definition in child class
	@Override
	public void methodB() {
		System.out.println("default method of child class ::");
	}

	public static void main(String[] args) {
		BasicClassExample ex = new BasicClassExample();
		ex.methodB();
	}

}
