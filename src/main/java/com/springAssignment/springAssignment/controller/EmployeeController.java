package com.springAssignment.springAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springAssignment.springAssignment.data.Employee;
import com.springAssignment.springAssignment.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	String name = "Arnold";
	int id = 01;
	
	@GetMapping
	public Object displayEmployee() {
		
		return "Your name is "+ name + " id is " + id;
		
		
	}
	
	@GetMapping("/employees")
	public List <Employee> getEmployee(){
		return this.employeeService.getEmployee();
		
		
	}
	
	@GetMapping("/employees/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		
		return this.employeeService.getEmployeeById(empid);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return this.employeeService.addEmployee(emp);
		
	}
	
	@DeleteMapping("/employees/{empid}")
    public Employee deleteEmployee(@PathVariable int empid) {
        return this.employeeService.deletedEmployee(empid);
    }
	
}
