package com.learn.Composition;

public class Book {
	String author ;
	Page page = new Page("Java");
	public Book(String author) {
		this.author = author;
		
	}
	void readBook()
	{
		System.out.println("Reading book by "+author);
	}

}
