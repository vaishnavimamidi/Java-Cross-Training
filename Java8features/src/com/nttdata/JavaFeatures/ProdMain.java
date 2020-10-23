package com.nttdata.JavaFeatures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProdMain {

	public static void main(String[] args) {
		
//		List<Product> list = new ArrayList<Product>();
//		list.add(new Product(1, "Mobile", 30000));
//		list.add(new Product(2, "Laptop", 70000));
//		list.add(new Product(3, "Fridge", 30000));
//		list.add(new Product(4, "TV", 40000));
//		
//		List<Double> listD = new ArrayList<>();
		
//		for (Product p : list) {
//			
//			if(p.price>30000)
//			{
//				listD.add(p.price);
//			}
//			
//		}
//		System.out.println(listD);
//	}
	
  
		
		//stream
//	List<Double> d = list.stream().filter(p->p.price >30000)
//			.map(p->p.price).collect(Collectors.toList());
//	System.out.println(d);
//	
//	list.stream().filter(p->p.price>20000).forEach(p->System.out.println(p.price));
//	
//	Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(20).forEach(System.out::println);
//	
//	//reduce function
//	
//	Double dd = list.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
//	System.out.println(dd);
//	}
	
	
	//>>>>>>>>>> Using Set..............
	
	Set<Product> set = new HashSet<>();
	set.add(new Product(1, "Mobile", 30000));
	set.add(new Product(2, "Laptop", 70000));
	set.add(new Product(3, "Fridge", 30000));
	set.add(new Product(4, "TV", 40000));
	
	//Set<Double> listD = new ArrayList<>();
	Set<Double> d = set.stream().filter(p->p.price >30000)
			.map(p->p.price).collect(Collectors.toSet());
	System.out.println(d);
	
	set.stream().filter(p->p.price>20000).forEach(p->System.out.println(p.price));
	
	Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(20).forEach(System.out::println);
	
	//reduce function
	
	Double dd = set.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
	System.out.println(dd);
	}
	
	
}
