package com.learn.SpecificException;

import java.util.Scanner;

public class SpecificException {
	public static void main(String[] args) {
		// statement might generate Exception
		try {
			System.out.println("Program started Execution.");
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the First Number : ");
			int a = scanner.nextInt();

			System.out.print("Engter the second Number : ");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.print("The result is : " + c);

			// Retrieving Array size
			System.out.print("Enter Array size : ");
			int size = scanner.nextInt();

			// Creating Array
			int[] array = new int[size];

			// Retrieving Element from user and storing
			System.out.print("Enter one element to store in array : ");
			int element = scanner.nextInt();

			// Retrieving index from user and storing
			System.out.print("Enter the index to store the element : ");
			int index = scanner.nextInt();

			// Assigning element to given index value
			array[index] = element;

		} catch (ArithmeticException arithmeticException) {
			System.out.println("Please provide number other than zero.");
		} catch (NegativeArraySizeException negativeArraySizeException) {
			System.out.println("Please enter a positive array size");
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Please enter index in array boundary.");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is Handled.");

		} finally {
			System.out.println("Program execution Ended.");
		}
	}

}
