package com.nttdata.JavaFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("How are you?");
		list.add("Bye");
		
		list.forEach((n)->System.out.println(n));
		System.out.println("_____________________________");
		System.out.println("Student Details:");
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("Jack", "Bangalore", 1234));
		list1.add(new Student("Jones", "Hyderabad", 5678));
		list1.add(new Student("James", "Chennai", 9017));
		ListIterator<Student> itr = list1.listIterator();
		
		list1.forEach((s)->System.out.println(s));

		System.out.println("-----------After Sorting------");
        Collections.sort(list1, (s1,s2)->{
        	return s1.getName().compareTo(s2.getName());
        });
        
        for (Student student : list1) {
			System.out.println(student);
		}
	}

}
