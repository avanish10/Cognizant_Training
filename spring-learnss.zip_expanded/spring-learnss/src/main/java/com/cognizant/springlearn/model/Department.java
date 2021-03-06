package com.cognizant.springlearn.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Department {
	@Id
	@NotNull
	public long id;
	@NotNull
	@NotBlank
	@Size(min=1,max=30)
	public String name;
	public Department(@NotNull long id, @NotNull @NotBlank @Size(min = 1, max = 30) String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
