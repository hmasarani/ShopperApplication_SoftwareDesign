import java.util.ArrayList;
import java.util.List;

// An Administrator, as defined in the requirements, has the same attributes and methods as a manager AND MORE.  
public class Administrator {
	private static String username;
	private static String password;
	private static String userRole;
	private static String homeLocation;
	private static String phoneNo;
	private static String address;

	public Administrator(String username, String password, String userRole, String homeLocation, String phoneNo,
			String address) {
		Administrator.username = username;
		Administrator.password = password;
		Administrator.userRole = userRole;
		Administrator.homeLocation = homeLocation;
		Administrator.phoneNo = phoneNo;
		Administrator.address = address;
	}

	public static String getUsername() {
		return username;
	}

	public static String setUsername(String username) {
		Administrator.username = username;
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public static String setPassword(String password) {
		Administrator.password = password;
		return password;
	}

	public static String getUserRole() {
		return userRole;
	}

	public static String setUserRole(String userRole) {
		Administrator.userRole = userRole;
		return userRole;
	}

	public static String getHomeLocation() {
		return homeLocation;
	}

	public static String setHomeLocation(String homeLocation) {
		Administrator.homeLocation = homeLocation;
		return homeLocation;
	}

	public static String getPhoneNo() {
		return phoneNo;
	}

	public static String setPhoneNo(String phoneNo) {
		Administrator.phoneNo = phoneNo;
		return phoneNo;
	}

	public static String getAddress() {
		return address;
	}

	public static String setAddress(String address) {
		Administrator.address = address;
		return address;
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

	// methods only special to an Administrator
	// 1 adding a store
	public Store addStore(int storeNo, String availability, String openingHour, String closingHour, String mapLocation,
			String storeManager, List<String> categoricalSections) {
		return new Store(storeNo, availability, openingHour, closingHour, mapLocation, storeManager,
				categoricalSections);

	}

	// 2 removing a store( only parameter needed here would be the store No)
	public void removeStore(int storeNo) {
		for (int i = 0; i < Store.stores.size(); i++)
			if (storeNo == Store.stores.get(i)) {
				Store.stores.remove(i);
			} else {
				continue;
			}
	}

	// 3 adding manager
	public Manager addManager(String username, String password, String userRole, String homeLocation, String phoneNo,
			String address, int storeNo) {
		Manager.managers.add(username);
		return new Manager(username, password, userRole, homeLocation, phoneNo, address, storeNo);

	}

	// 4 remove manager
	public void removeManager(String username) {
		for (int i = 0; i < Manager.managers.size(); i++) {
			if (Manager.managers.get(i).equalsIgnoreCase(username)) {
				Manager.managers.remove(i);
			} else {
				continue;
			}
		}
	}

}
