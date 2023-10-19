import java.util.Scanner;

public class Main {	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Character : ");
	char ch = scan.next().charAt(0);
	
	System.out.println("Enter the Number : ");
	int n = scan.nextInt();
	
	G.Gg(ch, n);
	
	
}

}
