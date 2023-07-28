package com.qa.classesnobject;

public class Page {

	String title;
	String url;
	int loadingTime;

	public static void main(String[] args) {

		Page loginPage = new Page();
		loginPage.title = "Gmail login";
		loginPage.url = "http://gmail.com";
		loginPage.loadingTime = 5;

		Page homePage = new Page();
		homePage.title = "Gmail home";
		homePage.url = "http://gmail.com/home.jsp";
		homePage.loadingTime = 10;

	}
}
