package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class AccountManager {
	
	//Local variables instead of database
	Scanner userInput;
	List<Account> accounts;
	List<AccountType> accountTypes;
	
	public AccountManager(Scanner userInput, List<Account> accounts, List<AccountType> accountTypes) {
		this.userInput = userInput;
		this.accounts = accounts;
		this.accountTypes = accountTypes;
	}
	
	//Returns the index of the user with the username 'username'
	//Returns -1 if no user found with username 'username'
	private int findAccount(String username) {
		for (int i = 0; i < accounts.size(); ++i)
			if (accounts.get(i).getUsername().equals(username))
				return i;
		
		return -1;
	}
	
	
	private void createAccount() {
		
		String username = "";
		int searchResult = -1;
		
		System.out.println();
		
		//We ask for username until it is valid: it's not 'quit', and it's not already taken
		do {
			System.out.print("New account's username: ");
			username = userInput.next();
			
			//We search for the given username in the already existing usernames
			//and store its index in 'searchResult'
			searchResult = findAccount(username);
			
			if (username.equals("quit"))
				System.out.println("ERROR! Username cannot be 'quit', it is a command of the system!");
			
			if (searchResult >= 0)
				System.out.println("ERROR! Username '" + username + "' is already taken!");
			
		} while (username.equals("quit") || searchResult >= 0);
		
		System.out.print("New account's password: ");
		String password = userInput.next();
		
		Account newAccount = ClassDiagramFactoryImpl.eINSTANCE.createAccount();
		newAccount.setAccounttype(accountTypes.get(0));
		//TODO Ask the type of the account, and set it
		newAccount.setUsername(username);
		newAccount.setPassword(password);
		accounts.add(newAccount);
		
		System.out.println();
		System.out.print("Account '" + username + "' created.");
		System.out.println();
	}
	
	//This method basically replaces an account with a new one
	private void modifyAccount() {
		
		System.out.println();
		System.out.print("Enter the username of the account you want to modify: ");
		String username = userInput.next();
		
		//We search for the given username
		int searchResult = findAccount(username);
		//If we found it, let's modify it
		if (searchResult >= 0) {
				
			System.out.println();
						
			String newUsername = "";
			int searchResult2 = -1;
			
			//Ask for username until it's valid: it's not 'quit', and not already taken
			//(it is OK if it's the old username of the account we want to modify)
			do {
				System.out.print("New username: ");
				newUsername = userInput.next();
				
				//Search for the given username. If it's already taken, it can't be used
				searchResult2 = findAccount(newUsername);
				
				if (newUsername.equals("quit"))
					System.out.println("ERROR! Username cannot be 'quit', it is a command of the system!");
				
				//If the username is already taken, and it is not the old username of the account we want to modify
				//then give an error
				if (searchResult2 >= 0 && searchResult2 != searchResult)
					System.out.println("ERROR! Username '" + newUsername + "' is already taken!");
				
			} while (newUsername.equals("quit") || (searchResult2 >= 0 && searchResult2 != searchResult));
			
			System.out.print("New password: ");
			String newPassword = userInput.next();
			
			Account newAccount = ClassDiagramFactoryImpl.eINSTANCE.createAccount();
			newAccount.setAccounttype(accountTypes.get(0));
			//TODO Ask the type of the account, and set it
			newAccount.setUsername(newUsername);
			newAccount.setPassword(newPassword);
			//We replace the old account with the new one we just created
			accounts.set(searchResult, newAccount);
			
			System.out.println();
			System.out.println("Account '" + username + "' updated.");
		}
		else
			System.out.println("ERROR! Account not found!");
		
		System.out.println();
	}
	
	private void removeAccount() {

		System.out.println();
		System.out.print("Enter the username of the account you want to remove: ");
		String username = userInput.next();
		
		//We search for the account
		int searchResult = findAccount(username);
		
		//If the account was found, delete it
		if (searchResult >= 0) {
			accounts.remove(searchResult);
			System.out.println("Account '" + username + "' removed.");
		}
		//...otherwise give an error
		else
			System.out.println("ERROR! No account found with name '" + username + "'!");
	}
	
	public void start() {
		
		System.out.println();
		System.out.println("1. Create a new account");
		System.out.println("2. Modify an existing account");
		System.out.println("3. Remove an existing account");
		System.out.println("4. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		//If the input is invalid, change it to 4, so it will just simply quit
		if (choice < 1 || choice > 4) choice = 4;
		
		switch(choice) {
		case 1:
			createAccount();
			break;
		case 2:
			modifyAccount();
			break;
		case 3:
			removeAccount();
			break;
		}
	}
}