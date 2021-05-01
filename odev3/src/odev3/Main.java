package odev3;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor=new Instructor();		
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setVerdiğiDers("Java");
		
		Student student=new Student();
		student.setFirstName("Kardelen");
		student.setLastName("Uysal");
		student.setAldığıDers("Java");
		
		
		UserManager userManager=new UserManager();
		User[] users= {ınstructor,student};
		userManager.addMultiple(users);
		
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.add(ınstructor);;
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);

	}

}
