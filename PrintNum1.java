package com.vani.java;

public class PrintNum1 {

	public static void print(int n){
	for(int i=n;i>0;i--){
		
		for(int j=1;j<=i;j++){
			System.out.print(" "+j);
		}
		System.out.println();

	}
		
	}
	// this is the new comment....
	public static void main(String[] args) {
		
		PrintNum1.print(10); // changed number from 5 to 10

	}

}
/*
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
*/