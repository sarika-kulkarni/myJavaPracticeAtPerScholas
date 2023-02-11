package jpa.entitymodels;

import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	//unique student identifier- student email address
	@Id
	@Column(length=50)
    private String email;
	
	//column- student name
	@Column(length=50)
	private String name;
	
	// column- password
	@Column(length=50)
    private String password;
    
	
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = Course.class)
    @JoinTable(
    		name = "courses",
    		joinColumns = {@JoinColumn(name = "student_email")},
    		inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private List<Course> courses;
    
  //constructor that initializes every private member with a parameter provided to the constructor.
    public Student(String name, String email, String password, List<Course> courses) {
    	this.email=email;
    	this.name=name;
    	this.password = password;
    	this.courses = courses;
    }

  //constructor with no parameters and it initializes every member to an initial value
    public Student() {
    	courses = Collections.emptyList();
    }
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
