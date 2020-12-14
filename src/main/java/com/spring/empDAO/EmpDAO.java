package com.spring.empDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.empEntity.Employee;

public interface EmpDAO extends JpaRepository<Employee,Integer>{

}
