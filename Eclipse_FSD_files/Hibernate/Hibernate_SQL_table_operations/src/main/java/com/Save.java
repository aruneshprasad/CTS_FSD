package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utils.HibernateUtils;

public class Save {

	public static void main(String[] args) throws ParseException {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Employee emp = new Employee("Arunesh", 45000, sdf.parse("1997-11-07"));
		Department dept = new Department(100, "Accounts");
		emp.setDept(dept);
		
		ses.save(emp);
		
		ses.beginTransaction().commit();
		
		HibernateUtils.shutdown();

	}

}
