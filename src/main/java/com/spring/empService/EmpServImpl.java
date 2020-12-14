package com.spring.empService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.empEntity.Employee;
import com.spring.empDAO.EmpDAO;


@Service
public class EmpServImpl implements EmpServ{

	
	@Autowired
	private EmpDAO empDao;
	
     
	@Override
	public List<Employee> getEmp(){
		return empDao.findAll();
	}
	
	@Override
	public Employee addEmp(Employee emp){
		empDao.save(emp);
		return emp;
	}
}
