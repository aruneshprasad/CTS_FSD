package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetoone.Department;
import com.onetoone.Project;
import com.utils.HibernateUtils;

public class OneToOne_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		Department d1 = new Department();
		d1.setDeptId(102);
		d1.setDeptName("IT");
		Project p1 = new Project();
		p1.setProjId(100000);
		p1.setProjName("Ford");
		
		Department d2 = new Department();
		d2.setDeptId(103);
		d2.setDeptName("ACCOUNTS");
		Project p2 = new Project();
		p2.setProjId(200000);
		p2.setProjName("Mitsubishi");
		
		Department d3 = new Department();
		d3.setDeptId(104);
		d3.setDeptName("HR");
		
		Project p3 = new Project();
		p3.setProjId(300000);
		p3.setProjName("CTS");
		
		d1.setProj(p1);
		d2.setProj(p2);
		d3.setProj(p3);
		
		ses.save(d1);
		ses.save(d2);
		ses.save(d3);
		
		ses.beginTransaction().commit();

		HibernateUtils.shutdown();

	}

}
