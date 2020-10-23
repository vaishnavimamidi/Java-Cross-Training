package com.nttdata.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeArraylist {
//String name;
//int id;
//String city;
//int salary;
//public EmployeeArraylist(String name, int id, String city, int salary) {
//	super();
//	this.name = name;
//	this.id = id;
//	this.city = city;
//	this.salary = salary;
//}
//	@Override
//public String toString() {
//	return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", salary=" + salary + "]";
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> e=new ArrayList<>();
e.add(new Employee("jack",123,"hyd",50000));
e.add(new Employee("peter",456,"pune",45000));
e.add(new Employee("john",789,"kolkata",120000));
e.add(new Employee("lilly",179,"bangalore",78000));
e.add(new Employee("dennis",852,"chennai",56000));
Collections.sort(e, (e1,e2)->{
	
	return (e1.name).compareTo(e2.name);
});
for (Employee employee : e) {
	System.out.println(employee);
}
List<Integer>l=new ArrayList<Integer>();
List<Integer> i=e.stream().filter(p->p.salary>70000).map(p->p.salary).collect(Collectors.toList());
System.out.println("salary greater than 70000"+i);
Optional<Integer> sal=e.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
System.out.println("sum of total employee salaries are" + sal);
long se=e.stream().count();
System.out.println(se);

;
}

}
