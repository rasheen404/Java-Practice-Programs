package com.learn.UniCode;

import java.util.Scanner;

public class UniCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		
		char ch = scanner.next().charAt(0);
		
		int uni = ch;
		
		System.out.println("Unicode of Character "+ch+" is : "+uni);

	scanner.close();
	}

}
