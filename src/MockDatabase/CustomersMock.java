package MockDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.Customer;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Person;
import ClassDiagram.Title;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.Customers;
import Payment.CreditCard;
import Payment.Invoice;

public class CustomersMock implements Customers {

	HashMap<String, Customer> customers;
	private static CustomersMock instance = null;
	
	private CustomersMock(){
		//Customer email is the key
		customers = new HashMap<String, Customer>();
		
		IndividualCustomer c1 = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
		c1.addBillingInformation(new CreditCard("1234123412341234", "123", "1216"));
		c1.addFamilyName("Jonsson");
		c1.addFirstName("Elvira");
		c1.setEmail("elvirajonsson123@hotmail.com");
		c1.setTitle(Title.MS);
		c1.setAddress("Lilla regementsvägen 10");
		c1.setPhoneNumber("07680326056");
		customers.put(c1.getEmail(), c1);
		
		IndividualCustomer c2 = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
		c2.addBillingInformation(new CreditCard("1234512345123451", "125", "1116"));
		c2.addFamilyName("Thoren");
		c2.addFirstName("Joakim");
		c2.setEmail("joakimthoren@hotmail.com");
		c2.setTitle(Title.MR);
		c2.setAddress("Lilla regementsvägen 10");
		c2.setPhoneNumber("0768032606123");
		customers.put(c2.getEmail(), c2);
		
		IndividualCustomer c3 = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
		c3.addBillingInformation(new CreditCard("1111222233334444", "124", "1016"));
		c3.addFamilyName("Renhorn");
		c3.addFirstName("Tomten");
		c3.setEmail("lillalven@hotmail.com");
		c3.setTitle(Title.MR);
		c3.setAddress("Nordpolen 1");
		c3.setPhoneNumber("666");
		customers.put(c3.getEmail(), c3);
		
		Organization o = ClassDiagramFactoryImpl.eINSTANCE.createOrganization();
		o.addBillingInformation(new Invoice(o));
		o.setAddress("företagsvägen 1");
		o.setName("Chalmers");
		Person rektorn = ClassDiagramFactoryImpl.eINSTANCE.createPerson();
		rektorn.setTitle(Title.MR);
		rektorn.addFamilyName("Ahrendt");
		rektorn.addFirstName("Wolfgang");
		o.setResponsiblePerson(rektorn);
		customers.put(""/*o.getEmail()*/, o);
	}
	
	public static CustomersMock getInstance(){
		if(instance == null){
			instance = new CustomersMock();
		}
		return instance;
	}
	
	@Override
	public boolean addCustomer(Customer customer) {
		//Only inserts if key is unique and then returns true, otherwise returns false (fail to insert)
		return customers.putIfAbsent(""/* TODO: Uncomment when getEmail() exists for class Organization customer.getEmail()*/, customer) == null;
	}

	@Override
	public boolean deleteCustomer(String email) {
		return customers.remove(email) != null;
	}

	@Override
	public Customer getCustomer(String email) {
		return customers.get(email);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		for(Customer c : customers.values()){
			//TODO: Add getEmail to customer interface
			if(true/*c.getEmail().equals(email)*/){
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		return new ArrayList<Customer>(customers.values());
	}

}
