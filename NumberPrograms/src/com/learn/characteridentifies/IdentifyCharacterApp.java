package com.learn.characteridentifies;

import java.util.Scanner;

public class IdentifyCharacterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		
		IdentifyCharacter.Characteridentify(ch);
		
		scan.close();
	}

}
