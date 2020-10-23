package com.nttdata.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmpTreeSet implements Comparable{
	String name;
	int id;
	String city;
	int salary;
	public EmpTreeSet(String name, int id, String city, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.salary = salary;
	}
		@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<EmpTreeSet>hs=new TreeSet<EmpTreeSet>();
		hs.add(new EmpTreeSet("jack",123,"hyd",50000));
		hs.add(new EmpTreeSet("peter",456,"pune",45000));
		hs.add(new EmpTreeSet("john",789,"kolkata",120000));
		hs.add(new EmpTreeSet("lilly",825,"bnglre",78000));
		hs.add(new EmpTreeSet("dennis",910,"chennai",56000));
	
		for (EmpTreeSet employee : hs)
		{
			System.out.println(employee);
		}
	List<Integer>l=new ArrayList<Integer>();
		List<Integer> g=hs.stream().filter(p->p.salary>70000).map(p->p.salary).collect(Collectors.toList());
		System.out.println("salary greater than 70000"+g);
		Optional<Integer> sal=hs.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
		System.out.println("sum of total employee salaries are" + sal);
		long se=hs.stream().count();
		System.out.println(se);
	}
	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if(id>this.id)
		{
			return 1;
	}
		else if(id<this.id)
		{
			return -1;
		}
		else
			return 0;
	}			
		}