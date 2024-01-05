
//an arrays of array  contain 2 column 2 row

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[][] cars = new String[3][3];
System.out.println("Enter array elements");
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				cars[i][j] = scanner.next();
			}
		}

		System.out.println("Array elements are");
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {

				System.out.print(cars[i][j]+" ");
			}
		}
		
		
		System.out.println();
		//--------------------------EXAMPLE---------------------------
		int[][] age = {
				{24,25,26},
				{27,28,29},
				{30,31,32}
		};
		
		System.out.println("Array elements are");
		for (int i = 0; i < age.length; i++) {
			for (int j = 0; j < age[i].length; j++) {

				System.out.print(age[i][j]+" ");
			}
		}
	
	}
}
