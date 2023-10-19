package com.learn.GCDnumber;

public class Gcd {
	public static int Findgcd(int m,int n) {
		int rem;
		while (n!=0)
		{
			rem = m%n;
			m=n;
			n=rem;
			
		}
		return m;
	}

}
