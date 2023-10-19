import java.util.Scanner;

public class GcdPrimeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int b = scan.nextInt();
		int Result = FindGcd.gcd(a,b);
		
		System.out.println("GCD of "+ a + " and "+b+" is "+Result);
		int prime =PrimeCheck.CheckPrime(Result);
		if(prime == -1)
		{
			System.out.println(Result+" is not a Prime Number.");
		}
		else {
			System.out.println(Result +" is a Prime Number.");
		}
		scan.close();
		
	}

}
