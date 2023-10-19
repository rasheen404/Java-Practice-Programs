import java.util.Scanner;

public class SwitchProgram {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Invalid Number.");
			break;
			
		}
		}
	}
