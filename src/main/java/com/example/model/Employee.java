package com.example.model;

public class Employee {

	private String name;
	private int number;
	private int age;
	
	public Employee(String name, int number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
