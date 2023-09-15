package com.learnJava.date.time.apii;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

//until Java 1.7version the classes present in Java.util package to handle Date and Time 
//(like Date, Calendar, TimeZoneetc) are not up to the mark with respect to convenience and performance.
//To overcome this problem in the 1.8version oracle people introduced Joda-Time API. 
//This API developed by joda.org and available in Java in the form of Java.time package.

public class Local_Date_Time {

	public static void main(String[] args) {

		// If we want to represent both Date and Time then we should go for
		// LocalDateTime object.
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		LocalDateTime dt1 = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(dt1);

		LocalDateTime dt2 = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt2);

		System.out.println("After six months:" + dt2.plusMonths(6));
		System.out.println("Before six months:" + dt2.minusMonths(6));

		LocalDate dt3 = LocalDate.of(2021, Month.JANUARY, 8);
		System.out.println(dt3);
		System.out.println("Afyter 90 days:" + dt3.plusDays(90));
	}

}
