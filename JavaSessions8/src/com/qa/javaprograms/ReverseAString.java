package com.qa.javaprograms;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String rev = "";

		char c[] = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}

		// System.out.println(rev);
		System.out.println(reverseAString2(s));
	}

	public static String reverseAString(String s) {
		String rev = "";
		char c[] = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		return rev;
	}
	public static String reverseAString2(String s) {
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}