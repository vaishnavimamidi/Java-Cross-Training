package com.nttdata.Assignment;

public class Employee {

	private int id;
	private String empName;
	private int salary;
	private String location;
	
	public Employee(int id, String empName, int salary, String location) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", location=" + location + "]";
	}
	
	
	
}
