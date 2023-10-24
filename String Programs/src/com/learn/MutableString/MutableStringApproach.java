package com.learn.MutableString;

public class MutableStringApproach {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer("JAVA ");
	System.out.println("Before changing : "+str);
	
	str.append("SQL");
	System.out.println("After changing : "+str);
}
}
