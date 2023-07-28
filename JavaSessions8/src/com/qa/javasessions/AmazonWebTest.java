package com.qa.javasessions;

public class AmazonWebTest {

	public static void main(String[] args) {

		AmazonWebPage amz = new AmazonWebPage();

		AmazonWebPage amzI = new AmazonWebPage("Amazon india header", "Amazon india footer", "Amazon india");
		AmazonWebPage amzG = new AmazonWebPage("Amazon global header", "Amazon global footer");

		System.out.println(amzI.header + " " + amzI.footer + " " + amzI.title);

		System.out.println(amzG.header + " " + amzG.footer + " " + amzG.title);
	}

}
