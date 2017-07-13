package com.xsis.deviana.javacoder;

public class Employee {
	// constructor
	public Employee() {

	}

	public Employee(int id, String name, String address, Double salary, String noHp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.noHp = noHp;
	}

	// property
	private int id;
	private String name;
	private String address;
	private Double salary;
	private String noHp;
	
	
	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void info() {
		System.out.println("id :" + this.id);
		System.out.println("name :" + this.name);
		System.out.println("address :" + this.address);
		System.out.println("salary :" + this.salary);
	}
}
