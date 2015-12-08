package DatabaseInterfaces;

import ClassDiagram.Account;

public interface Accounts {
		//add a account to the Account table
		public void addAccount(Account account);
		//remove account from the Account table
		public void deleteAccount(Account account);
		//Display account
		public void dispAccount(Account account);
		//List all accounts
		public void listAccounts();
}
