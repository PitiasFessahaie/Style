package com.home.aman;

public class Swap {
public static void main(String[] args) {
	
	int x =10;
	int y = 20;
	
	System.out.println("Before swap: The value of X is: "+x +" The value of Y is: "+y);
	
	x=x+y; //x=30
	y=x-y;  //y=10
	x=x-y;  //x=20
			
	System.out.println("After swap: The value of X is: "+x +" The value of Y is: "+y);
	
}
}
