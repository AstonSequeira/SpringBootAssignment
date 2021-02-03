package com.springAssignment.springAssignment.data;

public class Employee {

	int id;
	String name;
	int age;
	char Gender;
	public Employee(int id, String name, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Gender = gender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Gender=" + Gender + "]";
	}
}
