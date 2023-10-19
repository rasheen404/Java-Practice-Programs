import java.util.Scanner;

public class GreaterThreeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a =  scan.nextInt();
		System.out.println("Enter the Second Number : ");
		int b =  scan.nextInt();
		System.out.println("Enter the Third Number : ");
		int c =  scan.nextInt();

		
		larger(a, b,c);
		
			
		scan.close();
	}
	
	static void larger(int a,int b,int c)
	{
		if (a > b && a > c )
		{
			System.out.println(a + " is the Larger Number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the Larger Number");
		}
		
		else {
			{
				System.out.println(c + " is the Larger Number");
		}
	}
	
	

}

}
