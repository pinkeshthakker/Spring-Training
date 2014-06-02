package com.nihilent.hibernateTraining;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestOneToOnePK {
	
	public static void main(String[] args) {
		Session session = null;

		try{
			 SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate-one-to-one.cfg.xml").buildSessionFactory();
			 session = sessionFactory.openSession();
			 User user = new User();
			 user.setName("Pinkesh2");
			 UserAddress userAddress = new UserAddress();
			 userAddress.setCity("City");
			 userAddress.setStreet("street");
			 userAddress.setZipcode("434334");
			 userAddress.setUser(user);
			 //user.setUserAddress(userAddress);
			 session.save(userAddress);
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
