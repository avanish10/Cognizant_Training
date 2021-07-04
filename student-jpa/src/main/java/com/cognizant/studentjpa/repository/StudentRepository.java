package com.cognizant.studentjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.studentjpa.model.Student;


public interface StudentRepository extends JpaRepository<Student, String> {

}
