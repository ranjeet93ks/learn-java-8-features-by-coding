package com.learnJava.optional;

import java.util.Optional;

public class OptionalPracticeExample {

	public static void main(String[] args) {

		Optional<String> inpt = Optional.ofNullable("");
		System.out.println(inpt.isEmpty());// false
		System.out.println(inpt.isPresent());// true
		System.out.println(inpt.get());//
		
		Optional<String> inpt1 = Optional.ofNullable("Advik");
		System.out.println(inpt1.isEmpty());// false
		System.out.println(inpt1.isPresent());// true
		System.out.println(inpt1.get());//Advik

		Optional<String> inpt2 = Optional.ofNullable(null);
		System.out.println(inpt2.isEmpty());// true
		System.out.println(inpt2.isPresent());// false
		System.out.println(inpt2.get());// java.util.NoSuchElementException: No value present

	}
}
