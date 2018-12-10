package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytomany.Course;
import com.utils.HibernateUtils;

public class ManyToMany_Fetch {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();
		
		Course c = (Course) ses.get(Course.class, 2);
		
		System.out.println("Course Id: "+ c.getCourseId());
		System.out.println("Course Name: "+ c.getCourseName());
		System.out.println("Total fees collected from "+c.getStudents().size()+" students is "+ c.getCourseFee()*c.getStudents().size());
		System.out.println("----------------------");
	}

}
