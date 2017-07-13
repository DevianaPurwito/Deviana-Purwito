package com.xsis.deviana.javacoder;

public class Main {
	// primitive data type
	public int umur = 40;

	// polimorphism
	public Integer umur2 = 40;
	public Employee director = new Director();
	public Employee manager = new Manager();
	public Employee employee = new Employee();
	public Employee programmer = new Programmer();

	public void inheritanceExample() {
		//get instance
		//polimorphism
		director = new Director();
		manager = new Manager();
		employee = new Employee();
		programmer = new Programmer();

		director.setSalary(5000.0);
		System.out.println("salary director :" + director.getSalary());

	}

	public static void main(String[] args) {
		// encapsulation
		/*
		 * // empty construct / manual setter Employee emp = new Employee();
		 * emp.setId(1); emp.setName("asziz"); emp.setAddress("banten");
		 * emp.setSalary(5000.0); // direct construct using field Employee emp2
		 * = new Employee(2, "tina", "jakarta selatan", 50009.0);
		 * 
		 * emp.info(); emp2.info();
		 */
		Main main = new Main();
		main.inheritanceExample();
	}
}
