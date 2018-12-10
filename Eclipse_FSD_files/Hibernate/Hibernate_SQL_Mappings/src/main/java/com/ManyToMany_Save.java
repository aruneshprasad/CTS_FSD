package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytomany.Course;
import com.manytomany.Student;
import com.utils.HibernateUtils;

public class ManyToMany_Save {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		
		Student s1 = new Student(1, "Arunesh");
		Student s2 = new Student(2, "Raj");
		Student s3 = new Student(3, "Ajay");
		Student s4 = new Student(4, "Pankaj");
		Student s5 = new Student(5, "Tejveer");
		
		Course c1 = new Course(1, "Java", 15000);
		Course c2 = new Course(2, "PHP", 12000);
		Course c3 = new Course(3, "C", 10000);
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);
		c1.getStudents().add(s5);
		
		c2.getStudents().add(s1);
		c2.getStudents().add(s2);
		c2.getStudents().add(s3);
		
		c3.getStudents().add(s5);
		
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		
		ses.beginTransaction().commit();
		HibernateUtils.shutdown();
	}

}
