package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Customer;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Title;
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
	
	private int findCustomer(long customerID) {
		
		for (int i = 0; i < customers.size(); ++i)
			if (customers.get(i).getId() == customerID)
				return i;
		
		return -1;
	}
	
	private void listCustomers() {
		// TODO Auto-generated method stub
		
	}

	private void setTitle(IndividualCustomer newCustomer) {
		// TODO Auto-generated method stub
	}
	
	private void addBillingInfo(Customer newCustomer) {
		System.out.println();
		System.out.println("1. Invoice");
		System.out.println("2. Credit card");
		System.out.print("Payment method of the customer: ");
		int paymentMethod = userInput.nextInt();
		
		if (paymentMethod != 2) {
			boolean valid = false;
			
			while (!valid) {
				System.out.print("Enter the invoice's number (numbers only): ");
				long invoiceNbr = userInput.nextLong();
			
				Invoice invoice = new Invoice(invoiceNbr);
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
			
			while (!valid) {
				System.out.print("Enter credit card's number (16 digits, numbers only): ");
				String cardno = userInput.next();
			
				System.out.print("Enter credit card's CVV number (3 digits, numbers only): ");
				String cvv = userInput.next();
			
				CreditCard creditCard = new CreditCard(cardno, cvv);
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
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		IndividualCustomer newCustomer = factory.createIndividualCustomer();
		
		newCustomer.setID(ID);
		++ID;
		
		//System.out.println("Choose the title of the new customer: ");
		setTitle(newCustomer);
		
		System.out.print("First name of the customer: ");
		String firstName = userInput.next();
		newCustomer.addFirstName(firstName);
		
		System.out.print("Family name of the customer: ");
		String familyName = userInput.next();
		newCustomer.addFamilyName(familyName);
		
		addBillingInfo(newCustomer);
		
		System.out.println();
		System.out.print("Customer #" + newCustomer.getID() + ", "
						 + newCustomer.getFirstNames().get(0) + " " + newCustomer.getFamilyNames().get(0)
						 + " created.");
		System.out.println();

	}

	private void createOrganization() {
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		Organization newOrganization = factory.createOrganization();
		
		newOrganization.setID(ID);
		++ID;
		
		System.out.println("Name of the organization: ");
		String name = userInput.next();
		newOrganization.setName(name);
		
		System.out.print("Address of the organization: ");
		String address = userInput.next();
		newOrganization.setAddress(address);
		
		addBillingInfo(newOrganization);
		
		//TODO You can add newOrganization.getResponsiblePerson() if you want to.
		
		System.out.println();
		System.out.print("Customer #" + newOrganization.getID() + ", "
						 + newOrganization.getName()
						 + " created.");
		System.out.println();		
	}

	private void modifyCustomer() {
		System.out.println();
		System.out.print("Enter the ID of the customer you want to modify: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		if (searchResult >= 0) {
			
			System.out.println();
			
			ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
			
			if (customers.get(searchResult) instanceof IndividualCustomer) {
				IndividualCustomer modifiedCustomer = factory.createIndividualCustomer();
				
				//System.out.println("Choose the title of the new customer: ");
				setTitle(modifiedCustomer);
				
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
				Organization modifiedOrganization = factory.createOrganization();
				
				System.out.println("New name of the organization: ");
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