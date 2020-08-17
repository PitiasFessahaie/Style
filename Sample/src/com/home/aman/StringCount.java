package com.home.aman;

public class StringCount {

	public static void main(String[] args) {
		
		
		counter("This is fun",'i');
		
	}
	private static void counter(String word,char letter) {
		int count = 0;
		char ch;
		
		for(int i=0;i<word.length();i++) {
			ch = word.charAt(i);
			if(ch== letter) {
				count++;
			}
		}
		System.out.println("The letter is repeated "+count+ " Times");
	}
}
