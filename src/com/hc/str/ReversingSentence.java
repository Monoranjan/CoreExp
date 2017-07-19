package com.hc.str;

public class ReversingSentence {
	public static void main(String[] args) {
		String input = "have a good day";
		String rawStr[] = input.split(" ");
		String revStr = "";
		int x = 0x10;
		System.out.println(x);
		for (int i = rawStr.length - 1; i >= 0; i--) {
			revStr += rawStr[i] + " ";
			//System.out.println(rawStr[i]);
		}
		System.out.println(revStr);
	}
}
