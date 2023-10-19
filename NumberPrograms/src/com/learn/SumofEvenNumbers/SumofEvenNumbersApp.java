package com.learn.SumofEvenNumbers;

import java.util.Scanner;

public class SumofEvenNumbersApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int n = scan.nextInt();
	
	SumofEvenNumbers.SumEven(n);
	
	scan.close();
}
}
