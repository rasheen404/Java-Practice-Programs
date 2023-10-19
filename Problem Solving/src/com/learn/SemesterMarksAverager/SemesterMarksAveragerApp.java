package com.learn.SemesterMarksAverager;

import java.util.Scanner;

public class SemesterMarksAveragerApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int [] sem = new int [8];
		
		
		for(int i = 1;i<=sem.length;i++)
		{
			System.out.println("Enter the sem" + i +" mark : ");
			sem[i] = scan.nextInt();
		}
		
		Average.calculateAverage(sem[1], sem[2], sem[3], sem[4], sem[5], sem[6], sem[7], sem[8]);
	
	scan.close();
	}

}
