package com.home.aman;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// fizz buzz

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number Please ");
		int number = scan.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("fizzBuzz");
		}
		else if (number % 5 == 0) {
			System.out.println("buzz");
		}
		else if (number%3 == 0) {
			System.out.println("Fizz");
		}

	}

}
