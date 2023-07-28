package com.qa.stringconcept;

/*
 * in java string is a class not a data type and can be instantiated like other classes
 * inside package java.lang
 * 2 different ways of creating string either by new keyword or without new keyword
 * anything inside double quotes is a string
 * string why class?because when java developers start developing the java,in any application the most frequent value used is string.so java developer thought
 * that we will encounter string value multiple times while creating an application so its better to provide string as a class with predefined methods/api so
 * that developer/user doesn't waste time in developing methods for string manipulation
 * 
 * string is immutable(anything that cannot change/update):once created cannot change,update or modify,each time we try updating a new string object created
 * 
 * 
 * Smart Programming
 * Strings Introduction in Java by Deepak (Hindi)1:https://youtu.be/-pBlL1lLmlE
 * String Constant Pool in Java || String Object Creation in Java:https://youtu.be/UBYW08L3QRk
 * What is String Immutable || Why String Object Is Immutable In Java (Hindi):https://youtu.be/4cEsJtuW4YY
 * StringBuffer Class & Methods in Java with Example:https://youtu.be/G4xQs6Tcsn4
 * StringBuilder Class & Methods in Java with Example:https://youtu.be/7Eums_vwcPs
 * Difference Between String StringBuffer and StringBuilder in Java by Deepak:https://youtu.be/_m04SPTU4N0
 * String Class Methods (length(), isEmpty() & trim()) In Java || Check String is Empty Or Not:https://youtu.be/0Z15RrOrRos
 * String Class Constructors in Java || Why char Array is Better to Store Password Than String (Hindi):https://youtu.be/Bm7GFNtZuWc
 */
public class StringConcept2 {

	public static void main(String[] args) {

		String s = "Rahul";// 1 string object created inside scp, without new keyword still object

		// created,this is special case
		// a new object get created inside scp
		// for better memory utilisation we have scp
		// whenever you tried creating string this way,JVM search whether string literal
		// already exist in SCP or not and if not then create a new object
		// in SCP
		// reuse the object

		String s2 = "Rahul";// 0 object created.JVM will check in scp whether Rahul string literal present
							// in scp or not,if present then jvm wont create object
		// s2 will point to same object whch s pointing

		if (s.equals(s2)) {
			System.out.println("equal");
		}
		System.out.println(s.hashCode() + "\n" + s2.hashCode());

		s2 = "Arora";

		System.out.println(s + "\n" + s2);
		System.out.println(s.hashCode() + "\n" + s2.hashCode());

		String s3 = new String("way2automation");// there are chances that 2 objects gets created one in heap sure due
													// to new keyword and another in SCP due
		// to string literal if not present in SCP

		String s4 = new String("Rahul");// 1 object created in heap,Rahul already exist in SCP so no new object in SCP

		// string concatenation-->way to combine two or more string into single string
		// using + operator
		// string values can be concatenate with any other data type

		System.out.println(10 + 3 + s + s2);

		String s5 = new String("naveen");

		System.out.println(s5.hashCode());

		System.out.println(s5.concat("java").hashCode());

		s5 = s5.concat("java2");

		System.out.println(s5.hashCode());

		// optimize memory utilisation->string is immutable

		String s6 = "way";
		String s7 = "2";
		String s8 = "automation";

		System.out.println(s6 + s7 + s8);
		// System.out.println(s6,s7,s8);

		System.out.println(s + 10 * 15 + s2);

		System.out.println(s6 + (10 + 15) + s7 + s8);

		// System.out.println(s-s2);

	}

	@Override
	public boolean equals(Object anObject) {

		return true;
	}

}
