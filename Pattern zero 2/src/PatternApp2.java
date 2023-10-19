import java.util.Scanner;

public class PatternApp2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Charecter : ");
		char any = scan.next().charAt(0);
		
		for(int i = 0;i<5;i++)
		{
			System.out.print(any+" ");
		}
		
		scan.close();
	}

}
