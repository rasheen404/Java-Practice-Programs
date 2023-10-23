package com.learn.StringtoArray;

import java.util.Scanner;

public class StringtoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = scanner.nextLine();
		
		char [] arr = str.toCharArray();
		
		for(char ch:arr)
		{
			System.out.print(ch+" ");
		}
	}

}
