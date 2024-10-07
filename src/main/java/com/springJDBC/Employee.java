package com.springJDBC;

public class Employee {
	private int e_id;
	private String e_name;
	private String e_contact;

	public Employee() {
		super();
	}

	public Employee(int e_id, String e_name, String e_contact) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_contact = e_contact;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_contact() {
		return e_contact;
	}

	public void setE_contact(String e_contact) {
		this.e_contact = e_contact;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_contact=" + e_contact + "]";
	}

}
