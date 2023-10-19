package SumofDigits;

import java.util.Scanner;

public class SumofDigitApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a Number : ");
	int num = scan.nextInt();
	
	int result = SumofDigits.DigitSum(num);
	System.out.println(result);
	
	scan.close();
}
}
