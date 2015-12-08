package DatabaseInterfaces;

import ClassDiagram.Customer;

	public interface Customers {
	//add a customer to the Customer table
	public void addCustomer(Customer customer);
	//remove customer from the Customer table
	public void deleteCustomer(Customer customer);
	//Display customer
	public void dispCustomer(Customer customer);
	//List all customers
	public void listCustomers();
}
