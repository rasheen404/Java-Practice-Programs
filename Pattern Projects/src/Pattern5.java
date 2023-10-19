import java.util.Scanner;

public class Pattern5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a Character : ");
	char ch = scan.next().charAt(0);
	
	System.out.println("Enter the value of n : ");
	int n = scan.nextInt();
	for (int j = 1;j<=n;j++)
	{
	
	for(int i = 1 ;i<=j ; i++)
	{
		System.out.print(ch);
	}
	
	System.out.println();
	}
	
	scan.close();
}
}
