package com.assignmentEmp;

public class Employee {
	String empname;
	int empid;
	long empsalary;
	
	public Employee(String empname, int empid, long empsalary) {
		this.empname = empname;
		this.empid = empid;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empsalary=" + empsalary + "]";
	}
	
	
	
	

}
