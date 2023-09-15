package com.learnJava.date.time.apii;

import java.time.LocalDate;
import java.time.Period;

public class PeriodBasicExample1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1993, 9, 25);// 9 or 8 not 09 or 08 --else compilation error
		System.out.println(birthday);
		Period p = Period.between(birthday, today);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		System.out.println(p);

	}
}