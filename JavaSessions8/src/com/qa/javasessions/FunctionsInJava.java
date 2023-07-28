package com.qa.javasessions;

import java.util.ArrayList;
import java.util.List;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		System.out.println(obj.getTrainername());

		int days = obj.getTotalDays();
		System.out.println(days);

		String ar[] = obj.getStudent();
		System.out.println("hashcode: "+ar.hashCode());
		for (String s : ar) {
			System.out.println(s);
		}
		System.out.println(5 + 5);
		System.out.println("naveen");

		int marks = obj.getStudentMarks("naveen");
		System.out.println(marks);

		System.out.println(obj.launchBrowser("chrome"));
		
		List<String> linkList=obj.getPageLinks("loginPage");
		for(int i=0;i<linkList.size();i++)
		{
			System.out.println(linkList.get(i));
		}
		
	}

	// 1. no input parameter and no return
	public void test() {
		System.out.println("test method");
	}

	// 2. no input but some return
	public String getTrainername() {
		return "naveen";
	}

	public int getTotalDays() {
		return 7;
	}

	public String[] getStudent() {
		String studentName[] = new String[3];
		studentName[0] = "naveen";
		studentName[1] = "bhawna";
		studentName[2] = "mukesh";
		
		System.out.println("hashcode: "+studentName.hashCode());

		return studentName;
	}

	// 3. some input and some return
	public int sum(int a, int b) {
		return a + b;
	}

	// 4. some input and no return
	public void printTrainerName(String name) {
		System.out.println(name);
	}

	/*
	 * create a function pass one param as string:studentName return int:the marks
	 * of the student
	 */
	public int getStudentMarks(String studentName) {
		if (studentName.equals("naveen")) {
			return 90;
		} else if (studentName.equals("bhawna")) {
			return 95;
		} else if (studentName.equals("deepak")) {
			return 92;
		} else {
			System.out.println(studentName + " not found");
		}
		return 0;
	}

	public int getStudentMarks2(String studentName) {
		int marks = 0;
		if (studentName.equals("naveen")) {
			marks = 90;
		} else if (studentName.equals("bhawna")) {
			marks = 95;
		} else if (studentName.equals("deepak")) {
			marks = 92;
		} else {
			System.out.println(studentName + " not found");
		}
		return marks;
	}

	/*
	 * create a function:launchBrowser take input parameter as browser return void
	 */
	public String launchBrowser(String browserName) {
		String plugin = null;
		if (browserName.equals("chrome")) {
			System.out.println("chrome launched");
			plugin = "chrome";
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox launched");
			plugin = "firefox";
		} else {
			System.out.println(browserName + " not found");
		}
		return plugin;
	}

	/*
	 * create a function:getPageLinks pass one parameter: pageName return:list of
	 * links on the page
	 */
	public List<String> getPageLinks(String page) {

		List<String> linkList = new ArrayList<String>();
		if (page.equals("loginPage")) {
			linkList.add("forgot password");
			linkList.add("signup");
			linkList.add("reset password");
		} else if (page.equals("homePage")) {
			linkList.add("user profile");
			linkList.add("logout");
			linkList.add("contacts");
		} else {
			System.out.println(page + " not found");
		}
		return linkList;
	}
}
