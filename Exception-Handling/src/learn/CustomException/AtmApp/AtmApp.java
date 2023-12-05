package learn.CustomException.AtmApp;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the amount to withdraw : ");
		int amount = scanner.nextInt();
		try {
			transferable(amount);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());;
		}

	}
	public static void transferable(int amount) throws Exception
	{
		if(amount<10000)
		{
			System.out.println("Amount is Taken");
		}
		else {
			throw new InsufficiantBalanceException();
		}
	}

}
