package com.in28minutes.oops;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with Most number of characters : " + dayWithMostCharacters);
	}

}
