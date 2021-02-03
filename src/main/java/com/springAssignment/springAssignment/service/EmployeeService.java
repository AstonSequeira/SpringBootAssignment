package com.springAssignment.springAssignment.service;

import java.util.List;

import com.springAssignment.springAssignment.data.Employee;

public interface EmployeeService {

	public List <Employee> getEmployee();
	
	public Employee getEmployeeById(int empid);
	
	public Employee addEmployee(Employee emp);
}
	