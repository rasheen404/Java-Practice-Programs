import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charecter : ");
		char ch = scan.next().charAt(0);
		
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=5;j++)
				{
				if (i == 1 || i==5 || j==1 || j ==5)
				{
					System.out.print(ch);
					
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
		}
		
		scan.close();
	}
}
