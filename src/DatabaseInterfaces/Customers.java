package DatabaseInterfaces;

import java.util.List;
import java.util.UUID;

import ClassDiagram.Customer;

public interface Customers {
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(String email);
	Customer getCustomer(String email);
	Customer getCustomerByEmail(String email);
	List<Customer> getCustomers();
}
