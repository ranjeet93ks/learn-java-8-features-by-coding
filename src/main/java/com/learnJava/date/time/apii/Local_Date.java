package com.learnJava.date.time.apii;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Local_Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "..." + mm + "..." + yy);
		System.out.printf("%d-%d-%d", dd, mm, yy);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate dt = LocalDate.now();
		String dtff = dtf.format(dt);
		System.out.println("--------");
		System.out.println(dtff);

		String ldate = "20210517";

		int yr = Integer.parseInt(ldate.substring(0, 4));
		int mon = Integer.parseInt(ldate.substring(4, 6));
		int day = Integer.parseInt(ldate.substring(6, 8));

		System.out.println(yr + " " + mon + " " + day);
		LocalDate date1 = LocalDate.of(yr, mon, day);
		System.out.println(date1);

	}
}