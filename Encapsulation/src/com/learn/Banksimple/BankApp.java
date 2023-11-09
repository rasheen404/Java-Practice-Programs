package com.learn.Banksimple;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.setMonet(10000);
		
		System.out.println("Taking the amount "+bank.getMoney());

	}

}
