package com.learnJava.com.lambdaExpresson;

public class EmployeeClass {

	private int eId;
	private String eName;
	private String address;
	private long salary;

	@Override
	public String toString() {
		return "EmployeeClass [eId=" + eId + ", eName=" + eName + ", address=" + address + ", salary=" + salary + "]";
	}

	public EmployeeClass(int eId, String eName, String address, long salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
