package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	
	private static SessionFactory sf = sessionFactory();
	
	private static SessionFactory sessionFactory() {
		try {
			Configuration cfg = new Configuration().configure(HibernateUtils.class.getResource("/hibernate.cfg.xml"));
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
			serviceRegistryBuilder.applySettings(cfg.getProperties());
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			sf = cfg.buildSessionFactory(serviceRegistry);
		} catch (Throwable e) {
			System.err.println("Initial SessionFactory Build Error "+ e);
			throw new ExceptionInInitializerError();
		}
		return sf;
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}

}
