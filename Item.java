import java.util.ArrayList;
import java.util.List;

public class Item {
	/**
	 * as per requirements, each item has the following attributes
	 * 1- Name
	 * 2- Description
	 * 3- Price
	 * 4- Size
	 * 5- Availability
	 * 6- quantity
	 */
	static String name; 
	static String description;
	static double price; 
	static double size; 
	static boolean availability; 
	static int quantity;
	static List<String> items = new ArrayList<String>();
	
	// item constructor
	public Item(String name, String description, double price, double size, boolean availability, int quantity){
		Item.name = name; 
		Item.description=description; 
		Item.price = price;
		Item.size = size; 
		Item.availability = availability; 
		Item.quantity = quantity; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Item.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		Item.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		Item.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		Item.size = size;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		Item.availability = availability;
	}
	public int getQuanitity() {
		return quantity;
	}
	public void setQuanitity(int quanitity) {
		Item.quantity = quanitity;
	}
 
	
}
