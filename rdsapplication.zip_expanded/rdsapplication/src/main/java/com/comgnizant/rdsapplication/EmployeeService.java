package com.comgnizant.rdsapplication;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	String addEmployee(Employee employee);
}
