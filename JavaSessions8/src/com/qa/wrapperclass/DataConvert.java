package com.qa.wrapperclass;

public class DataConvert {

	public static void main(String[] args) {
		
		//String to int
		
		String s="10";
		System.out.println(s+10);
		
		int n=Integer.parseInt(s);
		System.out.println(n+10);
		
		//numberformatexception
		String s2="10A";
		//int i=Integer.parseInt(s2);//Exception in thread "main" java.lang.NumberFormatException:
		
		//int to string
		int p=10;
		System.out.println(p+10);
		
		System.out.println(10+String.valueOf(p));
		
		//boolean to string
		boolean b=true;
		if (b) {
			
		}
//		if(String.valueOf(b))
//		{
//			
//		}
		
	}

}
