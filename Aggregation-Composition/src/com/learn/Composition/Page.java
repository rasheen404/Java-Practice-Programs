package com.learn.Composition;

public class Page {
	String content;
	public Page(String content) {
		this.content=content;
		
	}
	void writeContent()
	{
		System.out.println("Writing the content "+content+" on Page.");
	}

}
