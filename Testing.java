import static org.junit.Assert.*;
import org.junit.Test;

public class Testing {

	@Test
	public void testUserClass() {
		String username = User.setUsername("Hassan");
		assertTrue("Hassan".equals(username));
	}

	@Test
	public void testUserSetPass() {
		String password = User.setPassword("myPasswordis123");
		assertFalse("myPasswordis456".equals(password));
	}

	@Test
	public void testUserSetRole() {
		String userRole = User.setUserRole("Customer");
		assertTrue("Customer".equals(userRole));
	}

	@Test
	public void testUserSetLocation() {
		String homeLoc = User.setHomeLocation("123 NoLane Ave, Toronto, ON");
		assertFalse("default".equals(homeLoc));
	}

	@Test
	public void testUserSetStatus() {
		String status = User.setStatus("Inactive");
		assertTrue("Inactive".equals(status));
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testUserLoginMethod() {
		User myUser = new User("Hassan", "myPasswordis123");
		assertFalse(myUser.equals(User.login("Hassan", "myPasswordis123")));

	}

	@Test
	public void testUserChangeIdentifier() {
		User newUser = new User("Hassan1", null);
		assertFalse(User.getUsername().equals(User.changeIdentifier("Hassan", "Hassan1")));
	}

	@Test
	public void testUserChangePassword() {
		if (User.changePassword("MyoldPassword", "passwordisNew") == true) {
			assertTrue(true == true);
		} else {
			assertTrue(true == false);
		}
	}

	@Test
	public void testUserDeleteUser() {
		if (User.deleteUser("Hassan", "myPASSWORD123") == true) {
			assertTrue((1 == 1) == true);
		} else {
			fail();
		}
	}

	@Test
	public void testGetMethod() {
		assertTrue(User.getUsername().isEmpty() == false);
	}

	// Testing Store Class
	@Test
	public void testGetMethod2() {
		assertTrue(User.getStatus().isEmpty() == false);
	}

	@Test
	public void testGetMethod3() {
		assertTrue(User.getPassword().isEmpty() == false);
	}

	@Test
	public void testGetMethod5() {
		assertTrue(User.getUserRole().isEmpty() == false);
	}

	@Test
	public void testGetMethodStore32() {
		assertTrue(Store.getCategoricalSections().isEmpty() == true);
	}

	@Test
	public void testGetMethodStore5() {
		assertTrue(Store.getStoreNo() != 1);
	}

	@Test
	public void testStoreSetMethods2() {
		String opening = Store.setOpeningHour("3:30");
		assertTrue(Store.setOpeningHour("3:30").equals(opening));
	}

	@Test
	public void testStoreSetMethods3() {
		String closing = Store.setClosingHour("20:30");
		assertFalse(Store.setClosingHour("9:30").equals(closing));
	}

	@Test
	public void testStoreSetMethods4() {
		String avail = Store.setAvailibility("TRUE");
		assertTrue(Store.setAvailibility("TRUE").equals(avail));

	}

	@Test
	public void testStoreSetMethods5() {
		String storeManager = Store.setStoreManager("Andrew");
		assertTrue(Store.setStoreManager("Andrew").equals(storeManager));
	}

	@Test
	public void testStoreSetMethods6() {
		String mapLocation = Store.setMapLocation("Mississauga");
		assertFalse(Store.setMapLocation("HAMILTON").equals(mapLocation));

	}

	@Test
	public void testStoreSetMethods() {
		Store myStore = new Store(0, null, null, null, null, null, null);
		if (Store.getClosingHour() != null && Store.getOpeningHour() != null && Store.getMapLocation() != null
				&& Store.getStoreManager() != null) {
			fail();
		} else {
			assertTrue(1 == 1);
		}

	}
	@Test
	public void testNewUser1() {
		newUser user = new newUser("Hassan", null, null, null, null);
		if(newUser.getUsername() == "Hassan") {
			assertTrue(1 == 1);
		}
		else {
			fail();
			
		}
	}
	@Test
	public void testNewUser2() {
		assertTrue(newUser.getEmail() == null);

	}
	@Test
	public void testNewUser3() {
		assertFalse(newUser.getPassword() != null);
	}
	@Test
	public void testNewUser4() {
		assertTrue(newUser.getPhoneNo() == null);
	}
	@Test
	public void testNewUser5() {
		assertTrue(newUser.getRole() == null);
	}
	@Test
	public void testnewUser6() {
		String email = newUser.setEmail("hassanax@my.yorku.ca");
		assertTrue(("hassanax@my.yorku.ca").equals(email));
	}
	@Test
	public void testNewUser() {
		String username = newUser.setUsername("Hassan123");
		assertTrue("Hassan123".equals(username));
	}
	@Test
	public void testNewUser7() {
		String password = newUser.setPassword("myPasswordis123");
		if(password.equals("myPasswordis123")) {
			assertTrue(1 == 1);
		}
		else {
			fail();
		}
	}
	@Test
	public void testNewUser8() {
		String phoneNo = newUser.setPhoneNo("18003552019");
		if(phoneNo.equals("18003552018")) {
			fail();
		}
		else if(phoneNo.equals("18003552019")) {
			assertTrue(1 ==1);
		}
		else {
			//do nothing
		}
	}
	@Test
	public void testNewUser9() {
		String role = newUser.setRole("Manager");
		if(!role.equals("Manager")) {
			fail();
		}
		else if (role.equals("Manager")){
			assertTrue(1==1);
		}
		else {
			// do nothing
		}
	}
	
	// Now we test the manager class with all of its functionality 
	@Test
	public void testManager() {
		Manager manager = new Manager(null, null, null, null, null, null, 123);
		if (Manager.getStoreNo() == 123) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testManager1() {
		assertTrue(Manager.getAddress() == null);
	}
	@Test 
	public void testManager2() {
		assertTrue(Manager.getHomeLocation() == null);
	}
	@Test 
	public void testManager3() {
		assertFalse(Manager.getPassword() != null);
		
	}
	@Test 
	public void testManager4() {
		assertFalse(Manager.getPhoneNo() != null);
	}
	@Test 
	public void testManager5() {
		assertTrue(Manager.getStoreNo() != -1);
	}
	@Test 
	public void testManager6() {
		assertTrue(Manager.getUsername() == null);
	}
	@Test 
	public void testManager7() {
		assertTrue(Manager.getUserRole() != "Customer");
	}
	@Test 
	public void testManager8() {
		String address = Manager.setAddress("Mississauga, ON");
		assertTrue(address.equals("Mississauga, ON"));
		
	}
	@Test 
	public void testManager9() {
		String homeLocation = Manager.setHomeLocation("123");
		assertTrue(homeLocation.equals("123"));
	}
	@Test 
	public void testManager10() {
		String password = Manager.setPassword("passwordis123");
		assertFalse("passwordis12".equals(password));
	}
	@Test 
	public void testManager11() {
		String phone = Manager.setPhoneNo("18001234567");
		assertTrue("18001234567".equals(phone));
	}
	@Test 
	public void testManager12() {
		int StoreNo = Manager.setStoreNo(1);
		if(StoreNo != 1) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test 
	public void testManager13() {
		String username = Manager.setUsername("Hassan");
		assertTrue(username.equals("Hassan"));
	}
	@Test 
	public void testManager14() {
		String role = Manager.setUserRole("Manager");
		if(role != "Manager") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test 
	public void testManagerAddItem() {
		String item = "Banana";
		Manager.addItem(item);
		if(Item.items.contains(item)) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testManagerAddItem2() {
		String item = "Apple";
		//try not to add it
		if(!Item.items.contains(item)) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testManagerRemoveItem() {
		String item = "Apple";
		Manager.addItem(item);
		if (Manager.removeItem(item) == true) {
			assertTrue(1==1);
		}
		else {
			fail(); 
		}
		
	}
	@Test 
	public void testManagerRemoveItem2() {
		String item = "Apple";
		Manager.addItem(item);
		if (Manager.removeItem(item) == true) {
			assertTrue(1==1);
		}
		else {
			fail(); 
		}
		
	}
	@Test
	public void testManagerUpdateQuantity() {
		Manager.updateQuantitiy("Apple", 10);
		if (Item.quantity !=10) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test
	public void testManagerUpdateQuantity2() {
		Manager.updateQuantitiy("Banana", 0);
		if (Item.quantity ==0) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test
	public void testManagerupdateAvailability() {
		boolean BananaAv = false;
		Manager.updateAvailability("Banana", false);
		if (Item.availability != BananaAv) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test
	public void testManagerupdateAvailability2() {
		boolean Pineappleav = true;
		Manager.updateAvailability("Banana", true);
		if (Item.availability != Pineappleav) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testManagerupdateOpeningHours() {
		Store myStore = null;
		myStore.setOpeningHour("1:30");
		Manager.updateOpeningHours(myStore, "2:30");
		if(myStore.openingHour == "2:30") {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testManagerupdateOpeningHours2() {
		Store myStore = null;
		myStore.setOpeningHour(null);
		Manager.updateOpeningHours(myStore, "2:30");
		if(myStore.openingHour != "2:30") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testManagerupdateClosingHours() {
		Store myStore = null;
		myStore.setClosingHour("1:30");
		Manager.updateClosingHours(myStore, "2:30");
		if(myStore.closingHour == "2:30") {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testManagerupdateClosingHours2() {
		Store myStore = null;
		myStore.setClosingHour(null);
		Manager.updateClosingHours(myStore, "2:30");
		if(myStore.closingHour != "2:30") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	
	// Now we test the Administrator's class
	@Test
	public void testAdmin() {
		Administrator manAdminager = new Administrator(null, null, null, null, null, null);
		if (Manager.getStoreNo() == 0) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testAdmin1() {
		assertTrue(Administrator.getAddress() == null);
	}
	@Test 
	public void testAdmin2() {
		assertTrue(Administrator.getHomeLocation() == null);
	}
	@Test 
	public void testAdmin3() {
		assertFalse(Administrator.getPassword() != null);
		
	}
	@Test 
	public void testAdmin4() {
		assertFalse(Administrator.getPhoneNo() != null);
	}
	
	@Test 
	public void testAdmin6() {
		assertTrue(Administrator.getUsername() == null);
	}
	@Test 
	public void testAdmin7() {
		assertTrue(Administrator.getUserRole() != "Customer");
	}
	@Test 
	public void testAdmin8() {
		String address = Administrator.setAddress("Mississauga, ON");
		assertTrue(address.equals("Mississauga, ON"));
		
	}
	@Test 
	public void testAdmin9() {
		String homeLocation = Administrator.setHomeLocation("123");
		assertTrue(homeLocation.equals("123"));
	}
	@Test 
	public void testAdmin10() {
		String password = Administrator.setPassword("passwordis123");
		assertFalse("passwordis12".equals(password));
	}
	@Test 
	public void testAdmin11() {
		String phone = Administrator.setPhoneNo("18001234567");
		assertTrue("18001234567".equals(phone));
	}
	
	@Test 
	public void testAdmin13() {
		String username = Administrator.setUsername("Hassan");
		assertTrue(username.equals("Hassan"));
	}
	@Test 
	public void testAdmin14() {
		String role = Administrator.setUserRole("Manager");
		if(role != "Manager") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test 
	public void testAdminAddItem() {
		String item = "Banana";
		Administrator.addItem(item);
		if(Item.items.contains(item)) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testAdminAddItem2() {
		String item = "Apple";
		//try not to add it
		if(!Item.items.contains(item)) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test 
	public void testAdminRemoveItem() {
		String item = "Apple";
		Administrator.addItem(item);
		if (Administrator.removeItem(item) == true) {
			assertTrue(1==1);
		}
		else {
			fail(); 
		}
		
	}
	@Test 
	public void testAdminRemoveItem2() {
		String item = "Apple";
		Administrator.addItem(item);
		if (Administrator.removeItem(item) == true) {
			assertTrue(1==1);
		}
		else {
			fail(); 
		}
		
	}
	@Test
	public void testAdminUpdateQuantity() {
		Administrator.updateQuantitiy("Apple", 10);
		if (Item.quantity !=10) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test
	public void testAdminUpdateQuantity2() {
		Administrator.updateQuantitiy("Banana", 0);
		if (Item.quantity ==0) {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@Test
	public void testAdminupdateAvailability() {
		boolean BananaAv = false;
		Administrator.updateAvailability("Banana", false);
		if (Item.availability != BananaAv) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@Test
	public void testAdminupdateAvailability2() {
		boolean Pineappleav = true;
		Administrator.updateAvailability("Banana", true);
		if (Item.availability != Pineappleav) {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testAdminupdateOpeningHours() {
		Store myStore = null;
		myStore.setOpeningHour("1:30");
		Administrator.updateOpeningHours(myStore, "2:30");
		if(myStore.openingHour == "2:30") {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testAdminupdateOpeningHours2() {
		Store myStore = null;
		myStore.setOpeningHour(null);
		Administrator.updateOpeningHours(myStore, "2:30");
		if(myStore.openingHour != "2:30") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testAdminupdateClosingHours() {
		Store myStore = null;
		myStore.setClosingHour("1:30");
		Administrator.updateClosingHours(myStore, "2:30");
		if(myStore.closingHour == "2:30") {
			assertTrue(1==1);
		}
		else {
			fail();
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void testAdminrupdateClosingHours2() {
		Store myStore = null;
		myStore.setClosingHour(null);
		Administrator.updateClosingHours(myStore, "2:30");
		if(myStore.closingHour != "2:30") {
			fail();
		}
		else {
			assertTrue(1==1);
		}
	}
	
	}
