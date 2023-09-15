package com.learnJava.com.lambdaExpresson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionLambdaExample3 {

	public static void main(String[] args) {

		ArrayList<EmployeeClass> list = new ArrayList<EmployeeClass>();
		list.add(new EmployeeClass(5, "Ranjeet", "New Area Nawada", 200000l));
		list.add(new EmployeeClass(5, "Ruhi", "New Area Nawada", 600000l));
		list.add(new EmployeeClass(5, "Ruhi", "New Area Nawada", 500000l));
		list.add(new EmployeeClass(19, "Sonam", "New Area Patna", 550000l));
		list.add(new EmployeeClass(6, "Rohit", "New Area Nalanda", 220000l));
		list.add(new EmployeeClass(6, "Anna", "New Area Nalanda", 220000l));
		list.add(new EmployeeClass(4, "Advik", "New Area Gaya", 300000l));
		list.add(new EmployeeClass(10, "Sonali", "New Area Biharsharif", 700000l));
		list.add(new EmployeeClass(15, "Monali", "New Area BhagalPur", 100000l));
		list.add(new EmployeeClass(15, "Beauty", "New Area BhagalPur", 1000000l));
		list.add(new EmployeeClass(15, "Beauty", "New Area BhagalPur", 100000l));

		System.out
				.println("sorting on multiple fields - id and then by name and then by salary using method references");
		Comparator<EmployeeClass> compareByName = Comparator.comparing(EmployeeClass::geteId)
				.thenComparing(EmployeeClass::geteName).thenComparing(EmployeeClass::getSalary);

		Collections.sort(list, compareByName);

		System.out.println(list);

	}

}