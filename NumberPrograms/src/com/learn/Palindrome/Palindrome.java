package com.learn.Palindrome;
public class Palindrome {
	public static void CheckPalindrome(int num) {
		int rem;
		int sum = 0;
		int temp = num;
		while(num>0)
		{
			rem = num%10;
			sum =(sum*10)+rem;
			num = num/10;
		}
		
		if (temp == sum)
		{
			System.out.println(temp + " is palindrome.");
		}
		else {
			System.out.println(temp + " is Not a Palindrome. ");
		}
	}

}
