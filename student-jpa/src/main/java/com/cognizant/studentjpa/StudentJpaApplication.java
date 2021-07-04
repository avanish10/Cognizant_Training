package com.cognizant.studentjpa;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.studentjpa.model.Student;
import com.cognizant.studentjpa.service.StudentService;
import com.cognizant.studentjpa.service.exception.StudentNotFoundException;

@SpringBootApplication
public class StudentJpaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentJpaApplication.class);
	private static StudentService studentservice;
	private static void testGetAllStudent() {

		LOGGER.info("Start");

		List<Student> students = studentservice.getAllStudents();

		LOGGER.debug("students={}", students);

		LOGGER.info("End");

		}
	
	private static void getAllStudentTest() {

		LOGGER.info("Start");

		Student student = null;
		try {
			student = studentservice.findStudentById(1);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOGGER.debug("Student:{}", student);

		LOGGER.info("End");

		}
	
	private static void testAddStudent() {
	   Student student = new Student(1,"A","B","e");
	   studentservice.addStudent(student);
	   
	   try {
		studentservice.findStudentById(1);
	} catch (StudentNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	
	private static void testUpdateStudent()
	{
		try {
			studentservice.updateStudent(1, "C");
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void testDeleteStudent()
	{
		studentservice.deleteStudent(1);
	}
	
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentJpaApplication.class, args);
		studentservice = context.getBean(StudentService.class);
		
		testGetAllStudent();
		
		//SpringApplication.run(StudentJpaApplication.class, args);
	}

}
