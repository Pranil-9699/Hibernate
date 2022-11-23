package com.Pranil9699.ManyToManymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {
@Id
	private int Empoyee_id;
	private String Employee_name;
	@ManyToMany
	private List<Project> projects;

	public int getEmpoyee_id() {
		return Empoyee_id;
	}

	public void setEmpoyee_id(int empoyee_id) {
		Empoyee_id = empoyee_id;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int empoyee_id, String employee_name, List<Project> projects) {
		super();
		Empoyee_id = empoyee_id;
		Employee_name = employee_name;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
