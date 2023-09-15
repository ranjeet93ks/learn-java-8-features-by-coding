package com.learnJava.intrface.defult.statics;

public class MultipleInheritanceInJava {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}

interface Left {

	void m1();

	default void m2() {
		System.out.println("default method of Left: ");

	}

}

interface Right {

	void m1();

	default void m2() {
		System.out.println("default method of Right: ");

	}

}

class Test implements Left, Right {

	@Override
	public void m1() {
		System.out.println("m1 of child class");
		// Left.super.m1();// Cannot directly invoke the abstract method m1() for the
		// type Left
	}

	@Override
	public void m2() {
		System.out.println("m1 of child class");
		Left.super.m2();//// Can directly invoke the default method m2()
		// Right.super.m2();
	}

}
