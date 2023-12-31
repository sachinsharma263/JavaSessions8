package com.qa.superconcept;
/*
 super keyword is used to call parent class constructor or parent class method
 while calling parent constructor super() call must be the first statement inside child class constructor,super() 
 used inside child class constructor only it should not be used inside method otherwise compiler will give error
 super.method call parent class method and it can be used inside child class constructor or child class method
 */
public class Page {

	String header;
	
	public Page()
	{
		System.out.println("Page--default const");
	}
	public Page(String header)
	{
		System.out.println("Page--param const");
		this.header=header; //this keyword mainly represents the current instance/object of a class
	}
	public void getName() {
		System.out.println("Page--getName");
	}
}
