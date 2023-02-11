package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course")
public class Course implements Comparable<Course>{
	
	//Unique Course Identifier- course id
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(length=10)
	private Integer id;
	
	// column - course name
	@Column(length=50)
	private String name;
	
	// column- instructor
	@Column(length=50)
	private String instructor;
	
	//constructor with no parameters and it initializes every member to an initial value
	public Course() {
		name = null;
		instructor = null;
	}
	
	//constructor that initializes every private member with a parameter provided to the constructor.
	public Course(Integer id, String name,String instructor) {
		this.id = id;
		this.name=name;
		this.instructor=instructor;
	}
	
	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String toString() {
		return String.format("%s %s %s", id, name, instructor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Course)) {
			return false;
		}
		
		Course course = (Course) obj;
		return this.getId() == course.getId();
	}

	public int compareTo(Course o) {
		if(o.getId() == this.getId()) {
			return 0;
		}
	
		return this.getId() < o.getId() ? -1 : 1;
	}
}
