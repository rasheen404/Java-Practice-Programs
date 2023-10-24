package com.learn.chartoStringBuilder;

import java.util.Scanner;

public class ChartoStringBuilder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		String input = scanner.nextLine();

		char[] arr = input.toCharArray();
		StringBuilders(arr);

	}

	public static void StringBuilders(char[] arr) {
		StringBuilder result = new StringBuilder();
		for (char i : arr) {
			result.append(i+" ");
		}
		String sb = result.toString();
		System.out.println(sb);
	}

}
