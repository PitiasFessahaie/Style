package com.home.aman;

public class MissingNum {
public static void main(String[] args) {
	
	
	int arr[]= {1,2,4,5,6,7,8,9,10};
	
	int j=1;
	
	for(int i=0;i<=9;i++) {
		
	   if(j!=arr[i]) {
		   System.out.println("The Duplicate is "+j);
		   i=10;
	   } j++;
	}
}
}
