package com.nttdata.Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Employee>emp=new LinkedList<>();
emp.add(new Employee("jack",123,"hyd",50000));
emp.add(new Employee("peter",456,"pune",45000));
emp.add(new Employee("john",789,"kolkata",120000));
emp.add(new Employee("lilly",912,"bangalore",78000));
emp.add(new Employee("dennis",812,"chennai",56000));
Collections.sort(emp,(e1,e2)->{
	if(e1.id>e2.id)
	{
		return 1;
	
	}
	else if(e1.id<e2.id)
	{
		return -1;
	}
	else
		return 0;
	//return e1.name.compareTo(e2.name);
});
for (Employee employee : emp) {
	System.out.println(employee);
}
List<Integer> s=emp.stream().filter(p->p.salary<100000).map(p->p.salary).collect(Collectors.toList());
System.out.println("salary less than 1lakh are " +s);
	}

}