package com.test.project.CrunchifyJunitTest;

import java.util.Objects;

public class Student {

	public Student() { }
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}

	private long id;
	private String Email;
	private String fName;
	private String lName;
	
	// WHAT You need TODO:  Implement the equals @Override method
	
	//@Override
	/*public int hashCode() {
		return Objects.hash(Email, fName, id, lName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(fName, other.fName) && id == other.id
				&& Objects.equals(lName, other.lName);
	}*/
	

}