package com.learn.Palindrom;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		
		char[] arr1 =str.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		int i = arr1.length-1;
		
		for(int j = 0;j<=arr1.length-1;j++)
		{
			arr2[j] = arr1[i];
			i--;
		}
		String result = new String(arr2);

if(result.equals(str))
{
	System.out.println("The string is a Palindrom.");
}
else {
	System.out.println("The string is not a Palindrom.");
}
		
		
	}



}
