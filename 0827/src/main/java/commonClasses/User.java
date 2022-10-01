package commonClasses;

public class User {
	
	private String userEmail;
	private String password;
	
	public User(String[] userParams) {
		setUserEmail(userParams[0]);
		setPassword(userParams[1]);
	}
	
	public void setUserEmail (String anEmail) { userEmail = anEmail; }
	public String getUserEmail () { return userEmail; }
	
	public void setPassword (String aPassword) { password = aPassword; }
	public String getPassword () { return password; }

}
