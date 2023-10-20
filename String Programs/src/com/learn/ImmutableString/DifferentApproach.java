package com.learn.ImmutableString;

public class DifferentApproach {

	public static void main(String[] args) {
		
		//Approach 1
		String s1 = "Hello World!";
		
		//Approach 2
		String s2 = new String("Hello World!");
		
		//Approach 3
		
		char[] arr= {'H','e','l','l','o',' ','W','o','r','l','d','!'};
		String s3 = new String(arr);
		
		
		//Displaying 
		
		System.out.println("Approach 1 : "+ s1);
		System.out.println("Approach 2 : "+ s2);
		System.out.println("Approach 3 : "+ s3);
		
		

	}

}
