package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreammExamplePractice7 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Ranjeet", 50000));
		list.add(new Person(2, "ABC", 20000));
		list.add(new Person(3, "Sonam", 70000));
		list.add(new Person(4, "Advik", 60000));

		// list of employee with salary greatet than 50000
		List<Person> list1 = list.stream().filter((p) -> p.getSalary() > 50000).collect(Collectors.toList());
		list1.forEach(System.out::println);

		// only 0index row
		Person person = list.stream().filter((p) -> p.getSalary() > 50000).collect(Collectors.toList()).get(0);
		System.out.println("at 0 index of result:: " + person);

		// only name in resultant list
		List<String> list2 = list.stream().filter((p) -> p.getSalary() > 50000).map((q) -> q.getName())
				.collect(Collectors.toList());
		list2.forEach(System.out::println);

	}

}

class Person {

	private int id;
	private String name;
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Person(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}