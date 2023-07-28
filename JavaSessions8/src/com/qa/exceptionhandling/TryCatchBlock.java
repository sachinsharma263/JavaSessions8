package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int n = 9 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("B");
	}

}
