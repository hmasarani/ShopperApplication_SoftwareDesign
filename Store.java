import java.util.ArrayList;
import java.util.List;

public class Store {
	/**
	 * Each store has its own store number, availability, opening hour, closing hour, map location, categorical sections
	 * store Manager
	 */
	
	static int storeNo; 
	static String availibility; 
	static String openingHour;
	static String closingHour;
	static String mapLocation; 
	static String storeManager; 
	static List<String> categoricalSections = new ArrayList<String>(); 
	static List<Integer> stores = new ArrayList<Integer>();
	
	// to create a new store (only the adminstrator's functionality) 
	 Store(int storeNo, String availability, String openingHour, String closingHour, String mapLocation, String storeManager, List<String> categoricalSections){
		Store.storeNo = storeNo; 
		Store.availibility = availability; 
		Store.openingHour = openingHour; 
		Store.mapLocation = mapLocation; 
		Store.storeManager = storeManager; 
		Store.categoricalSections = categoricalSections;
	}
	
	public static int getStoreNo() {
		return storeNo;
	}
	public static int setStoreNo(int storeNo) {
		Store.storeNo = storeNo;
		return storeNo;
	}
	public String isAvailibility() {
		return availibility;
	}
	public static String setAvailibility(String availibility) {
		Store.availibility = availibility;
		return availibility;
	}
	public static String getOpeningHour() {
		return openingHour;
	}
	public static String setOpeningHour(String openingHour) {
		Store.openingHour = openingHour;
		return openingHour; 
	}
	public static String getClosingHour() {
		return closingHour;
	}
	public static String setClosingHour(String closingHour) {
		Store.closingHour = closingHour;
		return closingHour;
	}
	public static String getMapLocation() {
		return mapLocation;
		
	}
	public static String setMapLocation(String mapLocation) {
		Store.mapLocation = mapLocation;
		return mapLocation; 
	}
	public static String getStoreManager() {
		return storeManager;
	}
	public static String setStoreManager(String storeManager) {
		Store.storeManager = storeManager;
		return storeManager;
		
	}
	public static List<String> getCategoricalSections() {
		return categoricalSections;
	}
	public static List<String> setCategoricalSections(List<String> categoricalSections) {
		Store.categoricalSections = categoricalSections;
		return categoricalSections;
	}
	


}
