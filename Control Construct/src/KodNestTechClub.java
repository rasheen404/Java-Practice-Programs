//if selection control 

import java.util.Scanner;


public class KodNestTechClub {
	//mark method
	 
	static void mark(int mark)
	{
		if (mark >= 90)
		{
			System.out.println("Welcome To KodNest Tech Club");
		}
		
	}
	
	//main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Mark : ");
		int mark = scan.nextInt();
		mark(mark);
		
		
		scan.close();
	}

}
