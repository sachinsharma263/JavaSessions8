package com.qa.stringconcept;

public class StringBuilderConcept {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("deepak");
		
		//StringBuffer sb3 ="naveen";//Type mismatch: cannot convert from String to StringBuffer

		System.out.println(sb.capacity());// 16+6(string length)

		StringBuffer sb2 = new StringBuffer();

		System.out.println(sb2.capacity());

		sb2.append("hello");

		System.out.println(sb2.capacity());

		sb2.append("deepak javaa");

		System.out.println(sb2.capacity());// old capacity*2+2

		System.out.println(sb2);

		System.out.println(sb2.length());

		System.out.println(sb2.charAt(0));
		System.out.println(sb2.charAt(16));
		// System.out.println(sb2.charAt(16+1));//
		// java.lang.StringIndexOutOfBoundsException: String index out of range: 17

		System.out.println(sb2.reverse());

		System.out.println(sb2);

		System.out.println(sb2.replace(0, 2, "abc"));

		System.out.println(sb2);

		System.out.println(sb2.delete(0, 2));

		System.out.println(sb2.deleteCharAt(0));

		System.out.println(sb2);

		System.out.println(sb2.substring(1));

		System.out.println(sb2);

		System.out.println("h-" + sb2.substring(0, 2));
		System.out.println("h-" + sb2.subSequence(0, 2));

		System.out.println(sb2);

		System.out.println(sb2.indexOf("v"));

		System.out.println(sb2.lastIndexOf("e"));

		System.out.println(sb2.insert(0, "abc"));

		System.out.println(sb2);

		sb2.setCharAt(1, 'a');

		System.out.println(sb2);

		StringBuffer sb3 = new StringBuffer("deepak");
		StringBuffer sb4 = new StringBuffer("deepak");
		
		System.out.println(sb3.hashCode()+"\n"+sb4.hashCode());

	}
}
