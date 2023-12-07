package com.MultiThreading.example1;

public class ProgramAPP {

	public static void main(String[] args) {
		PrintNum printNum = new PrintNum();
		PrintChar printChar = new PrintChar();
		
		printNum.start();
		printChar.start();
		

	}

}
