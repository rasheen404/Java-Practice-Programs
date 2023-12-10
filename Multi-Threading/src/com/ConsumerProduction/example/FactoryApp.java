package com.ConsumerProduction.example;

public class FactoryApp {
	public static void main(String[] args) {
		Factory f = new Factory();
		Production pr = new Production(f);
		Consumer cr = new Consumer(f);
		
		pr.start();
		cr.start();
	}

}
