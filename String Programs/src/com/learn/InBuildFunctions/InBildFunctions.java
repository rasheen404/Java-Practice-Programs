package com.learn.InBuildFunctions;

import java.util.Scanner;

public class InBildFunctions {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the String : ");
	String str = scanner.nextLine();
	
	System.out.println("The Enteres String is : "+str);
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.isEmpty());
	
	System.out.println("Enter the position of CharAt : ");
	int ch = scanner.nextInt();
	System.out.println(str.charAt(ch));
	
	System.out.println("Enter the character to search index : ");
	char index = scanner.next().charAt(0);
	System.out.println(str.indexOf(index));
	
	System.out.println(str.lastIndexOf(index));
	
	System.out.println("Enter the word to search : ");
	String word = scanner.next();
	System.out.println(str.contains(word));

	System.out.println("Enter the word to search is it starting with: ");
	String start = scanner.next();
	System.out.println(str.startsWith(start));
	
	System.out.println("Enter the word to search is it starting with: ");
	String end = scanner.next();
	System.out.println(str.endsWith(end));
	
	System.out.println("Enter the character to replace and with which : ");
	char og = scanner.next().charAt(0);
	char re = scanner.next().charAt(0);
	System.out.println(str.replace(og, re));

}
}
