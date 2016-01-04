package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Customer;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import Payment.CreditCard;
import Payment.Invoice;

public class CustomerManager {
	
	private Scanner userInput;
	private List<Customer> customers;
	private int ID;
	
	public CustomerManager(Scanner userInput, List<Customer> customers) {
		this.userInput = userInput;
		this.customers = customers;
		ID = 1;
	}
	
	//Returns the index of the customer with the ID 'customerID'
	//Returns -1 if no customer found with ID 'customerID'
	private int findCustomer(long customerID) {
		
		for (int i = 0; i < customers.size(); ++i)
			if (customers.get(i).getID() == customerID)
				return i;
		
		return -1;
	}
	
	/**
	 * Prints out all the customers currently stored in the system
	 */
	private void listCustomers() {
		System.out.println();
		System.out.println("\tID\tName\t\tPayment method");
		for (int i = 0; i < customers.size(); ++i) {
			Customer elem = customers.get(i);
			System.out.print((i+1) + ".\t#" + elem.getID() + "\t");
			
			//Since an individual customer's name and a company's name is stored in a different name
			if (elem instanceof IndividualCustomer) {
				System.out.print(((IndividualCustomer) elem).getFirstNames().get(0) + " "
						+ ((IndividualCustomer) elem).getFamilyNames().get(0) + "\t");
			}
			
			if (elem instanceof Organization) {
				System.out.print(((Organization) elem).getName() + "\t");
			}
			
			if (elem.getBillingInformation().get(0) instanceof Invoice) {
				System.out.println("Invoice");
			}
			if (elem.getBillingInformation().get(0) instanceof CreditCard) {
				System.out.println("Credit Card");
			}
		}
		
	}

	private void addBillingInfo(Customer newCustomer) {
		System.out.println();
		System.out.println("1. Invoice");
		System.out.println("2. Credit card");
		System.out.print("Payment method of the customer: ");
		int paymentMethod = userInput.nextInt();
		
		//Create invoice payment method
		if (paymentMethod != 2) {
			boolean valid = false;
			
			//Create an invoice and check if it is valid or not
			while (!valid) {
				System.out.print("Enter the invoice's number (numbers only): ");
				long invoiceNbr = userInput.nextLong();
			
				Invoice invoice = new Invoice(newCustomer);
				valid = invoice.validate();
				
				if (valid)
					newCustomer.addBillingInformation(invoice);
				else {
					System.out.println();
					System.out.println("The invoice's data is invalid!");
					System.out.println();
				}
			}
		}
		else {
			boolean valid = false;
			
			//Create a credit card and check if it is valid or not
			while (!valid) {
				System.out.print("Enter credit card's number (16 digits, numbers only): ");
				String cardno = userInput.next();
				
				System.out.print("Enter expiration date (YYYY-MM-DD): ");
				String expirationDate = userInput.next();
			
				System.out.print("Enter credit card's CVV number (3 digits, numbers only): ");
				String cvv = userInput.next();
			
				CreditCard creditCard = new CreditCard(cardno, cvv, expirationDate);
				valid = creditCard.validate();
				
				if (valid)
					newCustomer.addBillingInformation(creditCard);
				else {
					System.out.println();
					System.out.println("The credit card's data is invalid!");
					System.out.println();
				}
			}
		}
	}
	
	private void createIndividualCustomer() {
		IndividualCustomer newCustomer = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
		
		newCustomer.setID(ID);
		++ID;
		
		//Optional ToDo: we can ask for the title of the customer
		
		System.out.print("First name of the customer: ");
		String firstName = userInput.next();
		newCustomer.addFirstName(firstName);
		
		System.out.print("Family name of the customer: ");
		String familyName = userInput.next();
		newCustomer.addFamilyName(familyName);
		
		addBillingInfo(newCustomer);
		
		customers.add(newCustomer);

		System.out.println();
		System.out.print("Customer #" + newCustomer.getID() + ", "
						 + newCustomer.getFirstNames().get(0) + " " + newCustomer.getFamilyNames().get(0)
						 + " created.");
		System.out.println();

	}

	private void createOrganization() {
		Organization newOrganization = ClassDiagramFactoryImpl.eINSTANCE.createOrganization();
		
		newOrganization.setID(ID);
		++ID;
		
		System.out.print("Name of the organization: ");
		String name = userInput.next();
		newOrganization.setName(name);
		
		System.out.print("Address of the organization: ");
		String address = userInput.next();
		newOrganization.setAddress(address);
		
		addBillingInfo(newOrganization);
		
		//Optional ToDo: You can add newOrganization.getResponsiblePerson() if you want to.
		
		customers.add(newOrganization);
		
		System.out.println();
		System.out.print("Customer #" + newOrganization.getID() + ", "
						 + newOrganization.getName()
						 + " created.");
		System.out.println();		
	}

	//This method takes an existing customer, updates it with new data, and puts it back to the customers
	private void modifyCustomer() {
		System.out.println();
		System.out.print("Enter the ID of the customer you want to modify: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		if (searchResult >= 0) {
			
			System.out.println();
			
			if (customers.get(searchResult) instanceof IndividualCustomer) {
				IndividualCustomer modifiedCustomer = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
				
				modifiedCustomer.setID(customerID);
				
				//Optional ToDo: we can ask for the title of the customer
				
				System.out.print("New first name of the customer: ");
				String newFirstName = userInput.next();
				modifiedCustomer.addFirstName(newFirstName);
				
				System.out.print("New family name of the customer: ");
				String newFamilyName = userInput.next();
				modifiedCustomer.addFamilyName(newFamilyName);
				
				addBillingInfo(modifiedCustomer);
				
				customers.set(searchResult, modifiedCustomer);
			}
			
			if (customers.get(searchResult) instanceof Organization) {
				Organization modifiedOrganization = ClassDiagramFactoryImpl.eINSTANCE.createOrganization();
				
				modifiedOrganization.setID(customerID);
				
				System.out.print("New name of the organization: ");
				String newName = userInput.next();
				modifiedOrganization.setName(newName);
				
				System.out.print("New address of the organization: ");
				String newAddress = userInput.next();
				modifiedOrganization.setAddress(newAddress);
				
				addBillingInfo(modifiedOrganization);
				
				customers.set(searchResult, modifiedOrganization);
			}
			
			System.out.println();
			System.out.println("Customer #" + customerID + " updated.");
		}
		else
			System.out.println("ERROR! Customer not found!");
		
		System.out.println();
		
	}

	//This method removes a customer
	private void removeCustomer() {
		System.out.println();
		System.out.print("Enter the ID of the customer you want to remove: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		
		if (searchResult >= 0) {
			customers.remove(searchResult);
			System.out.println("Customer #" + customerID + " removed.");
		}
		else
			System.out.println("ERROR! No customer found with ID #" + customerID + "!");
		
	}
	
	public void start() {
		System.out.println();
		System.out.println("1. List existing customers");
		System.out.println("2. Add an individual customer");
		System.out.println("3. Add an organization");
		System.out.println("4. Modify an existing customer");
		System.out.println("5. Remove an existing customer");
		System.out.println("6. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		if (choice < 1 || choice > 6) choice = 6;
		
		switch(choice) {
		case 1:
			listCustomers();
			break;
		case 2:
			createIndividualCustomer();
			break;
		case 3:
			createOrganization();
			break;
		case 4:
			modifyCustomer();
			break;
		case 5:
			removeCustomer();
			break;
		}
	}
}