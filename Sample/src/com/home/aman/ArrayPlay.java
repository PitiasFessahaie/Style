package com.home.aman;

public class ArrayPlay {
	//ar[] = {1,0,8,9,0,6,1,0,7} print it this way 1,8,9,6,1,7,0,0,0
	public static void main(String[] args) {
		
		int ar[]= {1,0,8,9,0,6,1,0,7};
	String a = "15";

	System.out.println(a);
		String zero ="";
		String Num = "";
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) 
				{zero +=","+ar[i];}
			else
				{Num +=ar[i]+",";}
			}
			//System.out.println(Num+zero.substring(1));
			
		}
		
		
		
		
	}


