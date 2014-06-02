package com.nihilent.hibernateTraining;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestOneToOneFK {
	
	public static void main(String[] args) {
		Session session = null;

		try{
			 SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate-one-to-one.cfg.xml").buildSessionFactory();
			 session = sessionFactory.openSession();
			 Certificate certificate = new Certificate();
			 certificate.setCertName("SCJP");
			 certificate.setCode("SCJP01");
			// session.save(certificate);
			 Person person = new Person();
			 person.setCertificate(certificate);
			 person.setName("Pinkesh");
			 certificate.setPerson(person);
			 //ItemImage itemImage = (ItemImage)session.get(ItemImage.class, 5L);
			 //String name = itemImage.getItem().getName();
			 session.save(person);
			 session.flush();
			 session.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			// Actual contact insertion will happen at this step
			System.out.println("test");
			
			}
	}
		


}
