package com.nttdata.Collection;


	public class Employee {
		String name;
		int id;
		String city;
		int salary;
		public Employee(String name, int id, String city, int salary) {
			super();
			this.name = name;
			this.id = id;
			this.city = city;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", salary=" + salary + "]";
		}
	}

