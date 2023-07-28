package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

	// WebDriver
	@Override
	public void launchBrowser() {
		System.out.println("ChromeDriver--launchBrowser");
	}

	@Override
	public void getTitle() {
		System.out.println("ChromeDriver--getTitle");
	}

	@Override
	public void click() {
		System.out.println("ChromeDriver--click");
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver-closeBrowser");
	}

	// Protractor
	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver--launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("ChromeDriver--maximize");
	}

	// chromedriver
	public void headLess() {
		System.out.println("ChromeDriver--headLess");
	}

	public void incognito() {
		System.out.println("ChromeDriver--incognito");
	}
	//WebBrowser
	@Override
	public void getCookies() {
		System.out.println("ChromeDriver--getCookies");
	}

	@Override
	public void test() {
		System.out.println("ChromeDriver--test--ChromeDriver implements test() from both i1 and i2");
		
	}
	

}
