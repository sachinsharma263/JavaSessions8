package com.qa.exceptionhandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			// int i = 9 / 0;

			int a[] = new int[2];
			a[2] = 4;
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}

		System.out.println("B");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
