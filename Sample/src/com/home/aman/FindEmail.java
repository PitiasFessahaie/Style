package com.home.aman;

import java.util.ArrayList;
import java.util.Iterator;

public class FindEmail {
	
	

	public static void main(String[] args) {
		String line = "some of the email adhoc@org is wrong sam@aol.com find frank@me me the zara@gmail.com right once "; 
		
		select(line);
		
	}

	private static void select(String line) {
		ArrayList<String> list = new ArrayList<String>();
		String[] data = line.split(" ");
		for(String s:data) {
			if(s.contains("@")) {
				list.add(s);
			}
		} 
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String mail = itr.next();
			if(mail.contains(".com")) {
				System.out.println("real:"+mail);
			}else
			{System.out.println("fake:"+mail);}
		}System.out.println("\n");
}
}