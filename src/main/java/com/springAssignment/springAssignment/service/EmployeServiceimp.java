package com.springAssignment.springAssignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springAssignment.springAssignment.data.Employee;

@Service
public class EmployeServiceimp implements EmployeeService {
	
	List <Employee> list;
	List <Object> data;
	

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
	
	@Override
    public Employee deletedEmployee(int empid) {
        Employee e = null;
        for(Employee emp1:list) {
            if(emp1.getId()== empid) {
                e=emp1;
                this.list.remove(e);
                break;
                
            }
        }
        return e;
    }


	@Override
	public List<Object> getCarDetails() {
		
		return this.data;
		
	}

	
	@Override
	public Object addCarDetails(Object car) {
		this.data.add(car);
		return car;
		
	}


	


	

}
