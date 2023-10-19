package com.learn.PrimeNum;

public class PrimeNum {
	public static int FindPrime(int n) 
	{
		for (int i = 2;i<n;i++)
		{
			if (n%i == 0) {
				return -1;
			}
		}
		return n;
	}

}
