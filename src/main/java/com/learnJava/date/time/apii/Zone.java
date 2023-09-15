package com.learnJava.date.time.apii;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {

	public static void main(String[] args) {

		ZoneId zone = ZoneId.systemDefault();
		System.out.println("Default Zone : " + zone);

		// We can create ZoneId for a particular zone as follows

		ZoneId la = ZoneId.of("America/Los_Angeles");
		System.out.println(la);
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);

		ZoneId nd = ZoneId.of("Asia/Kolkata");
		System.out.println(nd);
		ZonedDateTime zt1 = ZonedDateTime.now(nd);
		System.out.println(zt1);

		ZoneId pa = ZoneId.of("Europe/Paris");
		System.out.println(pa);
		ZonedDateTime zt2 = ZonedDateTime.now(pa);
		System.out.println(zt2);

	}

}
