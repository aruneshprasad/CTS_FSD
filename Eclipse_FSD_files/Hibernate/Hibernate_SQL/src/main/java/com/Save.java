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
		
		//Employee emp1 = new Employee("Arunesh", 45000, sdf.parse("1997-11-07"));
		Employee emp2 = new Employee("Raj", 44000, sdf.parse("1997-10-07"));
		Employee emp3 = new Employee("Ajay", 46000, sdf.parse("1997-05-09"));
		Employee emp4 = new Employee("Pankaj", 47000, sdf.parse("1997-12-10"));
		Employee emp5 = new Employee("Tejveer", 48000, sdf.parse("1997-09-25"));
		
		ses.save(emp2);
		ses.save(emp3);
		ses.save(emp4);
		ses.save(emp5);
		
		ses.beginTransaction().commit();
		
		HibernateUtils.shutdown();

	}

}
