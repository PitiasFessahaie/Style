package com.home.aman;



public class Fibunachi {

	
		public static void main(String[] args) {

   
			fibonachi(10);	
			
	}
public static void  fibonachi(int nth) {
	
	int i;
	int data [] = new int [nth];
	
	data[0]=0;
	data[1]=1;
	
	for(i=2;i<nth;i++) {
		data[i]=data[i-1]+data[i-2];
	}
	for(i=0;i<nth;i++) {
		System.out.print(data[i]+" ");
	}

}		
}
