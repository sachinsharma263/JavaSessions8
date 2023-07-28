package com.qa.stringconcept;

/*
 * Difference Between "== Operator" And "equals() Method"
 * == is used for reference comparison(address comparison).it means both string variable or refernce point to same object or not, 
 * same memory location
 * compare primitive data type variable.
 * equals method is used to compare two string object whether content is same or not,string literal same or not
 */
public class StringConcept4 {

	public static void main(String[] args) {

		String s1 = new String("naveen");
		String s2 = new String("naveen");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		String s3 = "mukesh";
		String s4 = "mukesh";

		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);

	}

}
