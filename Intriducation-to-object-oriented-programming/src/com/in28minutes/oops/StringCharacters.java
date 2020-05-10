package com.in28minutes.oops;

public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String biggerString = "This is very critical time due to COVID-19";

		String reverse = null;
		for (int i = biggerString.length() - 1; i >= 0; i--) {
			reverse = reverse + biggerString.charAt(i);
		}

		System.out.print("Reversed string is:");
		System.out.println(" ");
		System.out.println(reverse);

	}

}

