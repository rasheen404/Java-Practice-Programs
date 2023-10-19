package com.learn.TheStringJoiner;

import java.util.Scanner;

public class TheStringJoinerApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first String : ");
		String str1 = scan.next();
		
		System.out.println("Enter the second String : ");
		String str2 = scan.next();
		
		Joiner.StringJoiner(str1, str2);
		scan.close();
		
	}

}
