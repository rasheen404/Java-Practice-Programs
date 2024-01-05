
//ARRAYS IN JAVA 
//	arrays is store multiple values in single Variable.

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] age = { 25, 23, 28, 21, 17, 32, 30 };

		age[4] = 19;
		System.out.println(age[4]);

		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}

		System.out.println();
		
		// ---------------------EXAMPLE ---------------------------------------------
		System.out.println("Enter the array size :");
		int size = scanner.nextInt();
		String[] cars = new String[size];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = scanner.next();
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}

	}
}
