package com.nihilent.hibernateTraining;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestHelloWorld {
	
	public static void main(String[] args) {
		Session session = null;

		try{
			 SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate_helloWorld.cfg.xml").buildSessionFactory();
			 session = sessionFactory.openSession();
			 HelloWorldAnnotation helloWorldAnnotation = new HelloWorldAnnotation();
			 helloWorldAnnotation.setId(1);
			 helloWorldAnnotation.setFirstName("Nihilent");
			 session.save(helloWorldAnnotation);
			/*SessionFactory sessionFactory = new Configuration().configure("hibernate_helloWorld.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			HelloWorld helloWorld = new HelloWorld();
			helloWorld.setFirstName("Nihilent");
			helloWorld.setId(1);
			session.save(helloWorld);
			*/
			 
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			// Actual contact insertion will happen at this step
			System.out.println("test");
			 session.flush();
			 session.close();
			}
		
	}


}
