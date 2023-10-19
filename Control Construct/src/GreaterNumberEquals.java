import java.util.Scanner;

public class GreaterNumberEquals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a =  scan.nextInt();
		System.out.println("Enter the Second Number : ");
		int b =  scan.nextInt();
		
		larger(a, b);
		
			
		scan.close();
	}
	
	static void larger(int a,int b)
	{
		if (a > b)
		{
			System.out.println(a + " is the Larger Number");
		}
		else if (a == b)
		{
			System.out.println("The given Numbers are Equal.");
			
		}
		else {
			System.out.println(b + " is the Larger Number");
		}
	}
	
	


}
