package com.qa.interfaceconcept;

public interface WebDriver {

//	public WebDriver()
//	{
//	Interfaces cannot have constructors	
//	}

	int time_out = 10;// by default variables inside interface are public static final

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void closeBrowser();

	// no static method in interface
	// public static void test(); we cannot overide static

	// no final method
	// public final void test();
	// in interface final and static are not allowed for methods. for final method
	// no one can override and static cant be override

	/*
	 * cannot create object of an interface only method decleration- method
	 * prototype-no method body no static and final method by default variables
	 * inside interface are public static final jdk 1.8 interface can have default
	 * method with body we can have static method inside interface by default
	 * prototype method in interface are abstract
	 */
	default void run() {
		System.out.println("WebDriver--run");
	}

	public static void visual() {
		System.out.println("WebDriver--visual");
	}

	public void launchUrl();

	public void test();// this abstract method is present in webdriver and protractor interface,
						// implementing classes like chromedriver
	// and firefox which implemnts both interface implemented this method once this
	// allow multiple inheritance through interface

	/*
	 * single implementation for the test() method despite being part of different
	 * 
	 * interfaces In this case, both WebDriver and Protractor interfaces have the same method
	 * signature for the test() method. When ChromeDriver implements both WebDriver and Protractor, it is
	 * required to provide an implementation for the test() method only once. Since
	 * both interfaces have the same method signature, Java treats it as a single
	 * method implementation that satisfies the requirements of both interfaces.
	 * As a result, the ChromeDriver implementation of test() will be used for both WebDriver and
	 * Protractor interfaces, providing a common implementation for the test() method across both interfaces.
	 */

}
