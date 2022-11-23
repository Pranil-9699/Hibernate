package com.Pranil9699.ManyToManymapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		try{
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
			Employee emp1 = new Employee();
			emp1.setEmpoyee_id(3);
			emp1.setEmployee_name("Pranil");
			Employee emp2 = new Employee();
			emp2.setEmpoyee_id(4);
			emp2.setEmployee_name("Chintu");

			Project pro1 = new Project();
			pro1.setProject_id(102);
		    pro1.setProject_name("Passion IT Process");
			Project pro2 = new Project();
			pro2.setProject_id(103);
		    pro2.setProject_name("Addmission Management Project");

			List<Employee> list1 = new ArrayList<Employee>();
			list1.add(emp1);
			list1.add(emp2);
			List<Project> list2 = new ArrayList<Project>();
			list2.add(pro1);
			list2.add(pro2);
			
			emp1.setProject(list2);
			pro2.setEmployees(list1);
			Session session = factory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(emp1);
			session.save(emp2);
			session.save(pro1);
			session.save(pro2);
			
//			Employee emp = (Employee)session.get(Employee.class,3);
//			System.out.println(emp.getEmpoyee_id()+" , "+emp.getEmployee_name() +" , ");
//			Employee emp1 = (Employee)session.get(Employee.class,4);
//			System.out.println(emp1.getEmpoyee_id()+" , "+emp1.getEmployee_name() +" , ");
//			Project pro = (Project)session.get(Project.class,102);
//			System.out.println(pro.getProject_id()+" , "+pro.getProject_name() +" , ");
//			Project pro2 = (Project)session.get(Project.class,103);
//			System.out.println(pro2.getProject_id()+" , "+pro2.getProject_name() +" , ");
			
			
			tr.commit();
			session.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
