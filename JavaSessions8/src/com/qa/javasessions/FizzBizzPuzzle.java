package com.qa.javasessions;

import java.util.Scanner;

public class FizzBizzPuzzle {
	/*
	 * : if num is divisble by 3: Fizz if num is divisble by 5: Bizz if num is
	 * divisble by 3 and 5: FizzBizz
	 */

	public static void main(String[] args) {

		System.out.println("enter a number:");
		Scanner scan = new Scanner(System.in);
		
			int num = scan.nextInt();
		
		// int num = 15;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("fizzbizz");
		} else if (num % 3 == 0) {
			System.out.println("bizz");
		} else if (num % 5 == 0) {
			System.out.println("bizz");
		} 
		else {
			try {
				throw new Exception("InvalidNumberFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		}
	}
}
