package com.learn.PaymentApp;

public class PaymentApp {

	public static void main(String[] args) {
		Upi upi = new Upi();
		upi.Bill();
		upi.Offer();
		upi.Pay();
		
		
		Wallet wallet = new Wallet();
		wallet.Bill();
		wallet.Offer();
		wallet.Pay();
		
		
		Card card = new Card();
		card.Bill();
		card.Offer();
		card.Pay();

	}

}
