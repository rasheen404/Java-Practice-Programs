package com.learn.Composition;

public class BookApp {

	public static void main(String[] args) {
		Book book = new Book("KodNest");
		book.readBook();
		book.page.writeContent();
		

	}

}
