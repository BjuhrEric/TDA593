package DatabaseInterfaces;

import java.util.List;

import ClassDiagram.Account;

public interface Accounts {
	boolean addAccount(Account account);
	boolean deleteAccount(String name);
	Account getAccount(String name);
	List<Account> getAccounts();
}
