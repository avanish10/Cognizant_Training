package com.cognizant.repository;
import org.springframework.data.repository.CrudRepository;


import com.cognizant.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
