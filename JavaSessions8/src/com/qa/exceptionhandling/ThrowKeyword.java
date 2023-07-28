package com.qa.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("NoDataFoundException");
		} catch (Exception e) {

			e.printStackTrace();
		}

		String data = "";

		if (data.equals("")) {
			try {
				throw new Exception("NoDataAvailable");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
