import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String username;
	private String password;
	private String userRole;
	private String homeLocation;
	private String phoneNo;
	private String address;
	List<String> preferences = new ArrayList<String>();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getHomeLocation() {
		return homeLocation;
	}

	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void addtoList(String item) {
		
	}

	public boolean search(String item) {
		return false;
	}

	public void addtoList(String item, int quantity) {

	}

	public void setOrderAddress(String address) {

	}

	public void setOrderPhoneNo(String number) {

	}

	public String getOrderStatus(String orderID) {
		return "";
	}

	public double getPrice() {
		return 1;
	}

	public void cancelOrder(String orderID) {

	}

	public void changeLocation(int locationNo, int newLocationNo) {

	}

	public void modifyPreferences() {

	}

}
