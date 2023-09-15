package com.learnJava.date.time.apii;

import java.time.Year;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.printf("Please Enter Year Yoy wish to check whether Leap Year : ");
			int n = scan.nextInt();
			Year y = Year.of(n);
			if (y.isLeap())
				System.out.printf("%d is Leap year", n);
			else
				System.out.printf("%d is not Leap year", n);
		}
	}
}