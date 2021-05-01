package odev3;

public class UserManager {
	public void add(User user) {
		System.out.println("First name:" + user.getFirstName() );
		System.out.println("Last name:" + user.getLastName());
		
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	

}
