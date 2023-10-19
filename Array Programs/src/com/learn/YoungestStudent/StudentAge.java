
package com.learn.YoungestStudent;
import java.util.Scanner;

public class StudentAge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the no:of Student : ");
		int [] arr = new int[scanner.nextInt()];
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		int smallest = arr[0];
		for(int i =0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("The smallest Age is : "+smallest);
		
	scanner.close();
	}

}
