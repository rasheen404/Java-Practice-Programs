package com.example5.Spring.Spring_Project5;

public class Engine {
	int engNo;
	String engType;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(int engNo, String engType) {
		super();
		this.engNo = engNo;
		this.engType = engType;
	}

	public int getEngNo() {
		return engNo;
	}

	public void setEngNo(int engNo) {
		this.engNo = engNo;
	}

	public String getEngType() {
		return engType;
	}

	public void setEngType(String engType) {
		this.engType = engType;
	}

	@Override
	public String toString() {
		return "Engine [engNo=" + engNo + ", engType=" + engType + "]";
	}

}
