package com.learnJava.method.constructor.references;


//this is a functional interface
interface InterfA {
	public void methodA();
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// without using method reference --using lambda exp.
		InterfA i = () -> {
			System.out.println("implementation of abstract method of functional interface using lambda exp 1: ");
			System.out.println("implementation of abstract method of functional interface using lambda exp 2: ");
		};

		i.methodA();

		// method reference -- alternative to lambda exp.
		// here we didnt implemented abstract method (methodA) but instead we refer it
		// to another existing method (methodB)
		// so code reusebility
		// for method reference- mandatory to have same argument types only
		// here methodA & methodB have same argument types i.e no arg
		InterfA i1 = MethodReferenceExample::methodB;// class.static method name
		i1.methodA();

		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
		InterfA i2 = methodReferenceExample::methodC;// object.non-static method name
		i2.methodA();

	}

	public static void methodB() {
		System.out.println("implementation of methodB 1: ");
		System.out.println("implementation of methodB 2: ");

	}

	public void methodC() {
		System.out.println("implementation of methodC 1: ");
		System.out.println("implementation of methodC 2: ");

	}

}
