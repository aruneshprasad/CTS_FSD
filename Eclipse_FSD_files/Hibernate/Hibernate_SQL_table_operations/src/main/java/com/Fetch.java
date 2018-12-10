package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utils.HibernateUtils;

public class Fetch {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		
		Employee emp = (Employee)ses.get(Employee.class, 1);
		
		System.out.println("Id: "+ emp.getEmpId());
		System.out.println("Name: "+ emp.getEmpName());
		System.out.println("Salary: "+ emp.getSalary());
		System.out.println("Date of Birth: "+ emp.getDob());
		System.out.println("Department Id: "+ emp.getDept().getDeptId());
		System.out.println("Department Name: "+ emp.getDept().getDeptName());
		
		HibernateUtils.shutdown();
	}

}
