package com.nttdata.JavaFeatures;

import java.util.function.BiFunction;

public class MethodRefOpt {

	static void stat()
	{
		System.out.println("This is Static Method");
	}
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static double mul(int a,double b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		
		Hello h = MethodRefOpt::stat;
		System.out.println(h);
		h.print();
		System.out.println("__________________");
		
		System.out.println("___________________");
		BiFunction<Integer, Integer,Integer> add = MethodRefOpt::add;
		int res = add.apply(20, 30);
		System.out.println("Addition :"+res);
		
		BiFunction<Integer, Double, Double> mul = MethodRefOpt::mul;
		double res1 = mul.apply(12, 3.4);
		System.out.println("Multiplication:"+res1);
	}

}
