package consoleApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import consoleApplication.AccountManager;
import consoleApplication.RoomManager;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.Room;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class ConsoleApplication {
	
	static Scanner userInput;
	static AccountManager accountManager;
	static RoomManager roomManager;
	static List<Account> accounts;
	static List<AccountType> accountTypes;
	static List<RoomType> roomTypes;
	static List<Room> rooms;
	
	static void init() {
		userInput = new Scanner(System.in);
		accounts = new LinkedList<Account>();
		accountTypes = new LinkedList<AccountType>();
		roomTypes = new LinkedList<RoomType>();
		rooms = new LinkedList<Room>();
		
		accountManager = new AccountManager(userInput, accounts, accountTypes);
		roomManager = new RoomManager(userInput, rooms, roomTypes);
		
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		
		AccountType accountType_admin = factory.createAccountType();
		accountTypes.add(accountType_admin);
		
		Account admin = factory.createAccount();
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
		
		do {
			username = "";
			result = null;
			
			System.out.print("Enter username (type 'quit' to quit): ");
			username = userInput.next();
		
			if (!username.equals("quit")) {
			
				System.out.print("Enter password: ");
				String password = userInput.next();
			
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
		//TODO add every funcionality, regarding the account type, watch out for the order of the functions
		//TODO add other groups
		System.out.println();
		System.out.println("*** MAIN MENU ***");
		
		if (loggedInAccount.getAccounttype().equals(accountTypes.get(0))) { //admin
			System.out.println("1. Manage accounts");
			System.out.println("2. Manage rooms and room types");
			System.out.println("3. Manage items");
			System.out.println("4. Manage bookings");
			System.out.println("5. Manage guests");
			System.out.println("6. Check-in guest");
			System.out.println("7. Check-out guest");
		}
		
		System.out.println();
		System.out.println("0. Log out");		
		System.out.println();
	}
	
	static void executeFunction(int choice, Account loggedInAccount) {
		//TODO convert incorrect choices to -1
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
		}
	}
	
	public static void main(String[] args){
		
		init();
		Account loggedInAccount = null;
		
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