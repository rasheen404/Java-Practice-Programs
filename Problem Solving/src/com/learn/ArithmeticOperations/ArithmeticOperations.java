package com.learn.ArithmeticOperations;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter the Second number : ");
		int num2 = scan.nextInt();
		
		AdditionNumbers.Add(num1, num2);
		SubtractNumbers.Sub(num1, num2);
		MultiplyNumbers.Mul(num1, num2);
		DivideNumbers.Div(num1, num2);
		FindRemainder.Rem(num1, num2);
		
		
		
	scan.close();
	}

}
