package com.nttdata.JavaFeatures;

public class Greeting {

	Greeting(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
	
		// Greet g= ()->{System.out.println("Hello");};
		//  g.wish();
		  
		  String s= "Hello";
		  Greet g1 = (s1)->{System.out.println(s+" Good Morning!! ");};
		  g1.wish(s);
		  
		  Message g = Greeting::new;
		  g.getMessage("Hello");
		 
		  
	}

}
