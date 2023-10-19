import java.util.Scanner;
public class GalacticArithmeticApp {
		public static long galacticAddition(long num1, long num2)
		{
			long sum = num1 + num2 ;
			return sum;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter First Number : ");
			long a = scan.nextLong();
			
			System.out.println("Enter Second Number : ");
			long b = scan.nextLong();
			
			long sum = galacticAddition(a, b);
			System.out.println("Sum of the Number is : " +sum);
			
			scan.close();

		

	}
}
