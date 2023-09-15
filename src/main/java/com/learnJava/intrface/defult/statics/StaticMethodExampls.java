package com.learnJava.intrface.defult.statics;

interface Interf {

	public static void m1() {
		System.out.println("static method of interface :: ");
	}

	public static void main(String[] args) {
		System.out.println("main method of interface :: ");
	}
}

abstract class AbstractClass {
	public static void m2() {
		System.out.println("static method of abstract class :: ");
	}

}

public class StaticMethodExampls extends AbstractClass implements Interf {

	public static void main(String[] args) {
		// 1 way to access static method of parent interface
		Interf.m1();

		// 4 ways to access static method of parent abstract class
		AbstractClass.m2();
		m2();
		StaticMethodExampls.m2();
		StaticMethodExampls ex = new StaticMethodExampls();
		ex.m2();

	}

}
