package com.qa.superconcept;

public class LoginPage extends Page {

	String title;
	
	public LoginPage()
	{
		//super("");
		System.out.println("LoginPage--default const");
	}
	public LoginPage(String title)
	{
		super(title);
		super.getName();
		System.out.println("LoginPage--param const");
	}
	public void getClassName() {
		//super();
		super.getName();
		System.out.println("LoginPage--getClassName");
	}
}
