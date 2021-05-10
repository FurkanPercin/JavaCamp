package week2Hmw;

public class Lectures {
	public Lectures() {
		System.out.println("Lectures constructor is working.");
	}
	
	public Lectures(String lectureName,String lectureCode,String lecturer) {
		this.lectureName=lectureName;
		this.lectureCode=lectureCode;
		this.lecturer=lecturer;
	}
	String lectureName;
	String lectureCode;
	String lecturer;
}
