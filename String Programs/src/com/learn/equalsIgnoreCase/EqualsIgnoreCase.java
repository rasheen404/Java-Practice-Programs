package com.learn.equalsIgnoreCase;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "JavaSQLPython";
		String s2 = "javasqlpython";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Values are Equal by Ignoring the Cases.");
		}
		else {
			System.out.println("Values are NOT Equal by Ignoring the Cases.");
		}

	}

}
