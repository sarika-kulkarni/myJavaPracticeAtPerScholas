package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentCourseService {
	public List<Course> getAllStudentCourses(String email){
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	return session.find(Student.class, email).getCourses();
	}
}
