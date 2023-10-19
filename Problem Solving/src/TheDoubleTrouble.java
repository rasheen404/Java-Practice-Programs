import java.util.Scanner;

public class TheDoubleTrouble {
	
	public static int doubleTheNumber(int num)
	{
		int doubleTheNumber = num * 2 ;
		return doubleTheNumber;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = scan.nextInt();
		int doubleTheNumber = doubleTheNumber(num);
		
		System.out.println("The Double of "+ num+ " is : "+ doubleTheNumber);
		
		
	scan.close();
		
		
	}

}
