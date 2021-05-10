package week2Hmw;

//import oopIntro.Product;

public class Main {

	public static void main(String[] args) {
		Lectures lecture1=new Lectures("Yazilim Gelistirici Yetistirme Kampi","java101","Engin Demirog");
		Lectures lecture2=new Lectures("Python","phy","Mustafa Murat Coskun");
		Lectures lecture3=new Lectures("C#","cs","Engin Demirog");
		
		Lectures[] lectures= {lecture1,lecture2,lecture3};
		
		for (Lectures lecture : lectures) {
				System.out.println(lecture.lectureName);
		}
		
		System.out.println("---------------------------");
		OnlineLecture onlineLecture = new OnlineLecture();
		for (Lectures lecture : lectures) {
			onlineLecture.startLecture(lecture);	
		}
		
		System.out.println("---------------------------");
		Instructor instructor = new Instructor();
		for (Lectures lecture : lectures) {
			instructor.Lecturer(lecture);	
		}
		
		
		
		
		
		
		
		
		
		
	}
		
		

}
