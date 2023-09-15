package com.learnJava.date.time.apii;

import java.time.LocalTime;

public class Local_Time {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		System.out.println(time);
		String s1 = time.toString().substring(0, 8);
		System.out.println(s1);
		System.out.printf("%d:%d:%d:", h, m, s);
	}
}