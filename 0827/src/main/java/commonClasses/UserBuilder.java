package commonClasses;

public class UserBuilder {

	public static User nico() {
		String[] userNico = {"nicolas.a.saban@gmail.com", "Pass1234"};
		User user = new User(userNico);
		return user;
	}

}
