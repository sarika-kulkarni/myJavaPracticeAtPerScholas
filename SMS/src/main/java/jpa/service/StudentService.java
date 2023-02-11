package jpa.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	
	/**
	 * This method registers a new course for a given student
	 * @param email Email of the student
	 * @param newCourse new course to be registered
	 */
	public void registerStudentToCourse(String email, Course newCourse) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	Student student = session.find(Student.class, email);
    	student.getCourses().add(newCourse);
    	session.save(student);
    	transaction.commit();
	}
	
	
	/**
	 * This method takes a Student’s email as a parameter. It gets student by email id
	 */
	public List<Student> getStudentByEmail(String email) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
    	CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
    	Root<Student> root = criteriaQuery.from(Student.class);
    	criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("email"), email));
    	
    	Query<Student> query = session.createQuery(criteriaQuery);
    	return query.getResultList();
    	
	}
	
	/**
	 * This method gets the list of courses registered by given student
	 */
	public List<Course> getStudentCourses(String email) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	return session.get(Student.class, email).getCourses();
	}

	public void getAllStudents() {
		// TODO Auto-generated method stub
	}

	public void validateStudent() {
		// TODO Auto-generated method stub
	}

}
