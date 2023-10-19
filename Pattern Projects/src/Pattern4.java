import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Character : ");
		
		char ch = scan.next().charAt(0);
		for(int n = 1;n<=5;n++)
		{
		for(int i = 1;i<=5;i++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
	}
		scan.close();
	}
}
