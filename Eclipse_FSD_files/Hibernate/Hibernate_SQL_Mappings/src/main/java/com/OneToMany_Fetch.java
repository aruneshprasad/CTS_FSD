package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.utils.HibernateUtils;

public class OneToMany_Fetch {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		
		Department dept = (Department) ses.get(Department.class, 100);
		
		System.out.println("Department Id: "+ dept.getDeptId());
		System.out.println("Department Name: "+ dept.getDeptName());
		System.out.println("--------------------");
		for(Employee emp:dept.getEmps()) {
			System.out.println("Emp Id: "+ emp.getEmpId());
			System.out.println("Emp Name: "+ emp.getEmpName());
			System.out.println("Emp Salary: "+ emp.getSalary());
			System.out.println("------------------------");
		}
		
		HibernateUtils.shutdown();

	}

}
