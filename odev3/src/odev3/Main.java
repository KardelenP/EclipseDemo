package odev3;

public class Main {

	public static void main(String[] args) {
		Instructor �nstructor=new Instructor();		
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setVerdi�iDers("Java");
		
		Student student=new Student();
		student.setFirstName("Kardelen");
		student.setLastName("Uysal");
		student.setAld���Ders("Java");
		
		
		UserManager userManager=new UserManager();
		User[] users= {�nstructor,student};
		userManager.addMultiple(users);
		
		
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.add(�nstructor);;
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);

	}

}
