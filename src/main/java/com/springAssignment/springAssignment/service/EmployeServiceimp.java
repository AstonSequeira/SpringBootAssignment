package com.springAssignment.springAssignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springAssignment.springAssignment.data.Employee;

@Service
public class EmployeServiceimp implements EmployeeService {
	
	List <Employee> list;
	
	

	public EmployeServiceimp() {
		list = new ArrayList<>();
		list.add(new Employee(1,"Aston",24,'M'));
		list.add(new Employee(2,"Arnold",25,'M'));
	}



	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Employee getEmployeeById(int empid) {
		Employee e=null;
		for(Employee emp:list) {
			if(emp.getId()==empid) {
				e=emp;
				break;
			}
		}
		return e;
	}



	@Override
	public Employee addEmployee(Employee emp) {
		this.list.add(emp);
		return emp;
	}
		



	

}
