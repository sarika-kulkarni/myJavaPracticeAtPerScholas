package JavaEncapsulationPkg;

public class Student {
private String studentId;
private String firstName;
private String lastName;
private String studentEmail;
private String studentPhone;
public Student() {
	
}
public Student(String StudentId, String firstName,String lastName, String studentEmail, String studentPhone) {
	this.studentId=studentId;
	this.firstName=firstName;
	this.lastName=lastName;
	this.studentEmail=studentEmail;
	this.studentPhone=studentPhone;
}

public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId=studentId;
}

public String getFirstName() {
	return firstName;
}
public void settFirstName(String firstName) {
	this.firstName=firstName;
}

public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}


public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail=studentEmail;
}
public String getStudentPhone() {
	return studentPhone;
}

public void setStudentPhone(String studentPhone) {
	this.studentPhone=studentPhone;
}

public void studentData() {
	System.out.print("studentId" + " " + this.studentId );
	System.out.print("firstname" + this.firstName);
	System.out.print("lastname" + this.lastName);
	System.out.print("student email" + this.studentEmail);
	System.out.print("student phone" + " " + this.studentPhone );
}

//public static void main(String[] args) {
	//Student Mary =new Student();
//}

}

