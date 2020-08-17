package com.home.aman;

public class RightTriangle {
 
	public static void main(String[] args) {
		
		int n =10;
		int i,j,k;
		int num = n+3;
		for(i=0;i<n;i++) {
			for(k=num;k!=0;k--) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
			num--;
		}
		
			
		}
	
	}
	


