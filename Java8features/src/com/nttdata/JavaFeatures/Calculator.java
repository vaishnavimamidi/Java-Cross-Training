package com.nttdata.JavaFeatures;

public class Calculator {

	public static void main(String[] args) {
		
		//int a = 50,b=20;
		
		Operations ad =(a,b)->{return (a+b);};
		int q = ad.operate(30,50);
		System.out.println("Addition:"+q);
		
		Operations su = (c,d)->{return (c-d);};
		int w = su.operate(90, 20);
		System.out.println("Subtraction:"+w);
		
		Operations mu = (e,f)->{return (e*f);};
		int r = mu.operate(12,8);
		System.out.println("Multiplication:"+r);
		
		Operations di = (g,h)->{return (g/h);};
		int t = di.operate(100, 10);
		System.out.println("Division:"+t);
		
		Operations mo = (i,j)->{return (i%j);};
		int y = mo.operate(30, 7);
		System.out.println("Modulus:"+y);
		
	}

}
