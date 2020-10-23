package com.nttdata.Assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import com.nttdata.Collection.Employee;

public class MainList {

	public static void main(String[] args) {
		
		ArrayList<Employee> e=new ArrayList<>();
		e.add(new Employee("Harry",123,"hyd",50000));
		e.add(new Employee("James",456,"pune",4500));
		e.add(new Employee("John",789,"kolkata",12000));
		e.add(new Employee("Lilly",179,"bangalore",78000));
		e.add(new Employee("Dennis",852,"chennai",56000));	
		e.add(new Employee("Mary",345,"hyd",50000));
		e.add(new Employee("Bond",678,"pune",45000));
		e.add(new Employee("Sherley",012,"kolkata",120000));
		e.add(new Employee("Daisy",135,"bangalore",7000));
		e.add(new Employee("Jack",579,"chennai",5000));
		e.add(new Employee("Rosy",246,"hyd",50000));
		e.add(new Employee("Tim",680,"pune",4500));
		e.add(new Employee("Albert",273,"kolkata",120000));
		e.add(new Employee("Lucy",962,"bangalore",78000));
		e.add(new Employee("Robert",824,"chennai",5000));
		
//		for (Employee employee : e) {
//			
//		//	if(employee )
//			System.out.println(employee);
//		}
	
		System.out.println("Salaries of employees between 10000 and 20000:"+"\n");
		 e.stream().filter(emp->emp.getSalary()>10000).filter(emp->emp.getSalary()>20000).forEach(emp->System.out.println(emp.getSalary()+(emp.getSalary()*5/100)));
	//	 e.stream().filter(emp->(emp.getSalary()>10000 && emp.getSalary()>20000).forEach(emp->System.out.println(emp.getSalary()+(emp.getSalary()*0.05)));
		 
		 System.out.println("_________________________________________________________________________");
		Map<String, Long> m = e.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
		System.out.println("Employees from different cities: "+m);
		 System.out.println("_________________________________________________________________________");
		int total = e.stream().collect(
				   Collectors.summingInt(Employee::getSalary));
				  System.out.println("Total Employees Salary : " + total);
	}

}
