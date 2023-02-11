package jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import junit.framework.Assert;

public class StudentServiceTest {
	
	private StudentService studentService = new StudentService();
	private static Student student;
	private static Course course1;
	private static Course course2;
	
	@BeforeAll
	public static void beforeAll() {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	course1 = new Course(12345, "American History", "Sarika Kulkarni");
    	session.save(course1);
    	course2 = new Course(12346, "Information Systems", "Sarika Kulkarni");
    	session.save(course2);
    	List<Course> courses = new ArrayList<>();
    	courses.add(course1);
    	courses.add(course2);
    	
    	student = new Student("Sam", "abc@xyz.com", "password", courses);
    	session.save(student);
    	transaction.commit();
    	session.close();
	}
	
	@Test
	public void testGetStudentByEmail() {
    	Student retrievedStudent = studentService.getStudentByEmail("abc@xyz.com").get(0);
    	Assert.assertEquals("Sam", retrievedStudent.getName());
	}
	
	@Test
	public void testGetStudentCourses() {
    	List<Course> courses = studentService.getStudentCourses("abc@xyz.com");
    	Assert.assertEquals(2, courses.size());
	}
	
	@AfterAll
	public static void afterAll() {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	Student studentToDelete = session.find(Student.class, student.getEmail());
    	session.delete(studentToDelete);
    	
    	Course course1ToDelete = session.find(Course.class, course1.getId());
    	session.delete(course1ToDelete);
    	
    	Course course2ToDelete = session.find(Course.class, course2.getId());
    	session.delete(course2ToDelete);

    	transaction.commit();
    	session.close();
	}
}
