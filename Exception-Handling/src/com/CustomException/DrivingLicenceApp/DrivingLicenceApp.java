package com.CustomException.DrivingLicenceApp;

import java.util.Scanner;

public class DrivingLicenceApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = scanner.nextInt();
		try {
			applyLicence(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Eligibility Checked");
		}
		
		
	}
	
	public static void applyLicence(int age) throws Exception
	{
		if (age<18)
		{
			throw new UnderAgeException();
		}
		else if (age>65){
			throw new OverAgeException();
		}
	}

}
