package com.qa.stringconcept;

public class StringConcept3 extends Object {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("deepak");

		String s = new String(sb);

		System.out.println(s);

		byte b[] = { 101, 102, 103 };
		String s2 = new String(b);
		System.out.println(s2);

		char c[] = { 'a', 'b', 'c' };
		String s3 = new String(c);
		System.out.println(s3);

		String name = "abc";
		String email="abc@gmail.com";
		System.out.println(name.length()+"\n"+email.length());
		
		System.out.println(!name.isEmpty());
		
		if(name.length()==0)
		{
			System.out.println("string is empty");
		}
		else {
			System.out.println("string is not empty");
		}
		
		System.out.println(" abc def ".trim());
		
		String address=null;
		//System.out.println(address.length());//Exception in thread "main" java.lang.NullPointerException
//		System.out.println(address.isEmpty());// java.lang.NullPointerException
		
		String address2="";//string object is empty
		System.out.println(address2.isEmpty()+"\n"+address2.length());
		
		if (address2.isEmpty()) {
			System.out.println("address2 is empty");
		}
		if (address2.isEmpty()==true) {
			System.out.println("address2 is empty");
		}
		String address3=" ";//string object is not empty,having space charcater
		System.out.println(address3.isEmpty()+"\n"+address3.length());
		
		//check whether string is empty or not,remove any space character
		System.out.println(address3.trim().length());
		
		
		String s4="deepak";
		String s5="Deepak";
		System.out.println(s4.equals(s5));
		
		System.out.println(s4.equalsIgnoreCase(s5));
		
		System.out.println(address2.equals(""));
		
		String s6=new String("naveen");
		String s7=new String("naveen");
		
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		
		String s8="rahul";
		String s9="rahul";
		
		System.out.println(s8.equals(s9));
		System.out.println(s8==s9);
		
		String s10="naveen sharma";
		System.out.println(s10.substring(7));
		System.out.println(s10.substring(0, 6));
		
		System.out.println(s10.subSequence(0, 6));
		
		

	}

}
