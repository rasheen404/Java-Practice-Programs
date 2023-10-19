package com.learn.SumofNatural;

import java.util.Scanner;

public class SumofNaturalApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number");
	int n = scan.nextInt();
	
	SumofNatual.SumNatural(n);
	
	
	scan.close();
}
}
