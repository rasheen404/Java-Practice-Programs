package com.learn.CompanyEmployees;

import java.util.Scanner;

public class CompanyEmployeeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of  Company and Employees: ");

		String[][] arr = new String[scan.nextInt()][scan.nextInt()];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("Enter the name of Company " + (i+1) + " Employee " + (j+1));
				arr[i][j] = scan.next();
			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
scan.close();
	}


}
