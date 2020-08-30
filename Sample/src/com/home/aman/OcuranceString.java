package com.home.aman;

public class OcuranceString {

	
	public static void main(String[] args) {
		
		ocurance("hi, This is great", 'i');
	}

	private static void ocurance(String word, char c) {
		int ct = 0;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(ch==c) {
				ct++;
			}
		} System.out.println("The character "+c+" has appeared "+ct+" Times");
		
	}
}
