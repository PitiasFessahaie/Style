package com.home.aman;

import java.util.HashMap;
import java.util.Iterator;

public class WordDuplicate {

	public static void main(String[] args) {
String letter = "I am am the the skilled skilled selenium auto auto Programmer Programmer coder";

HashMap<String,Integer> ltr = new HashMap<>();
String[] data = letter.split(" ");
for(String s: data) {
	if(ltr.get(s)!=null) {
		ltr.put(s, ltr.get(s)+1);
	}else {
		ltr.put(s, 1);
	}}
	Iterator<String> itrate = ltr.keySet().iterator();
	while(itrate.hasNext()) {
		String word =itrate.next();
		if(ltr.get(word)>1) {
			System.out.println("The word "+word+" is repeated :"+ ltr.get(word));
		}
		
	}
}

}
