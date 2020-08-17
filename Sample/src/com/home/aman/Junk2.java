package com.home.aman;

import java.util.HashMap;
import java.util.Iterator;

public class Junk2 {
	public static void main(String[] args) {

		String words = "find find the data  the duplicate of of the the Sentence on the data ";
         HashMap<String,Integer> map = new HashMap<>();
         String arr[] = words.split(" ");
         for(String s:arr) {
        	 if(map.get(s)!=null) {
        		 map.put(s, map.get(s)+1);
        	 }else {map.put(s, 1);} 
         }
	
         Iterator<String> itr = map.keySet().iterator();
         while(itr.hasNext()) {
        	 String word = itr.next();
        	 if(map.get(word)>1) {
        		 System.out.println("The word "+word+ " is repeated :"+map.get(word));
        	 }
         }
         
		
	
		
}
	}

