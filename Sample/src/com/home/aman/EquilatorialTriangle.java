package com.home.aman;

public class EquilatorialTriangle {
 
	public static void main(String[] args) {
		
	int n =10;
	int num =n+3;
	for(int i=0;i<n;i++) {
        for(int k=num;k!=0;k--) {
        	System.out.print(" ");
        }for(int j=1;j<i;j++) {
        	System.out.print(j + " ");
        } 
        System.out.println("");
			num--;
		}
	
	}
	
}

