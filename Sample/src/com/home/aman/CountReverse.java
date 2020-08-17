package com.home.aman;

import java.util.Collections;

public class CountReverse {

	public static void main(String[] args) {
		String count = "The character in this sentence need to be counted";
	int ct=0;
	for(int i=0;i<count.length();i++) {
      if(count.charAt(i)!=0)
		ct++;
		}
	System.out.println(ct);
		
		
		
		String reverse = "let me try to reverse this sentence";
		reverser(reverse);
		
		
				

	}

	private static void reverser(String reverse) {
		StringBuilder str = new StringBuilder(reverse);
		
	System.out.println(	str.reverse());
	                          
		
	}

}
