package com.spring.empService;

import java.util.List;

import com.spring.empEntity.Employee;

public interface EmpServ {
	
	public List<Employee> getEmp();
	
	public Employee addEmp(Employee emp);

}
