package com.cognizant.traineemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity

@Table(name="Trainee")
public class Trainee {
	
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Id
	@Column(name="empId")
	private int empId;
	@Column(name="cohort")
	private String cohort;

}
