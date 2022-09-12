import java.util.ArrayList;
import java.util.List;

public class Manager {
	private static String username;
	private static String password;
	private static String userRole;
	private static String homeLocation;
	private static String phoneNo;
	private static String address;
	private  static int storeNo; 
	public static List<String>  managers = new ArrayList<String>();
	
	
	public Manager(String username, String password, String userRole, String homeLocation, String phoneNo, String address, int storeNo){
		Manager.username = username; 
		Manager.password = password; 
		Manager.userRole = userRole; 
		Manager.homeLocation = homeLocation;
		Manager.phoneNo = phoneNo; 
		Manager.address = address;
		Manager.storeNo = storeNo; 
	}
	
	public static String getUsername() {
		return username;
	}
	public static String setUsername(String username) {
		Manager.username = username;
		return username; 
	}
	public  static String getPassword() {
		return password;
	}
	public static String setPassword(String password) {
		Manager.password = password;
		return password;
	}
	public static String getUserRole() {
		return userRole;
	}
	public static String setUserRole(String userRole) {
		Manager.userRole = userRole;
		return userRole; 
	}
	public  static String getHomeLocation() {
		return homeLocation;
	}
	public static String setHomeLocation(String homeLocation) {
		Manager.homeLocation = homeLocation;
		return homeLocation;
	}
	public  static String getPhoneNo() {
		return phoneNo;
	}
	public static String setPhoneNo(String phoneNo) {
		Manager.phoneNo = phoneNo;
		return phoneNo;
	}
	public static String getAddress() {
		return address;
	}
	public static String setAddress(String address) {
		Manager.address = address;
		return address;
	}
	public static int getStoreNo() {
		return storeNo;
	}
	public static int setStoreNo(int storeNo) {
		Manager.storeNo = storeNo;
		return storeNo;
	}
	// Manager's functionalities: 
	public static void addItem(String item) {
		Item.items.add(item);
	}
	public static boolean removeItem(String item) {
		Item.items.remove(item);
		return true;
	}
	public static void modifyItem(Item item) {
		
	}
	
	public static void updateQuantitiy(String item, int newQuantity) {
		Item.quantity = newQuantity; 
	}
	public static void updateAvailability(String item, boolean newAvailability) {
		Item.availability = newAvailability; 
	}
	public static void updateOpeningHours(Store storeNo, String newOpeningHours) {
		Store.openingHour = newOpeningHours; 
	}
	public static void updateClosingHours(Store storeNo, String newClosingHours) {
		Store.closingHour = newClosingHours; 
	}
	public static void updateMap(Store storeNo, String newMapLocation) {
		Store.mapLocation = newMapLocation; 
	}
	public static void setItemPrice(Item item, double price) {
		Item.price = price; 
	}
	
}

