package consoleApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class ConsoleApplication {
	
	static Scanner userInput;
	static List<Account> accounts;
	static List<AccountType> accountTypes;
	
	static void init() {
		userInput = new Scanner(System.in);
		accounts = new LinkedList<Account>();
		accountTypes = new LinkedList<AccountType>();
		
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
			System.out.println("2. Manage rooms");
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
			manageAccounts();
			break;
		}
	}
	
	static void createNewAccount() {
		
		String username = "";
		
		System.out.println();
		
		do {
			System.out.print("New account's username: ");
			username = userInput.next();
			
			if (username.equals("quit"))
				System.out.println("Username cannot be 'quit', it is a command of the system!");
			
		} while (username.equals("quit"));
		
		System.out.print("New account's password: ");
		String password = userInput.next();
		
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		Account newAccount = factory.createAccount();
		newAccount.setAccounttype(accountTypes.get(0)); //TODO ask what type it is
		newAccount.setUsername(username);
		newAccount.setPassword(password);
		accounts.add(newAccount);
		
		System.out.println();
		System.out.print("Account '" + username + "' created.");
		System.out.println();
	}
	
	static void modifyAccount() {
		//TODO
	}	
	
	static void removeAccount() {
		//TODO
	}
	static void manageAccounts() {
		
		System.out.println();
		System.out.println("1. Create a new account");
		System.out.println("2. Modify and existing account");
		System.out.println("3. Remove and existing account");
		System.out.println("4. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		if (choice < 1 || choice > 4) choice = 4;
		
		switch(choice) {
		case 1:
			createNewAccount();
			break;
		case 2:
			modifyAccount();
			break;
		case 3:
			removeAccount();
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