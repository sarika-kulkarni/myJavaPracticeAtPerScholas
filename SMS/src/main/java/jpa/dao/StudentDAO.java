package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	void getAllStudents();

	List<Student> getStudentByEmail(String email);

	void validateStudent();

	void registerStudentToCourse(String email, Course newCourse);

	List<Course> getStudentCourses(String email);
}
