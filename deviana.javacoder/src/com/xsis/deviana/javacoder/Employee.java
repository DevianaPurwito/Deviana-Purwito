package com.xsis.deviana.javacoder;

public class Employee {
	int id;
	String name;
	String address;
	double salary;

	public void info() {
		System.out.println("id :" + this.id);
		System.out.println("name :" + this.name);
		System.out.println("address :" + this.address);
		System.out.println("salary :" + this.salary);
	}
}
