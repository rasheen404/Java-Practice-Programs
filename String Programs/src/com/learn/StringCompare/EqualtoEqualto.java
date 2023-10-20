package com.learn.StringCompare;

public class EqualtoEqualto {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";

		if (s1 == s2) {
			System.out.println("Reference are equal.");
		} else {
			System.out.println("Reference are NOT equal.");
		}

		if (s1.equals(s2)) {
			System.out.println("Values are equal.");
		} else {
			System.out.println("Values are NOT equal.");
		}

	}

}
