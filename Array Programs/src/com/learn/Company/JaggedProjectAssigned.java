package com.learn.Company;

import java.util.Scanner;

public class JaggedProjectAssigned {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no:of Branch : ");

		String[][][] arr = new String[scanner.nextInt()][][];

		System.out.println("Enter the no:of Teams : ");

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = new String[scanner.nextInt()][];
		}

		System.out.println("Enter the no:of Employee : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; i++) {
				arr[i][j] = new String[scanner.nextInt()];
			}
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("Enter the Name  of Employee " + (k + 1) + " of Team " + (j + 1) + " of branch "
							+ (i + 1) + " : ");
					arr[i][j][k] = scanner.next();
				}
			}
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("The Name of Employee " + (k + 1) + " of Team " + (j + 1) + " of Branch "
							+ (i + 1) + " is : " + arr[i][j][k]);
				}
			}
		}
		scanner.close();
	}
}
