package com.home.aman;

public class StringGame {

	public static String reverseLast(String word) {
		char last = word.charAt(word.length()-1);
		char secondLast = word.charAt(word.length()-2);
		String data = word.substring(0,word.length()-2);
		
		return data + last + secondLast;
	}
	public static void main(String[] args) {
		System.out.println(reverseLast("intelligent12"));
		
		
	}
}
