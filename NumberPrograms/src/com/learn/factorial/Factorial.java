package com.learn.factorial;

public class Factorial {

	public static void FactorialNum(int n) {
		
		int product = 1;
		
		for(int i= 1;i<=n;i++)
		{
			product = i*product;
		}
		
		System.out.println(product);
		
	}
}
