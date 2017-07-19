package com.hc.str;

import java.util.HashMap;

public class OccuranceOfChar {
	public static void main(String[] args) {
		
		String input = "javaa";
		System.out.println("Input " + input);
		HashMap<Character, Integer> charData = new HashMap<Character, Integer>();
		char[] ch = input.toCharArray();
		for (Character c : ch) {
			if (charData.containsKey(c)) {
				int count = charData.get(c);
				charData.put(c, count + 1);
			}else {
				charData.put(c, 1);
			}
		}
		System.out.println("Occurance " + charData);
	}
}
