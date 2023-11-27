package com.learn.Laptop;

public class Laptop {
	
	private String processor;
	private int memorysize;

	public Laptop(String processor, int memorysize) {
		this.processor = processor;
		this.memorysize = memorysize;
		
	}

	public String getProcessor() {
		return processor;
	}

	public int getMemorySize() {
		return memorysize;
	}


}
