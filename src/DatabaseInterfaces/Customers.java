package DatabaseInterfaces;

import java.util.List;
import java.util.UUID;

import ClassDiagram.Customer;

public interface Customers {
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(UUID id);
	Customer getCustomer(UUID id);
	Customer getCustomerByEmail(String email);
	List<Customer> getCustomers();
}
