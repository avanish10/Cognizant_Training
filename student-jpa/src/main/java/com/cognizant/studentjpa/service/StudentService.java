package com.cognizant.studentjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.studentjpa.model.Student;
import com.cognizant.studentjpa.repository.StudentRepository;
import com.cognizant.studentjpa.service.exception.StudentNotFoundException;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public List<Student> getAllStudents(){
		List<Student> list = new ArrayList<Student>();
		list.addAll(studentRepository.findAll());
		return list;
		
	}
	
	@Transactional
	public void updateStudent(int id,String name) throws StudentNotFoundException{
Optional<Student> result = studentRepository.findById(String.valueOf(id));
		
		if (!result.isPresent())
			 throw new StudentNotFoundException();
		else
		{
			Student student = result.get();
			student.setFirstName(name);
			studentRepository.save(student);
		}
	}
	
	@Transactional
	public Student findStudentById(int id) throws StudentNotFoundException
	{
		Optional<Student> result = studentRepository.findById(String.valueOf(id));
		
		if (!result.isPresent())
			 throw new StudentNotFoundException();
		else
		{
			Student student = result.get();
			return student;
		}
		
	}
	
	@Transactional
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	@Transactional
	public void deleteStudent(int id) {
		studentRepository.deleteById(String.valueOf(id));
	}
	
	

}
