package com.home.aman;

public class StringGame {

	//reverse the last two strings in the word
	
	public static void main(String[] args) {
		reverseLast("intelligent1234");
		
		
	}
	private static void reverseLast(String word) {
		char last = word.charAt(word.length()-1);
		char blast = word.charAt(word.length()-2);
		String data = word.substring(0, word.length()-2);
		
	System.out.println(data + last +blast);
}
}