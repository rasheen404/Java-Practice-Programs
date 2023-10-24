package com.learn.Casechanger;

import java.util.Scanner;

public class CaseChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scanner.nextLine();
		
		String result = Case(str);
		System.out.println(result);

	}
	public static String Case(String str) {
		char [] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

		String result=new String(arr);
		return result;
	}
	

}
