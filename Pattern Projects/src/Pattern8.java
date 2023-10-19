import java.util.Scanner;


public class Pattern8 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the charecter : ");
		char ch = scan.next().charAt(0);
		for (int k = 1; k <= 5; k++) 
		{
			for (int i = 1; i <= 6-k; i++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*k)-1; j++) 
			{
				System.out.print(ch);
				continue;
			}
			System.out.println();
		}

		scan.close();
	}
}
