package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> upperCase =  (name) -> name.toUpperCase();

    static Function<String,String> addSomeString =  (name) -> name.toUpperCase().concat("default");

    static Function<String,Integer> strLength =  (name) -> name.length();


    public static void main(String[] args) {

        System.out.println("Result is : " + upperCase.apply("java8"));//JAVA8

        System.out.println("Result of andthen : " + upperCase.andThen(addSomeString).apply("java8"));//JAVA8default

        System.out.println("Result of compose : " + upperCase.compose(addSomeString).apply("java8"));//JAVA8DEFAULT

        Function<String,String> abc = Function.identity();

        System.out.println(abc.apply("ABC"));//ABC
        System.out.println(abc.apply("ABCABCABCDDDD"));//ABCABCABCDDDD


    }
}
