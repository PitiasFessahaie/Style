package com.home.aman;

public class Junk3 {
	public static void main(String[] args) {

		counter("This is great",'i');
	}

	private static void counter(String  word, char a) {
	  
		int ct=0;
		for(int i=0;i<word.length();i++) {
		  char c =word.charAt(i);
		  if(c==a) {
			  ct++;
		  }}
		  System.out.println("The letter is duplicated: "+ct);
	  
		
	}
}
