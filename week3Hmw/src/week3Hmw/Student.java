package week3Hmw;

public class Student extends User{
	private String department;
	private String collage;
	
	public Student() {
		
	}
	
	public Student(String department,String collage) {
		super();
		this.department=department;
		this.collage=collage;
				
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}
	
}
