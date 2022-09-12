
public class LoginClass {
	private String username; 
	private String password; 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean authenticateUser(String username, String password){
		if(username.equals(username) && password.equals(password)) {
			System.out.println("User Authenticated, Welcome!");
			return true; 
		}
		else {
			System.out.println("Data Doesn't match our database, please try again");
			return false; 
		}
	
}
	
}