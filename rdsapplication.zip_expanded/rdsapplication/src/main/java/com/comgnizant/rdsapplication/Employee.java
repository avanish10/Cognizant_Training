package com.comgnizant.rdsapplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description="Employee class which is acting as dto")
public class Employee {
	
@Id
@GeneratedValue
private int id;
@ApiModelProperty(notes="Name should contain only alphabet")
private String name;
private String gender;
@ApiModelProperty(notes="Age should contain only number")
private int age;
private double salary;



}
