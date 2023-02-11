package JavaEncapsulationPkg;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Michael =new Student();
		Michael.setStudentId("0001" + "\t");
		Michael.settFirstName(" Michael" + "\t");
		Michael.setLastName(" Gabriel" + "\t");
		Michael.setStudentEmail(" michaelgabiel@gmail.com" + "\t");
		Michael.setStudentPhone("1234567890");
		Michael.studentData();
		System.out.println();
		Student Bairon =new Student();
		Bairon.setStudentId("0002" + "\t");
		Bairon.settFirstName(" Bairon" + "\t");
		Bairon.setLastName(" Vasquez" + "\t");
		Bairon.setStudentEmail(" baironvasquez@gmail.com" + "\t");
		Bairon.setStudentPhone("123-456-7891");
		Bairon.studentData();
		
		
	}

}
