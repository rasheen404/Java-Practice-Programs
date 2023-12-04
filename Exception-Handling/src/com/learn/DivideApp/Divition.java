package com.learn.DivideApp;

import java.util.Scanner;

public class Divition {
	public static void main(String[] args) {
		//statement might generate Exception
		try {
			System.out.println("Program started Execution.");
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the First Number : ");
			int a = scanner.nextInt();

			System.out.print("Engter the second Number : ");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println("The result is : " + c);
			
			

		} catch (Exception e) {
			System.out.println("Exception is Handled.");

		} finally {
			System.out.println("Program execution Ended.");
		}
	}

}
