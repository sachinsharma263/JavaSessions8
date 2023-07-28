package com.qa.encapsulation;

public class Company {

	String name;
	int totalEmp;
	String ceoName;
	private String policy;

	public Company() {

	}

	public Company(String name, int totalEmp, String ceoName, String policy) {
		this.totalEmp = totalEmp;
		this.ceoName = ceoName;
		this.policy = policy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public static void main(String[] args) {

		Company obj = new Company();
		// obj.name="Google";

		Company obj2 = new Company("Google", 1000, "Sundar pichai", "financial");

	}
}
