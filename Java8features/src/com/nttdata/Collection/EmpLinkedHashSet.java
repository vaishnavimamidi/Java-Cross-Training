package com.nttdata.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class EmpLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<Employee>linkedhashset =new LinkedHashSet<>();
	linkedhashset.add(new Employee("jack",123,"hyd",50000));
	linkedhashset.add(new Employee("peter",456,"pune",45000));
	linkedhashset.add(new Employee("john",789,"kolkata",120000));
	linkedhashset.add(new Employee("lilly",814,"bangalore",78000));
	linkedhashset.add(new Employee("dennis",910,"chennai",56000));
	
	for (Employee employee : linkedhashset) {
		System.out.println(employee);
	}
		long k=linkedhashset.stream().map(p->p.id).count();

		System.out.println(" id count is "+k);
		
	}
}