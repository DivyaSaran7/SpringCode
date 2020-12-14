package com.spring.empConnector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.empEntity.Employee;
import com.spring.empService.EmpServImpl;

@RestController
public class EmpConnector {
	
	@Autowired
	private EmpServImpl empServ;
	
	@GetMapping("/employee")
	public List<Employee> getEmp(){
		System.out.println(" Find  ****** me  ********* here");
		return this.empServ.getEmp();
	}

	@PostMapping("/employee")
	public Employee addEmp(Employee emp) {
		return this.empServ.addEmp(emp);
	}
}
