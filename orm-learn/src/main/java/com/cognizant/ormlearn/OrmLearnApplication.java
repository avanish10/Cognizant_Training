package com.cognizant.ormlearn;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}", employee.getSkillList());
		LOGGER.info("End");
	}
	
	private static void testGetDepartment()
	{
		Department department = departmentService.get(1);
		LOGGER.debug("Department:{}",department.getName(),department.getEmployeeList());
	}
	private static void testAddSkillToEmployee()
	{
		
		
	}
	
	private static void testAddEmployee(){
		Employee employee = new Employee();
		DepartmentService ds = new DepartmentService();
		Department d;
		employee.setId(1);
		employee.setName("A");
		employee.setPermanent(false);
		employee.setSalary(300000);
		d = ds.get(1);
		employee.setDepartment(d);
		employeeService.save(employee);
		
		
		
	}
	
	private static void testUpdateEmployee()
	{
		Employee employee = employeeService.get(1);
		Department department = departmentService.get(2);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}",employee);
	}
	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}
	
	private static void getAllCountriesTest() {

		LOGGER.info("Start");

		Country country = null;
		try {
			country = countryService.findCountryByCode("IN");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOGGER.debug("Country:{}", country);

		LOGGER.info("End");

		}
	
	private static void testAddCountry() {
	   Country country = new Country("IN","India");
	   countryService.addCountry(country);
	   
	   try {
		countryService.findCountryByCode("IN");
	} catch (CountryNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	
	private static void testUpdateCountry()
	{
		try {
			countryService.updateCountry("IN", "INDIA");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void testDeleteCountry()
	{
		countryService.deleteCountry("IN");
	}
	
	
     
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		 countryService = context.getBean(CountryService.class);
		 //employeeService = context.getBean(EmployeeService.class);
		 //departmentService = context.getBean(DepartmentService.class);
		 //skillService = context.getBean(SkillService.class);
		//testGetAllCountries();
		getAllCountriesTest();
         testAddCountry();
         //testUpdateEmployee();
         //testAddSkillToEmployee();
		LOGGER.info("Inside main");
		
		
		//SpringApplication.run(OrmLearnApplication.class, args);
	}

}
