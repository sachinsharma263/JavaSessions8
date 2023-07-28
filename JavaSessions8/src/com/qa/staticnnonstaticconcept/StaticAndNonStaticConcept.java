package com.qa.staticnnonstaticconcept;

public class StaticAndNonStaticConcept {

	String name = "Tom";
	static int age = 30;

	public void getDiscount() {
		System.out.println("getDiscount");
	}

	public static void getPrice() {
		System.out.println("getPrice");
	}

	public static void main(String[] args) {

		// call non static
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.getDiscount();
		
		obj.getPrice();
		System.out.println(obj.age);
		
		//StaticAndNonStaticConcept.name=30;
		//StaticAndNonStaticConcept.getDiscount();

		// call static
		System.out.println(age);
		getPrice();

		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.getPrice();
	}

}
