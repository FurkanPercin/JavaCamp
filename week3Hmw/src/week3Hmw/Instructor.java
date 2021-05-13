package week3Hmw;

public class Instructor extends User{
	private String occupation;
	private String lecture;
	
	public Instructor() {
		
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getLectures() {
		return lecture;
	}

	public void setLectures(String lecture) {
		this.lecture = lecture;
	}

}
