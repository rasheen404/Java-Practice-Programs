package com.learn.FirstCap;

import java.util.Scanner;

public class FirstCap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = scanner.nextLine();
		
		String result = Capital(str);
		
		System.out.println(result);

	}
	public static String Capital(String str)
	{
		char [] arr = str.toCharArray();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(i==0)
			{
				if(arr[i]>='a' && arr[i]<='z')
				{
					arr[i] = (char)(arr[i]-32);
				}
			}
			else if (arr[i]==' ')
			{
				i++;
				if(arr[i]>='a' && arr[i]<='z')
				{
					arr[i] = (char)(arr[i]-32);
				}
			}
		}
		String newstr = new String(arr);
		return newstr;
	}
}
