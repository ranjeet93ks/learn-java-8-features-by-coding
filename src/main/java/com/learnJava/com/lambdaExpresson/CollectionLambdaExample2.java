package com.learnJava.com.lambdaExpresson;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionLambdaExample2 {

	public static void main(String[] args) {

		ArrayList<EmployeeClass> list = new ArrayList<EmployeeClass>();
		list.add(new EmployeeClass(5, "Ranjeet", "New Area Nawada", 200000l));
		list.add(new EmployeeClass(5, "Ruhi", "New Area Nawada", 100000l));
		list.add(new EmployeeClass(5, "Ruhi", "New Area Nawada", 500000l));
		list.add(new EmployeeClass(19, "Sonam", "New Area Patna", 550000l));
		list.add(new EmployeeClass(6, "Rohit", "New Area Nalanda", 220000l));
		list.add(new EmployeeClass(6, "Anna", "New Area Nalanda", 220000l));
		list.add(new EmployeeClass(4, "Advik", "New Area Gaya", 300000l));
		list.add(new EmployeeClass(10, "Sonali", "New Area Biharsharif", 700000l));
		list.add(new EmployeeClass(15, "Monali", "New Area BhagalPur", 100000l));
		list.add(new EmployeeClass(15, "Beauty", "New Area BhagalPur", 1000000l));
		list.add(new EmployeeClass(15, "Beauty", "New Area BhagalPur", 100000l));

		// ascending order by eid
		// Comparator<EmployeeClass> cId = (e1, e2) -> e1.geteId() > e2.geteId() ? +1 :
		// e1.geteId() < e2.geteId() ? -1 : 0;
		// Collections.sort(list, cId); or directly

//		System.out.println("ascending sorting of EmployeeClass by id using comparator & lambda exp");
//		Collections.sort(list, (e1, e2) -> e1.geteId() > e2.geteId() ? +1 : e1.geteId() < e2.geteId() ? -1 : 0);
//		System.out.println(list);

		System.out.println("alphabetical sorting of EmployeeClass by name using comparator & lambda exp");
//		// Comparator<EmployeeClass> cName = (e1, e2) ->
//		// e1.geteName().compareTo(e2.geteName());
//		// Collections.sort(list, cName);
		Collections.sort(list, (e1, e2) -> e1.geteName().compareTo(e2.geteName()));
		System.out.println(list);

	}

}