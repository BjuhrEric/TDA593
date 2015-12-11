package DatabaseInterfaces;

import java.util.List;
import java.util.UUID;

import ClassDiagram.Customer;

public interface Customers {
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(UUID id);
	Customer getCustomer(UUID id);
	List<Customer> getCustomers();
}
