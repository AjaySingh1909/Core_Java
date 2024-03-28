package com.gettersetter;

public class getset {		
	String name;
	byte age;
	double salary;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		getset obj1= new getset("Ajay", (byte)22, 22500.00);
		System.out.println(obj1);
	}
	
	public getset(String name, byte age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "getset [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
