package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO {

	/**
	 * This method gets the course details for a given course id
	 * @param number course id
	 * @return Course course details
	 */
	public Course GetCourseById(int number) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
		Course course = session.find(Course.class, number);
		session.close();
		return course;
	}

	//This method takes no parameter and returns every Course in the table
	public List<Course> getAllCourses() {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	List<Course> courses = session.createQuery("from Course", Course.class).getResultList();
    	session.close();
    	return courses;
	}

}
