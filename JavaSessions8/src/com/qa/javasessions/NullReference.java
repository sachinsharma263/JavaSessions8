package com.qa.javasessions;

public class NullReference {

	String name;
	int age;

	public NullReference(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

//		NullReference obj = new NullReference("naveen", 30);
//
//		System.out.println(obj.name + " " + obj.age);
//
//		obj = null;
//
//		System.out.println(obj.name);
		
		NullReference obj = null;
		
		obj.name="naveen";

	}

}
