import java.util.Scanner;

public class ArithmeticOperations {
	
	static int additionNumbers(int a , int b)
	{
		int sum =  a + b;
		return sum;
	}
	static int subtractNumbers(int a , int b)
	{
		int sub =  a - b;
		return sub;
	}
	static int multiplyNumbers(int a , int b)
	{
		int mul =  a * b;
		return mul;
	}

	static double divideNumbers(int a , int b)
	{
		double div =  a / b;
		return div;
	}

	static int findRemainder(int a , int b)
	{
		int reminder =  a % b;
		return reminder;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int num2 = scan.nextInt();
		
		int additionNumbers = additionNumbers(num1,num2);
		int subtractNumbers = subtractNumbers(num1,num2);
		int multiplyNumbers = multiplyNumbers(num1,num2);
		double divideNumbers = divideNumbers(num1,num2);
		int findRemainder = findRemainder(num1,num2);
		
		System.out.println("Sum of "+ num1+ " and "+num2+ " is : " +additionNumbers);
		System.out.println("Substraction of "+ num1+ " and "+num2+ " is : " +subtractNumbers);
		System.out.println("Multiplication of "+ num1+ " and "+num2+ " is : " +multiplyNumbers);
		System.out.println("Division of "+ num1+ " and "+num2+ " is : " +divideNumbers);
		System.out.println("Reminder of "+ num1+ " and "+num2+ " is : " +findRemainder);
		

		scan.close();
	}

}
