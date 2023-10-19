import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class GcdApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int b = scan.nextInt();
		int Result = FindGcd.gcd(a,b);
		
		System.out.println("GCD of "+ a + " and "+b+" is "+Result);
		
		scan.close();
		
	}

}
