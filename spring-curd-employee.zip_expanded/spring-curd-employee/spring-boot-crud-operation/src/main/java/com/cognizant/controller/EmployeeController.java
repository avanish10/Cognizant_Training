package com.cognizant.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@RestController
public class EmployeeController 
{

	@Autowired
	EmployeeService employeeService;
 
	@GetMapping("/employee")
	private List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/employee/{employeeId}")
	private Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

	@DeleteMapping("/employee/{employeeId}")
	private void deleteEmployee(@PathVariable("employeeId") int employeeId) {
		employeeService.delete(employeeId);
	}

	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getEmployeeId();
	}

	@PutMapping("/employee")
	private Employee update(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee;
	}
}
