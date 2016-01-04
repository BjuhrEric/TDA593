package consoleApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.Customer;
import ClassDiagram.Item;
import ClassDiagram.Room;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.Customers;
import MockDatabase.CustomersMock;

public class ConsoleApplication {
	
	//Manager objects
	static Scanner userInput;
	static AccountManager accountManager;
	static RoomManager roomManager;
	static ItemManager itemManager;
	static BookingManager bookingManager;
	static CustomerManager customerManager;
	static CheckingManager checkingManager;
	
	//Local variables instead of database
	static List<Account> accounts;
	static List<AccountType> accountTypes;
	static List<RoomType> roomTypes;
	static List<Room> rooms;
	static List<Item> items;
	static List<Customer> customers;
	
	static void init() {
		userInput = new Scanner(System.in);
		accounts = new LinkedList<Account>();
		accountTypes = new LinkedList<AccountType>();
		roomTypes = new LinkedList<RoomType>();
		rooms = new LinkedList<Room>();
		items = new LinkedList<Item>();
		customers = CustomersMock.getInstance().getCustomers();
		
		accountManager = new AccountManager(userInput, accounts, accountTypes);
		roomManager = new RoomManager(userInput, rooms, roomTypes);
		itemManager = new ItemManager(userInput, items);
		customerManager = new CustomerManager(userInput, customers);
		bookingManager = new BookingManager(userInput, customers, roomTypes);
		checkingManager = new CheckingManager(userInput, rooms, customers);
		
		//We create an 'admin' account type
		AccountType accountType_admin = ClassDiagramFactoryImpl.eINSTANCE.createAccountType();
		accountTypes.add(accountType_admin);
		
		//We create a 'receptionist' account type
		AccountType accountType_receptionist = ClassDiagramFactoryImpl.eINSTANCE.createAccountType();
		accountTypes.add(accountType_receptionist);
		
		//We create a 'cleaner' account type
		AccountType accountType_cleaner = ClassDiagramFactoryImpl.eINSTANCE.createAccountType();
		accountTypes.add(accountType_cleaner);
		
		//We create a 'chef' account type
		AccountType accountType_chef= ClassDiagramFactoryImpl.eINSTANCE.createAccountType();
		accountTypes.add(accountType_chef);
		//Optional ToDo: add more account types
		
		//We add an account with the privileges of an admin
		Account admin = ClassDiagramFactoryImpl.eINSTANCE.createAccount();
		admin.setAccounttype(accountType_admin);
		admin.setUsername("admin");
		admin.setPassword("admin");
		
		accounts.add(admin);
		
		System.out.println("***** HOTEL SYSTEM *****");
		System.out.println();
	}
	
	
	
	//Ensures: result == null || result is a valid user
	static Account login() {
		String username = "";
		Account result = null;
		
		//We ask for username until the user inputs 'quit' or until the login is successful
		do {
			username = "";
			result = null;
			
			//We ask the username
			System.out.print("Enter username (type 'quit' to quit): ");
			username = userInput.next();
		
			if (!username.equals("quit")) {
				//If the username was valid, we ask the password
				System.out.print("Enter password: ");
				String password = userInput.next();
			
				//We search for an account with the name & password given by the user
				for (int i = 0; i < accounts.size(); ++i)
					if (accounts.get(i).getUsername().equals(username)
					&&  accounts.get(i).getPassword().equals(password))
						result = accounts.get(i);
				
				if (result == null) System.out.println("Incorrect username or password!");
				
			}
			
		} while (!username.equals("quit") && result == null);
		
		return result;
	}
	
	static void printFunctions(Account loggedInAccount) {
		//TODO This method should handle every account type, not just 'admin'.
		System.out.println();
		System.out.println("*** MAIN MENU ***");
		
		if (loggedInAccount.getAccounttype().equals(accountTypes.get(0))) { //admin
			System.out.println("1. Manage accounts");
			System.out.println("2. Manage rooms and room types");
			System.out.println("3. Manage customers");
			System.out.println("4. Manage bookings");
			System.out.println("5. Manage items");
			System.out.println("6. Check-in guest");
			System.out.println("7. Check-out guest");
			//Possible ToDo: 8. Manage bills (add/remove items to/from a bill)
			//Possible ToDo: 9. Mark a room as cleaned
		}
		
		System.out.println();
		System.out.println("0. Log out");		
		System.out.println();
	}
	
	static void executeFunction(int choice, Account loggedInAccount) {
		//TODO If 'choice' is an incorrect number, change it to -1 somehow, and the switch-case will handle it
		//TODO Watch out! This is written for the 'admin' only. It is possible that choice '1' will not be
		//	   'Manage accounts' for ex. the 'receptionist' account type.
		switch(choice) {
		case -1:
			System.out.println("Incorrect function!");
			break;
		case 1:
			accountManager.start();
			break;
		case 2:
			roomManager.start();
			break;
		case 3:
			customerManager.start();
			break;
		case 4:
			bookingManager.start();
			break;
		case 5:
			itemManager.start();
			break;
		case 6:
			checkingManager.startCheckIn();
			break;
		case 7:
			checkingManager.startCheckOut();
			break;
		}
	}
	
	public static void main(String[] args){
		
		init();
		Account loggedInAccount = null;
		
		//This loops holds until loggedInAccount isn't null == the user does not input 'quit' as username
		do {
			
			loggedInAccount = login();
			
			if (loggedInAccount != null) {
				
				System.out.println();
				System.out.println("Hi " + loggedInAccount.getUsername() + "!");
				System.out.println();
				
				int choice = 0;
				
				do {
					printFunctions(loggedInAccount);
					System.out.print("Please select a function: ");
					
					choice = userInput.nextInt();
					executeFunction(choice, loggedInAccount);
				} while (choice != 0);
			}
			
		} while (loggedInAccount != null);
		
	}
}