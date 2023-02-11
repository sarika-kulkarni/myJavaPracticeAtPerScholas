package jpa;

/*
 * Filename: SMSRunner.java
* Author: Stefanski
* 02/25/2020 
 */


import static java.lang.System.out;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentCourseService;
import jpa.service.StudentService;

/**1
 * 
 * @author Harry
 *
 */
public class SMSRunner {

	private Scanner sin;
	private StringBuilder sb;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		SMSRunner sms = new SMSRunner();
		sms.run();
	}

	private void run() {
		// Login or quit
		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			out.println("Goodbye!");
			break;

		default:

		}
	}

	private int menu1() {
		sb.append("Welcome to Student Management System!\n1.Student Login\n2.Quit Application\nPlease Enter Selection:\n");
		out.print(sb.toString());
		sb.delete(0, sb.length());

		return sin.nextInt();
	}

	private boolean studentLogin() {
		boolean retValue = false;
		out.println("Enter your email address: ");
		String email = sin.next();
		out.println("Enter your password: ");
		String password = sin.next();

		List<Student> students = studentService.getStudentByEmail(email);
		if (students != null && !students.isEmpty()) {
			currentStudent = students.get(0);
		}

		if (currentStudent != null & currentStudent.getPassword().equals(password)) {
			List<Course> courses = studentService.getStudentCourses(email);
			Collections.sort(courses);
			out.println("My registered classes:");
			for (Course course : courses) {
				out.println(course);
			}
			retValue = true;
		} else {
			out.println("User Validation failed. GoodBye!");
		}
		return retValue;
	}

	private void registerMenu() {
		sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection:\n");
		out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {
		case 1:
			List<Course> allCourses = courseService.getAllCourses();
			List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getEmail());
			allCourses.removeAll(studentCourses);
			out.println("Classes available to register:");
			out.printf("%5s%15S%15s\n", "ID", "Course", "Instructor");
			for (Course course : allCourses) {
				out.println(course);
			}
			out.println();
			out.print("Enter Course Number: ");
			int number = sin.nextInt();
			
			for( Course course : studentCourses){
				if(course.getId().intValue() == number) {
					out.println("You are already registered in that course!");
					out.println("Goodbye!");
					return;
				}
			}
			
			Course newCourse = courseService.GetCourseById(number);
			
			if (newCourse != null) {
				studentService.registerStudentToCourse(currentStudent.getEmail(), newCourse);
				Student temp = studentService.getStudentByEmail(currentStudent.getEmail()).get(0);
				
				//StudentCourseService scService = new StudentCourseService();
				List<Course> sCourses = studentService.getStudentCourses(temp.getEmail());
				Collections.sort(sCourses);
				out.println("You have successfully registered for course " + newCourse.getName());
				out.println("My registered classes:");
				for (Course course : sCourses) {
					out.println(course);
				}
			}
			break;
		case 2:
		default:
			out.println("Goodbye!");
		}
	}
}
