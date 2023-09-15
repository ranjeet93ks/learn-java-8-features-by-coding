package com.learnJava.intrface.defult.statics;

public interface BasicInterrface {

//	Significance of default method :- 
//	without affecting implementing class if we want to add new method to interface --> default method
//	this is backward compatibility
//	
//	if we add any abstract method in interface, all implementing class forced to implement this
//	newly added abstract method else compilation error.

	/// we can access default method in implementing class
	// we can override default method in implementing class

	public void methodA();

	default void methodB() {
		System.out.println("default method of parent interface ::");
	}

	// A default method cannot override a method from java.lang.Object
//	default int hashCode() {
//		return 10;
//	}

	static void methodC() {
		System.out.println("default method of parent interface ::");
	}
}
