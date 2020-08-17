package com.home.aman;

import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {

		
		//if condition
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of your Fingers !! ");
		int days = scan.nextInt();
		 

		if (days == 10) {
			System.out.println("Correct !!!");
		} else {
			System.out.println("Count your fingers Again!!!");
		}
		scan.close();
	}

}
