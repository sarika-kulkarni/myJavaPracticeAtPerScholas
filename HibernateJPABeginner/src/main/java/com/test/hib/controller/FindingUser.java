package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class FindingUser {
	public static void main(String[] args) {
		SessionFactory factory = new    Configuration().configure().buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
	    	User uone = new User();
	    	uone.setEmail("haseeb@gmail.com");
	    	uone.setFullname("Moh Haseeb");
	    	uone.setPassword("has123");
	    	uone.setSalary(2000.69);
	    	uone.setAge(20);
	    	uone.setCity("NYC");
	    	
	    	User uTwo = new User();
	    	uTwo.setEmail("James@gmail.com");
	    	uTwo.setFullname("James Santana");
	    	uTwo.setPassword("James123");
	    	uTwo.setSalary(2060.69);
	    	uTwo.setAge(25);
	    	uTwo.setCity("Dallas");
	    	
	    	session.save(uone);
	    	session.save(uTwo);
			
			      
			    int USER_ID = 2;
			    User u = session.load(User.class, USER_ID);
			    System.out.println("Fullname: " + u.getFullname());
			    System.out.println("Email: " + u.getEmail());
			    System.out.println("password: " + u.getPassword());

			    //Close resources
			     tx.commit();
			     factory.close();
			     session.close();
			}

}
