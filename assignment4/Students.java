package week3.day1.assignments;

public class Students {

	public void getStudentInfo(long ID) {
		System.out.println("Student ID: "+ID);
	}
	
	public void getStudentInfo(long ID, String name) {
		System.out.println("Student ID: "+ID+" ; "+"Student name: "+name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email: "+email+" ; "+"Student phone number: "+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(20135454L);
		stud.getStudentInfo(20135454, "Poornima");
		stud.getStudentInfo("testuser@gmail.com", 1234567890L);

	}

}
