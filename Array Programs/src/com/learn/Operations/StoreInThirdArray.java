package com.learn.Operations;

import java.util.Scanner;

public class StoreInThirdArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter The array size : ");
		int size = scanner.nextInt();

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];

		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scanner.nextInt();
		}

		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = scanner.nextInt();
		}

		for (int i = 0; i <= arr3.length - 1; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.print("First Array is : ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		System.out.print("Second Array is : ");

		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		System.out.print("Sum of two Array is : ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr3[i] + " ");
		}
		scanner.close();
	}

}
