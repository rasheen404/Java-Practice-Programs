import java.util.Scanner;

public class PrimeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Starting Number : ");
		int n = scan.nextInt();
		
		for (int i =2 ; i<=n;i++)
		{
		int result = CheckPrime.CheckPrimeNum(i);
		
		if (result != -1)
		{
			System.out.println(i + " is a Prime Number.");
		}
	
	scan.close();
	}
	}

}
