package com.qa.exceptionhandling;



public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException, InterruptedException {
		new ThrowsKeyword().launchBrowser();
		
		Thread.sleep(3000);
		
	}

	public void launchBrowser() throws ArithmeticException {
		System.out.println("launchingBrowser");
		checkBrowserVersion();
		System.out.println("launchedBrowser");
	}

	public void checkBrowserVersion() throws ArithmeticException {
		System.out.println("checkBrowserVersion");
		checkOs();
	}

	public void checkOs() throws ArithmeticException{
		System.out.println("checkOs");
		int n=9/0;
	}
	
	

}
