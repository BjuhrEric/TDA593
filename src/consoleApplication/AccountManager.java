package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class AccountManager {
	
	Scanner userInput;
	List<Account> accounts;
	List<AccountType> accountTypes;
	
	public AccountManager(Scanner userInput, List<Account> accounts, List<AccountType> accountTypes) {
		this.userInput = userInput;
		this.accounts = accounts;
		this.accountTypes = accountTypes;
	}
	
	private int findAccount(String username) {
		
		for (int i = 0; i < accounts.size(); ++i)
			if (accounts.get(i).getUsername().equals(username))
				return i;
		
		return -1;
	}
	
	private void createNewAccount() {
		
		String username = "";
		int searchResult = -1;
		
		System.out.println();
		
		do {
			System.out.print("New account's username: ");
			username = userInput.next();
			
			searchResult = findAccount(username);
			
			if (username.equals("quit"))
				System.out.println("ERROR! Username cannot be 'quit', it is a command of the system!");
			
			if (searchResult >= 0)
				System.out.println("ERROR! Username '" + username + "' is already taken!");
			
		} while (username.equals("quit") || searchResult >= 0);
		
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
	
	private void modifyAccount() {
		
		System.out.println();
		System.out.print("Enter the username of the account you want to modify: ");
		String username = userInput.next();
		
		int searchResult = findAccount(username);
		if (searchResult >= 0) {
				
			System.out.println();
						
			String newUsername = "";
			int searchResult2 = -1;
			
			do {
				System.out.print("New username: ");
				newUsername = userInput.next();
				
				searchResult2 = findAccount(newUsername);
				
				if (newUsername.equals("quit"))
					System.out.println("ERROR! Username cannot be 'quit', it is a command of the system!");
				
				if (searchResult2 >= 0 && searchResult2 != searchResult)
					System.out.println("ERROR! Username '" + username + "' is already taken!");
				
			} while (newUsername.equals("quit") || (searchResult2 >= 0 && searchResult2 != searchResult));
			
			System.out.print("New password: ");
			String newPassword = userInput.next();
			
			ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
			Account newAccount = factory.createAccount();
			newAccount.setAccounttype(accountTypes.get(0)); //TODO ask what type it is
			newAccount.setUsername(newUsername);
			newAccount.setPassword(newPassword);
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
		
		int searchResult = findAccount(username);
		
		if (searchResult >= 0) {
			accounts.remove(searchResult);
			System.out.println("Account '" + username + "' removed.");
		}
		else
			System.out.println("ERROR! No account found with name '" + username + "'!");
	}
	
	public void start() {
		
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
}