package com.learn.Multiplication;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to multiply : ");
	int num = scanner.nextInt();
	

	multiplication(num,1);

	}
	public static void multiplication(int num,int times)
	{
		if(times == 11)
		{
			return;
		}
		else {
			System.out.println(num+" * "+times+" = "+(num*times));
			times++;
			multiplication(num,times);
		}
	}

}
