package com.learn.GCDnumber;

import java.util.Scanner;
public class GcdApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		System.out.println("Enter Second Number");
		int b = scan.nextInt();
		
		int m = Gcd.Findgcd(a,b);
		System.out.println(m);
		
		scan.close();
	}



}
