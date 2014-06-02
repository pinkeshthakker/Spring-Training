package com.nihilent.hibernateTraining.util;
 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
public class HibernateUtil {
 
    //private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory sessionFactory = null;
 
    public static SessionFactory buildSessionFactory(String fileName) {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	sessionFactory =  new AnnotationConfiguration().configure(fileName).buildSessionFactory();
                    
        	return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

