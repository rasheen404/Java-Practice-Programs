package com.learn.Palindrome;

import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		int num = scan.nextInt();
		
		Palindrome.CheckPalindrome(num);
		
		scan.close();
		
	}

	
}
