package com.learn.PaymentApp;

public class PaymentApp {

	public static void main(String[] args) {
		
		Payment ref;
		Upi upi = new Upi();
		ref = upi;
		
		ref.Bill();
		ref.Offer();
		ref.Pay();
		
		
		Wallet wallet = new Wallet();
		ref = wallet;
		ref.Bill();
		ref.Offer();
		ref.Pay();
		
		
		
		Card card = new Card();
		ref = card;
		ref.Bill();
		ref.Offer();
		ref.Pay();
		

	}

}
