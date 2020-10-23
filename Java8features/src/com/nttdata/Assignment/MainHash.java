package com.nttdata.Assignment;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

public class MainHash {

	public static void main(String[] args) {
		
		HashMap<Integer, Customer> hm = new HashMap<>();
		Encoder enc = Base64.getEncoder();
		hm.put(1, new Customer(12, "Harry",enc.encodeToString("har@y61".getBytes()) , 23709, "Delhi"));
		hm.put(2, new Customer(34, "James",enc.encodeToString("me8!2".getBytes()) , 7489, "Punjab"));
		hm.put(3, new Customer(56, "Lily", enc.encodeToString("lill99".getBytes()), 31271, "Bangalore"));
		hm.put(4, new Customer(78, "Dennis",enc.encodeToString("Den%#1".getBytes()) , 2131, "Chennai"));
		hm.put(5, new Customer(90, "Mary",enc.encodeToString("marr21u".getBytes()) , 98712, "Goa"));
		hm.put(6, new Customer(13, "Jill", enc.encodeToString("Ji*12".getBytes()), 5672, "Anantapur"));
		hm.put(7, new Customer(45, "Bond",enc.encodeToString("boy!98".getBytes()) , 1323, "Hyderabad"));
		hm.put(8, new Customer(68, "Rosy",enc.encodeToString("rosE78!".getBytes()) , 45678, "Kerala"));
		hm.put(9, new Customer(79, "James",enc.encodeToString("jAme87$".getBytes()) , 2341, "Maharastra"));
		hm.put(10, new Customer(53, "Bob", enc.encodeToString("ob3y!".getBytes()), 12343, "Hyderabad"));
		hm.put(11, new Customer(23, "Jack",enc.encodeToString("ackJ98*".getBytes()) , 6789, "Jaipur"));
		hm.put(12, new Customer(64, "Tim",enc.encodeToString("abc23j".getBytes()) , 3792, "Mumbai"));
		hm.put(13, new Customer(81, "Sherley",enc.encodeToString("Sher$yu".getBytes()) , 67892, "Shimla"));
		hm.put(14, new Customer(92, "Daisy",enc.encodeToString("dAise7!".getBytes()) , 98621, "Kolkata"));
		hm.put(15, new Customer(74, "Albert",enc.encodeToString("alBe732".getBytes()) , 32412, "Mysore"));
		hm.put(16, new Customer(25, "John",enc.encodeToString("jo32!".getBytes()) , 3218, "Pune"));
		hm.put(17, new Customer(70, "Jessy",enc.encodeToString("Yes@98".getBytes()) , 45678, "Gangtok"));
		hm.put(18, new Customer(39, "Ash",enc.encodeToString("ashby12)".getBytes()) , 4697, "Amristar"));
		hm.put(19, new Customer(72, "Lucy", enc.encodeToString("luCe98".getBytes()), 24798, "Kochi"));
		hm.put(20, new Customer(98, "Robert", enc.encodeToString("ROb74!".getBytes()), 39871, "Hyderabad"));
		
//	    Map<Integer, Customer> cust = hm.entrySet().stream().min((c1,c2)->c1.totalPrice<c2.totalPrice?-1:1).get();
//	    System.out.println(cust.totalPrice);
	    
		long l = hm.entrySet().stream().filter(c->c.getValue().getCity().equals("Hyderabad")).count();//equals("Hyderabad")).count();//"Hyderabad".equals(c.getValue())).count();
		System.out.println(l);
		
//		Encoder enc = Base64.getEncoder();
//		String encStr = enc.encodeToString("helloStr".getBytes());
//    	System.out.println(encStr);
		
	//	hm.entrySet().stream().max((c1,c2)->c1.totalPrice < c2.totalPrice?-1;1).get();

		
		Optional<Entry<Integer, Customer>> maxi = hm.entrySet().stream().
				max((Entry<Integer, Customer> c1,Entry<Integer ,Customer> c2) -> c1.getValue().compareTo(c2.getValue()));
				
		System.out.println(maxi.get().getValue());
		
		Optional<Entry<Integer, Customer>> mini = hm.entrySet().stream().
				min((Entry<Integer, Customer> c1,Entry<Integer ,Customer> c2) -> c1.getValue().compareTo(c2.getValue()));
				
		System.out.println(mini.get().getValue());
		
		
	}

}
