package com.vani.java;

public class PrintNum4 {

	public static void print(int n) {

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++)
				System.out.print(" ");
			for (int j = i+1; j <= n; j++)
				System.out.print(j-i);

			System.out.println();
		}
	}

	public static void main(String[] args) {

		PrintNum4.print(5);

	}

}
/*
12345
 1234
  123
   12
    1*/