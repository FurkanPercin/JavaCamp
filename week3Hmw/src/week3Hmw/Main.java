package week3Hmw;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setName("Furkan");
		student1.setSurname("PERCIN");
		student1.setCollage("IKCU");
		student1.setDepartment("EEE");
		student1.setEmail("blabla@outlook.com");
		student1.setPassword("123456");
		student1.setId(1);
		
		Instructor instructor1=new Instructor();
		instructor1.setName("Engin");
		instructor1.setSurname("DEMIROG");
		instructor1.setEmail("java@outlook.com");
		instructor1.setPassword("987654");
		instructor1.setId(2);
		instructor1.setOccupation("Software Engineer");
		instructor1.setLectures("Java");
		
		StudentManager studentManager =new StudentManager();
		studentManager.add(student1);
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.add(instructor1);

	}

}
