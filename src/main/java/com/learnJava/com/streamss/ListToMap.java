package com.learnJava.com.streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Ranjeet", 50000));
		list.add(new Employee(2, "Sonam", 70000));
		list.add(new Employee(3, "Advik", 60000));
		Map<Integer, Employee> map = list.stream().collect(Collectors.toMap(Employee::getId, emp -> emp));
		Map<Integer, Employee> map1 = list.stream().collect(Collectors.toMap(Employee::getId, (e) -> e));

		map.forEach((k, v) -> System.out.println("k: " + k + " " + "v: " + v));

		// both are same
		for (Employee emp : list)
			System.out.println(emp);

		list.stream().forEach(System.out::println);

	}

}

class Employee {

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

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}