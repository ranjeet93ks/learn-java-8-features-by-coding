package com.learnJava.functional.intrface;

public class BasicExample1 {

}
/*
 * If an interface contain only one abstract method, such type of interfaces are
 * called functional interfaces and the method is called functional method or
 * single abstract method (SAM).
 */

/*
 * Ex of functional interfaces are:- 1) Runnable - It contains only run() method
 * 2) Comparable - It contains * only compareTo() method 3) ActionListener - It
 * contains only * actionPerformed() 4) Callable - It contains only call()
 * method Inside functional interface in addition to single Abstract method
 * (SAM) we write any number of default and static methods.
 */

/*
 * In Java 8, Sun Micro System introduced @Functional Interface annotation to
 * specify that the interface is Functional Interface.
 */

// in simple interface we can add multiple abstract methods as well as default/static methods.
interface ParentIntrface {

	void method1(); // by default abstract

	abstract void method2();

	abstract void method3();

	default void method4() {
		System.out.println("method4");
	}

	default void method5() {
		System.out.println("method5");
	}

	static void method6() {
		System.out.println("method6");
	}

	static void method7() {
		System.out.println("method7");
	}

}

// ParentIntrface1 is functional interface and has exactly 1
//abstract method
@FunctionalInterface
interface ParentIntrface1 {

	void method1(); // by default abstract

}

//ParentIntrface2 is functional interface and has exactly 1
//abstract method and many static and default methods
@FunctionalInterface
interface ParentIntrface2 {

	void method1(); // by default abstract

	static void method2() {
		System.out.println("method2");
	}

	static void method3() {
		System.out.println("method3");
	}

	default void method4() {
		System.out.println("method4");
	}

	default void method5() {
		System.out.println("method5");
	}

}

//compilation error cuz ParentIntrface3 is functional interface and has 2
//abstract methods
//@FunctionalInterface
//interface ParentIntrface3 {
//	void method1(); // by default abstract
//	abstract void method2();
//}

//compilation error cuz ParentIntrface4 is functional interface and has 0
// abstract methods
//@FunctionalInterface
//interface ParentIntrface4 {
//}

//compilation error cuz ParentIntrface5 is functional interface and has 0
//abstract methods and many static/default methods
//@FunctionalInterface
//interface ParentIntrface5 {
//	static void method2() {
//		System.out.println("method2");
//	}
//
//	static void method3() {
//		System.out.println("method3");
//	}
//
//	default void method4() {
//		System.out.println("method4");
//	}
//
//	default void method5() {
//		System.out.println("method5");
//	}
//}

//Functional Interface with respect to Inheritance:

@FunctionalInterface
interface A {
	public void methodOne();
}

//if parent interface is functional, then child class interface would be function only 
//if it wont have any abstract method.
@FunctionalInterface
interface B extends A {
}

// Compilation error, cuz parent and child interface have abstract method, 
//so overall 2 asbtract methods for child interface
//@FunctionalInterface
//interface C extends A {
//	void method1();
//}

//no error, although child interface has abstract method cuz same method "methodOne()" in child and parent interface
@FunctionalInterface
interface D extends A {
	@Override
	void methodOne();
}

// no error, although child interface has abstract method cuz child interface is not functional
interface E extends A {
	void method1();
}
