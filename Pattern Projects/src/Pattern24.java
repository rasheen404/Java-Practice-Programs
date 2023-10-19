import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		
		for(int i = 0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0 || i == 10)
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
