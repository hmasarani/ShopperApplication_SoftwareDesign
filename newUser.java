
public class newUser {
	private static String username; 
	private static String password;
	private static String email;
	private static String role; 
	private static String phoneNo; 
	
	public newUser(String username, String password, String email, String phoneNo, String role) {
		newUser.username = username; 
		newUser.password = password; 
		newUser.email = email;
		newUser.phoneNo = phoneNo; 
		newUser.role = role; 
	}
	public static String setUsername(String username) {
		newUser.username = username;
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public static String setPassword(String password) {
		newUser.password = password;
		return password; 
	}

	public static String getEmail() {
		return email;
	}

	public static String setEmail(String email) {
		newUser.email = email;
		return email; 
	}

	public static String getPhoneNo() {
		return phoneNo;
	}

	public static String setPhoneNo(String phoneNo) {
		newUser.phoneNo = phoneNo;
		return phoneNo;
	}
	public static String getUsername() {
		return username;
	}
	public static String getRole() {
		return role;
	}
	public static String setRole(String role) {
		newUser.role = role;
		return role; 
	}
	
	

}
