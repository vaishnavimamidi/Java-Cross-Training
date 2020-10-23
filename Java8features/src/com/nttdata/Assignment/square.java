package com.nttdata.Assignment;

public class square {
	
	public static void sq(float c)
	{
		c = c* c;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		float x = 0.5f;
		sq(++x);
	}
	

}
