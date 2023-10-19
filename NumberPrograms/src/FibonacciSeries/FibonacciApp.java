package FibonacciSeries;

import java.util.Scanner;

public class FibonacciApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		
		FibonacciSeries.Fibonocci(n);
		
		scan.close();
	}

}
