package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.utils.HibernateUtils;

public class OneToMany_Save {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		
		Employee e1 = new Employee(1, "Arunesh", 45000);
		Employee e2 = new Employee(2, "Raj", 46000);
		Employee e3 = new Employee(3, "Ajay", 47000);
		Employee e4 = new Employee(4, "Pankaj", 48000);
		Employee e5 = new Employee(5, "Tejveer", 49000);
		
		Department d1 = new Department();
		d1.setDeptId(100);
		d1.setDeptName("IT");
		
		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e3);
		d1.getEmps().add(e4);
		d1.getEmps().add(e5);
		
		ses.save(d1);
		ses.beginTransaction().commit();
		
		HibernateUtils.shutdown();

	}

}
