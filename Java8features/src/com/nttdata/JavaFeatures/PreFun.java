package com.nttdata.JavaFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class PreFun {

	public static void main(String[] args) {
		
		Predicate<Integer> p = I->(I>20);
		System.out.println("Predicate:"+p.test(49));
		System.out.println("Predicate:"+p.test(12));
		System.out.println("________________________-");
		
		Predicate<String> s1 = s->(s.length()>4);
		System.out.println("Predicate:"+s1.test("Hi"));
		System.out.println("________________________-");
		
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("Helloo"));
		System.out.println(f.apply("How are you?"));
		

		
	}

}
