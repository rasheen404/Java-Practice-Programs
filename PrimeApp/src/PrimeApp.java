import java.util.Scanner;

public class PrimeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number to check : ");
		int n = scan.nextInt();
		
		int result = CheckPrime.CheckPrimeNum(n);
		
		if (result == -1)
		{
			System.out.println(n + " is not a Prime Number.");
		}
		else {
			System.out.println(n + " is a Prime Number.");
		}
	scan.close();
	}

}
