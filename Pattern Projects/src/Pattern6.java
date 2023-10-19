import java.util.Scanner;

public class Pattern6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the character : ");
	char ch = scan.next().charAt(0);
	
	System.out.println("Enter the value of n : ");
	int n = scan.nextInt();
	
	for(int i = 1;i<=n;i++)
	{
		for(int j = 1;j<=n+1-i;j++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	
	scan.close();
}
}
