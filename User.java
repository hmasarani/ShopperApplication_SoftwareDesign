import java.util.ArrayList;
import java.util.List;

public class User {
	private static String username;
	private static String password;
	private  static String userRole;
	private static String homeLocation;
	private static String status;
	List<String>  preferences = new ArrayList<String>();
	
	public User(String Username, String Password) {
		username = Username; 
		password = Password; 
	}

	public static String getPassword() {
		return password;
	}

	public static String setPassword(String password) {
		User.password = password;
		return password; 
	}

	public static String getUserRole() {
		return userRole;
	}

	public static String setUserRole(String userRole) {
		User.userRole = userRole;
		return userRole; 
	}

	public static String getHomeLocation() {
		return homeLocation;
	}

	public static String setHomeLocation(String homeLocation) {
		User.homeLocation = homeLocation;
		return homeLocation; 
	}

	public static String getStatus() {
		return status;
	}

	public static String setStatus(String status) {
		User.status = status;
		return status; 
	}

	public static String getUsername() {
		return username;
	}

	public static String setUsername(String username) {
		User.username = username;
		return username;
	}

	public static boolean login(String username, String password) {
		if (User.username == username && User.password == password) {
				return true;
		}
		else {
			return false; 
		}
	}

	public static String changeIdentifier(String username, String newUserName) {
		if(newUserName !=null && User.username == username && username != newUserName) {
			User.username = newUserName;
			return newUserName;
		}
		else {
			System.out.println("Error");
			return "";
		}

	}

	public static boolean changePassword(String password, String newPassword) {
			if(password != newPassword && newPassword != null) {
				User.password = newPassword;
				return true;  
			}
			else {
				System.out.println("Error");
				return false;
			}
	}

	public static void establishSecurityMethods() {
		
	}

	public static void viewPreferences() {
		
	}


	public static boolean deleteUser(String username, String password) {
		if(username != null && password != null || (User.username == username && User.password == password)) {
			System.out.println("Your account has beeen deleted");
			return true;
		}
		else {
			System.out.println("Error Occured");
			return false; 
		}
	}

}
