package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Map1Runner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion.This has never happened before.";
		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get the Character
			// if it is there , we increment the count
			// if it is not there, initialize to 1
			Integer integer = occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}

		}
		System.out.println(occurances);

		Map<String, Integer> Stringoccurances = new HashMap<>();

		String[] words = str.split(" ");
		for (String word : words) {
			// Get the Character
			// if it is there , we increment the count
			// if it is not there, initialize to 1
			Integer integer = Stringoccurances.get(word);
			if (integer == null) {
				Stringoccurances.put(word, 1);
			} else {
				Stringoccurances.put(word, integer + 1);
			}

		}
		System.out.println(Stringoccurances);
	}

}
