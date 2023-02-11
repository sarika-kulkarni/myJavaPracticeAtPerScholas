package com.test.hib.controller;
import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class findUser_Hql {
	public void findUser() {
		SessionFactory factory = new   Configuration().configure().buildSessionFactory();
Session session = factory.openSession();

Transaction t = session.beginTransaction();   
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

User uThree = new User();
uThree.setEmail("Shahparan@gmail.com");
uThree.setFullname("AH Shahparan");
uThree.setPassword("Shahparan123");
uThree.setSalary(3060.69);
uThree.setAge(30);
uThree.setCity("Chicago");

/*========= We can pass value/data by using constructor =========*/
User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

session.save(uone); 
session.save(uTwo); 
session.save(uThree); 
session.save(ufour); 
session.save(ufive); 
  
t.commit();

  String hql = "FROM User"; // Example of HQL to get all records of user class
TypedQuery query = session.createQuery(hql);
List<User> results = query.getResultList();
for (User u : results) {
   System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
}
}

	public void findUserSelect()
    {
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction t = session.beginTransaction();   
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

	User uThree = new User();
	uThree.setEmail("Shahparan@gmail.com");
	uThree.setFullname("AH Shahparan");
	uThree.setPassword("Shahparan123");
	uThree.setSalary(3060.69);
	uThree.setAge(30);
	uThree.setCity("Chicago");

	/*========= We can pass value/data by using constructor =========*/
	User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
	User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

	session.save(uone); 
	session.save(uTwo); 
	session.save(uThree); 
	session.save(ufour); 
	session.save(ufive); 
	  
	t.commit();

/* ------------  Example of HQL to get all the records------- */
	   String hql = "SELECT u FROM User u"; 
	    Query query = session.createQuery(hql);
	    List<User> list  =  query.getResultList();
	    
	    for (User u : list) {
	    	 System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());

	      } 
	    }

	public void getRecordbyId() {
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
	   
	   Transaction t = session.beginTransaction();   
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

		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");

		/*========= We can pass value/data by using constructor =========*/
		User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
		User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

		session.save(uone); 
		session.save(uTwo); 
		session.save(uThree); 
		session.save(ufour); 
		session.save(ufive); 
		  
		t.commit();

	   String hql = "FROM User E WHERE E.id > 2 ORDER BY E.salary DESC";
	   TypedQuery query = session.createQuery(hql);
	   List<User> results = query.getResultList();
	   for (User u : results) {
	     System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
	   }
	}

	public void getrecords()
	{
	   SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
	   
	   Transaction t = session.beginTransaction();   
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

		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");

		/*========= We can pass value/data by using constructor =========*/
		User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
		User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

		session.save(uone); 
		session.save(uTwo); 
		session.save(uThree); 
		session.save(ufour); 
		session.save(ufive); 
		  
		t.commit();

	   
	   TypedQuery<Object[]> queryy = session.createQuery(
	   "SELECT U.salary, U.fullname FROM User AS U", Object[].class);
	   List<Object[]> resultss = queryy.getResultList();
	   for (Object[] a : resultss) {
	       System.out.println("Salary: " + a[0] + ", City: " + a[1]);
	   }
	}

	public void  getmaxSalary()
	{
	   SessionFactory factory = new   Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
	   
	   Transaction t = session.beginTransaction();   
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

		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");

		/*========= We can pass value/data by using constructor =========*/
		User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
		User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

		session.save(uone); 
		session.save(uTwo); 
		session.save(uThree); 
		session.save(ufour); 
		session.save(ufive); 
		  
		t.commit();

	   String hql = "SELECT max(U.salary) FROM User U";
	   TypedQuery query = session.createQuery(hql);
	   double result =(Double) query.getSingleResult();
	   System.out.println("Maximum Price: " + result);
	}
	
	public void   getmaxSalaryGroupBy()
	{
	   SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
	   
	   Transaction t = session.beginTransaction();   
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

		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");

		/*========= We can pass value/data by using constructor =========*/
		User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
		User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

		session.save(uone); 
		session.save(uTwo); 
		session.save(uThree); 
		session.save(ufour); 
		session.save(ufive); 
		  
		t.commit();

	   String hql = "SELECT SUM(U.salary), U.city FROM User U GROUP BY U.city";
	   TypedQuery query = session.createQuery(hql);
	   List<Object[]> result =query.getResultList();
	   for (Object[] o : result) {
	       System.out.println("Total salary " +o[0] +" | city: "+ o[1] );
	   }
	}



	
}
