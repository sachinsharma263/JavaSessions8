package com.qa.inheritance;

public class Bmw extends Car {

	//@Override
	public static void test() {
		System.out.println("Car--test");
	}
	@Override
	public void start() {
		System.out.println("Bmw--start");
	}
	public void sunRoof() {
		System.out.println("Bmw--sunRoof");
	}
}
