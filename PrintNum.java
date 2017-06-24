package com.vani.java;

public class PrintNum {

	public void print(int n){
	for(int i=1;i<=n;i++){
		
		for(int j=1;j<=i;j++){
			System.out.print(" "+j);
		}
		System.out.println();

	}
		
	}
	
	public static void main(String[] args) {
		
		PrintNum p = new PrintNum();
		p.print(5);
		

	}
	
	
/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5	     
 */

}
