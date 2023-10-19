package com.learn.TheDoubleTrouble;

import java.util.Scanner;

public class TheDoubleTroubleApp {

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number to Double  : ");
	int n = scan.nextInt();
	
	TheDoubleTrouble.Double(n);
	
	scan.close();
}


}
