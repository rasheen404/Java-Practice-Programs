package com.learn.CompareTo;

public class CompareTo {
	public static void main(String[] args) {
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		
		int result = s1.compareTo(s2);
		
		if(result>0)
		{
			System.out.println("String S1 is Greater.");
		}
		else if(result<0)
		{
			System.out.println("String S2 is Greater.");
		}
		else 
		{
			System.out.println("String S1 and S2 are Equal.");
		}
	}

}
