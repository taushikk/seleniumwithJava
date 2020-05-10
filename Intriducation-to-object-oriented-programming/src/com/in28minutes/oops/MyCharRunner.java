package com.in28minutes.oops;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('u');
		System.out.println(myChar.isVowel() + ": This is Vowel");
		System.out.println(myChar.isConsonant() + ": This is Consonant");
		System.out.println(myChar.isDigit() + ": This is a Digit");
		System.out.println(myChar.isAlphabet() + ": This is Alphabet");
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
