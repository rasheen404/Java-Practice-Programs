import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any one character :");
		
		char any = scan.next().charAt(0);
		System.out.println(any);
		
		scan.close();
	}



}
