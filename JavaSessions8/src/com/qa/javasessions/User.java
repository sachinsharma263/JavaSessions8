package com.qa.javasessions;

public class User {

	String name;
	int age;
	char gender;
	String address;
	long phone;
	boolean isActive;

	public User() {
		System.out.println("default const.- 0 param");
	}

	public User(int age) {
		this.age = age;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public User(String name, int age, char gender, String address, long phone, boolean isActive) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		User u1 = new User();
		User u2 = new User("naveen", 30);
		User u3 = new User("naveen", 30, 'm', "delhi", 999999999, true);

		System.out.println(
				u1.name + " " + u1.age + " " + u1.gender + " " + u1.address + " " + u1.phone + " " + u1.isActive);

		System.out.println(
				u2.name + " " + u2.age + " " + u2.gender + " " + u2.address + " " + u2.phone + " " + u2.isActive);

		System.out.println(
				u3.name + " " + u3.age + " " + u3.gender + " " + u3.address + " " + u3.phone + " " + u3.isActive);

	}

}
