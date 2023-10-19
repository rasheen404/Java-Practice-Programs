import java.util.Scanner;

public class BonusApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		int salary = scan.nextInt();
		
		Bonus.CheckBonus(salary);
		
		scan.close();
		
	}

}
