package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company obj = new Company();
		obj.setName("Google");
		obj.setTotalEmp(1000);
		obj.setCeoName("Sundar pichai");
		obj.setPolicy("financial");

		System.out.println(obj.getName());
		System.out.println(obj.getTotalEmp());
		System.out.println(obj.getCeoName());
		System.out.println(obj.getPolicy());
		
		Company obj2=new Company();
		obj2.name="Microsoft";
		obj2.getName();
		
		//obj2.policy="finacial";

	}

}
