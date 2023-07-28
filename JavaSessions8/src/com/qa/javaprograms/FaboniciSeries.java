package com.qa.javaprograms;

import java.util.Scanner;
/*
 * Fibonacci series in Java
 * The first two numbers of fibonacci series are 0 and 1.
 * next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 */
public class FaboniciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.print(a + " " + b+" ");

		for (int i = 0; i < num; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}

}
