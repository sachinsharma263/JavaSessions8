package com.qa.classesnobject;

public class Employee {

	String name;
	int age;
	int empId;
	String deptName;
	long phnNumber;
	boolean isActive;
	double salary;
	float f;
	char gender;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "naveen";
		e1.age = 30;
		e1.empId = 123;
		e1.deptName = "QA";
		e1.phnNumber = 9999999999l;
		e1.isActive = true;
		e1.salary=10.5;
		e1.f=10;
		e1.gender='m';

		System.out.println(e1.name + "\t" + e1.age + "\t" + e1.empId + "\t" + e1.deptName + "\t" + e1.phnNumber + "\t"
				+ e1.isActive+"\t"+e1.salary+"\t"+e1.f+"\t"+e1.gender);

		Employee e2 = new Employee();
		e2.name = "deepak";
		e2.empId = 1;
		e2.age = 32;
		e2.deptName = "Finance";
		e2.phnNumber = 9999999;

		System.out.println(e2.name + "\t" + e2.age + "\t" + e2.empId + "\t" + e2.deptName + "\t" + e2.phnNumber);

		Employee e3 = new Employee();
		System.out.println(e3.name + "\t" + e3.age + "\t" + e3.empId + "\t" + e3.deptName + "\t" + e3.phnNumber + "\t"
				+ e3.isActive+"\t"+e3.salary+"\t"+"\t"+e3.gender+"\t"+e3.f);
		
		new Employee();
		new Employee().name="neha"; 
		//new Employee().name;

	}
}
