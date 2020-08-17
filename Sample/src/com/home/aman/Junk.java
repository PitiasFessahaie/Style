package com.home.aman;

import java.util.ArrayList;
import java.util.Iterator;

public class Junk {
	public static void main(String[] args) {
		String word = "some of the email adhoc@org is wrong sam@aol.com find frank@me me the zara@gmail.com right samsom@gmail.com once";
		select(word);

	}

	private static void select(String word) {
		ArrayList<String> arr = new ArrayList<>();

		String[] list = word.split(" ");
		for (String s : list) {
			if (s.contains("@")) {
				arr.add(s);
			}
		}
		System.out.println("The @ list :" + arr);
		System.out.println(" ");

		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			String mail = itr.next();
			if (mail.contains(".com")) {
				System.out.println("REAL email " + mail);
			}  else {
				 System.out.println("FAKE email " + mail);
				 }

		}
	}
}