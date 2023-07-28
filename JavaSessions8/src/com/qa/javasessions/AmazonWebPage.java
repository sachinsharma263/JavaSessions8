package com.qa.javasessions;

public class AmazonWebPage {

	String header;
	String footer;
	String title;

	public AmazonWebPage(String header, String footer, String title) {
		this.header = header;
		this.footer = footer;
		this.title = title;
	}

	public AmazonWebPage(String header, String footer) {
		this.header = header;
		this.footer = footer;
	}

	public AmazonWebPage(String title) {
		this.title = title;
	}

	public AmazonWebPage() {
		System.out.println("welcome to amazon");
	}
}
