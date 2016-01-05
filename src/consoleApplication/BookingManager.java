package consoleApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import ClassDiagram.Bill;
import ClassDiagram.BillingInformation;
import ClassDiagram.Customer;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Person;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.Title;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.Customers;
import DatabaseInterfaces.RoomBookings;
import DatabaseInterfaces.RoomTypes;
import MockDatabase.CustomersMock;
import MockDatabase.RoomTypesMock;
import Payment.CreditCard;
import Payment.Invoice;

public class BookingManager {

	//Local variables instead of database
	Scanner userInput;
	List<RoomType> roomTypes;
	List<Customer> customers;
	int ID; //This variable is used to give different IDs to each booking
	
	public BookingManager(Scanner userInput, List<Customer> customers, List<RoomType> roomTypes) {
		this.userInput = userInput;
		this.customers = customers;
		this.roomTypes = roomTypes;
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
	
	private void listAllBookings() {
		for (Customer c : customers) {
			listBookings(c);
		}
	}
	
	//Lists every booking of one customer
	//The customers ID is asked
	private void listBookings() {
		System.out.println();
		System.out.print("Enter the ID of the customer of the bookings: ");
		long customerID = userInput.nextLong();
		
		//We search for the customer
		int searchResult = findCustomer(customerID);
		
		//If the customer was found, we print its booking
		if (searchResult >= 0) {
			Customer customer = customers.get(searchResult);
			listBookings(customer);
		}
		else {
			System.out.println("ERROR! Customer not found!");
			System.out.println();
		}		
	}
	
	/**
	 * Lists every booking of a customer
	 * @param customer the customer whose bookings needed to be listed
	 */
	private void listBookings(Customer customer) {
		
		//Since an individual customer's name and a company's name is stored in a different name
		//we have to print it in two different ways
		System.out.println();
		System.out.print("Current bookings for");
		if (customer instanceof IndividualCustomer) {
			((IndividualCustomer) customer).getFirstNames()
						.forEach((name) -> System.out.print(" " + name));
			((IndividualCustomer) customer).getFamilyNames()
						.forEach((name) -> System.out.print(" " + name));
		}
		if (customer instanceof Organization) {
			System.out.print(" " + ((Organization) customer).getName());
		}
		System.out.println(":");		
		
		//We print the header
		System.out.println("No. Id\tStart Date\t\t\tEnd date");
		
		EList<RoomBooking> bookings = customer.getRoomBookings();
		//We print out every booking
		for (int i = 0; i < bookings.size(); ++i) {
			RoomBooking elem = bookings.get(i);
			System.out.println((i+1) + ". #" + elem.getId()
									 + "\t" + elem.getStartDate().toString()
									 + "\t" + elem.getEndDate().toString());
			
			//Optional ToDo: We can print out the bookings' room types too.
		}
		
		System.out.println();
	}

	/**
	 * Prints out all the room types currently stored in the system
	 */
	private void listRoomTypes() {
		System.out.println();
		for (int i = 0; i < roomTypes.size(); ++i)
			System.out.println((i+1) + ". " + roomTypes.get(i).getName());
		System.out.println();
	}
	
	/**
	 * Adds a room type to a booking
	 * @param newBooking the room type will be added to this booking
	 * @param roomTypeNumber the number of the room type in the list
	 * @return true if the adding was successful, false otherwise
	 */
	private boolean addARoomTypeToBooking(RoomBooking newBooking, int roomTypeNumber) {
		//We have to decrease roomTypeNumber, since the list on the screen is numbered [1 - size]
		//but our List is indexed [0 - size-1]
		--roomTypeNumber;
		
		if (0 <= roomTypeNumber && roomTypeNumber < roomTypes.size()) {
			newBooking.addRoomType(roomTypes.get(roomTypeNumber));
			return true;
		}

		return false;
	}	
	
	@SuppressWarnings("deprecation")
	private void createBooking() {
		String stupidHackVariable = userInput.nextLine();
		
		RoomBooking newBooking = ClassDiagramFactoryImpl.eINSTANCE.createRoomBooking();
		newBooking.setId(ID++);
		
		/** Comments labeled 1..n corresponds to the flow of events of the Complete Use Case 1: Booking **/
		//1. Actor enter the number of rooms he/she wants to book, the number of people staying in each room and the arrival and departure date.
		System.out.print("Enter the number of rooms you want to book: ");
		int numberOfRooms = Integer.parseInt(userInput.nextLine());
		int numberOfGuestsInRooms[] = new int[numberOfRooms];
		for(int i = 1; i <= numberOfRooms; i++) {
			System.out.print("Enter the number of people that will stay in room #" + i + ": ");
			numberOfGuestsInRooms[(i-1)] = Integer.parseInt(userInput.nextLine());
		}
		
		int totalNumberOfGuests = 0;
		for(int i = 0; i < numberOfRooms; i++) {
			totalNumberOfGuests += numberOfGuestsInRooms[i];
		}
		
		//Not sure if this is needed, or numberOfGuests is calculated inside the 'Booking' class
		newBooking.setNumberOfGuests(totalNumberOfGuests);
		
		System.out.print("Year of start date: ");
		int startYear = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Month of start date: ");
		int startMonth = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Day of start date: ");
		int startDay = Integer.parseInt(userInput.nextLine());
		
		//Sorry for the deprecated Date, replace it with Calendar if you want.
		//Set the date to YYYY.MM.DD 12:00:00
		//Month needed to be decreased, dunno why
		Date startDate = new Date();
		startDate.setYear(startYear);
		startDate.setMonth(startMonth-1);
		startDate.setDate(startDay);
		startDate.setHours(12);
		startDate.setMinutes(0);
		startDate.setSeconds(0);
		
		newBooking.setStartDate(startDate);
		
		System.out.print("Year of end date: ");
		int endYear = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Month of end date: ");
		int endMonth = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Day of end date: ");
		int endDay = Integer.parseInt(userInput.nextLine());
		
		Date endDate = new Date();
		endDate.setYear(endYear);
		endDate.setMonth(endMonth-1);
		endDate.setDate(endDay);
		endDate.setHours(10);
		endDate.setMinutes(0);
		endDate.setSeconds(0);
		
		newBooking.setEndDate(endDate);
		
		//2. The system provides a list of available room types for each room based on the capacity of the room type and a list of available packages that is suitable.
		RoomTypes roomTypes = RoomTypesMock.getInstance();
		List<RoomType> availableRoomTypes = roomTypes.getAvailableRoomTypes(startDate, endDate, numberOfGuestsInRooms);
		for(int i = 0; i < availableRoomTypes.size(); i++) {
			System.out.println("Available Roomtype #" + new Integer(i+1) + ": " + availableRoomTypes.get(i).toString());
		}

		//3. Assume: There are enough available room types to satisfy the booking
		Date current = new Date();
		Date next = new Date();
		next.setYear(current.getYear() + 2);
		int[] noGuests = {0};
		List<RoomType> allAvailableRoomTypes = roomTypes.getAvailableRoomTypes(current,  next, noGuests);
		if(allAvailableRoomTypes.isEmpty()) {
			System.out.println("There are no available room types. Booking can't be made, terminating...");
			return;
		}
		if(availableRoomTypes.isEmpty()) {
			//3a. There are not enough room types available.
			//1.  System provides information about which room types are available.
			System.out.println("There are not enough room type.");
			for(RoomType roomType : allAvailableRoomTypes) {
				System.out.println("Available Roomtype: " + roomType.toString());
			}
			
			//2.  Actor chooses to redo the booking with another distribution of people
			String redoChoice = "";
			do {
				System.out.print("Do you want to redo the booking with another distribution of people? (y/n): ");
				redoChoice = userInput.nextLine();
			} while(!redoChoice.equals("y") && !redoChoice.equals("n"));
			
			if(redoChoice.equals("n")) {
				return;
			}
			//3.  Start over at 1.
			createBooking();
			return;
		}
		
		//4. Assume: There are no specific rooms that should be tied to the booking
		//Will not bother implementing this alternative flow
		
		//5. The actor picks the room type(s) for each room or a package
		int chosenRoomTypes[] = new int[numberOfRooms];
		for(int i = 0; i < numberOfRooms; i++) {
			System.out.print("Select a room type for room #" + new Integer(i+1) + ": ");
			chosenRoomTypes[i] = Integer.parseInt(userInput.nextLine()) - 1;
		}
		
		//6. Assume: The actor did not pick a package
		//TODO: Implement, but probably wont due to lack of time
		
		//7. System stores the number of guests in each room type.
		//TODO: What does this mean? How would you store the number of guest in a room type?
		//The number of guests that are suppose to live in the room with the room type?
		//Won't implement this until we realize we need this
		
		//8. System adds each room type to the booking.
		for(int chosenRoomType : chosenRoomTypes) {
			newBooking.addRoomType(availableRoomTypes.get(chosenRoomType));
		}
		
		//9. Assume: No event booking should be added
		//Ok.
		
		System.out.println(newBooking);
		
		//10. Actor confirms the booking.
		String confirmBookingChoice = "";
		do {
			System.out.print("Do you want to confirm the booking? (y/n): ");
			confirmBookingChoice = userInput.nextLine();
			
		} while(!confirmBookingChoice.equals("y") && !confirmBookingChoice.equals("n"));
		
		if(confirmBookingChoice.equals("n")) {
			return;
		}
		
		//11. System asks for customer email-address.
		System.out.print("Enter your email: ");
		
		//12. Actor provides email-address.
		String customerEmail = userInput.nextLine();
		
		//13. Assume: the customer information is stored in the system
		CustomersMock customers = CustomersMock.getInstance();
		Customer customer = customers.getCustomerByEmail(customerEmail);
		
		if(customer == null) {
			//13a. Customer information is not in the system
			System.out.println("Customer not found. Creating a new customer...");
			//1. System asks for customer information; name, telephone number, billing address and credit card information.
			//2. Actor provides customer information
			int typeOfCustomerChoice = 0;
			do {
				System.out.print("Is the customer a private customer (1) or a company (2)?: ");
				typeOfCustomerChoice = Integer.parseInt(userInput.nextLine());
			} while(typeOfCustomerChoice != 1 && typeOfCustomerChoice != 2);
			
			if(typeOfCustomerChoice == 1) {
				IndividualCustomer individualCustomer = ClassDiagramFactoryImpl.eINSTANCE.createIndividualCustomer();
				
				System.out.print("First name: ");
				String firstName = userInput.nextLine();
				individualCustomer.addFirstName(firstName);
				
				System.out.print("Family name: ");
				String familyName = userInput.nextLine();
				individualCustomer.addFamilyName(familyName);

				individualCustomer.setEmail(customerEmail);
				
				System.out.print("Telephone number: ");
				String telephoneNumber = userInput.nextLine(); //Some phonenumbers are very long (or very strange) so string is more appropiate
				individualCustomer.setPhoneNumber(telephoneNumber);
				
				System.out.print("Billing address: ");
				String billingAddress = userInput.nextLine();
				individualCustomer.setAddress(billingAddress);
				
				System.out.print("Credit-card number: ");
				String creditCardNumber = userInput.nextLine();
				
				System.out.print("CVC: ");
				String cvc = userInput.nextLine();
				
				System.out.print("Expiration-date: ");
				String expirationDate = userInput.nextLine();

				CreditCard creditCard = new CreditCard(creditCardNumber, cvc, expirationDate);
				individualCustomer.addBillingInformation(creditCard);
											
				customer = individualCustomer;
				
			} else {
				Organization organization = ClassDiagramFactoryImpl.eINSTANCE.createOrganization();
				
				System.out.print("Organization name: ");
				String organizationName = userInput.nextLine();

				System.out.print("Address: ");
				String organizationAddress = userInput.nextLine();
				
				System.out.print("Credit-card number: ");
				String creditCardNumber = userInput.nextLine();
				
				System.out.print("CVC: ");
				String cvc = userInput.nextLine();
				
				System.out.print("Expiration-date: ");
				String expirationDate = userInput.nextLine();

				String title = "";
				do {
					System.out.print("Contact persons title (ms/mr/mrs): ");
					title = userInput.nextLine();
				} while(!title.equals("ms") && !title.equals("mr") && !title.equals("mrs"));
				
				System.out.print("Contact persons first name: ");
				String contactPersonFirstName = userInput.nextLine();
				
				System.out.print("Contact persons last name: ");
				String contactPersonLastName = userInput.nextLine();
				
				Person person = ClassDiagramFactoryImpl.eINSTANCE.createPerson();
				person.addFirstName(contactPersonFirstName);
				person.addFamilyName(contactPersonLastName);
				
				//This is good coding
				if(title == "ms") {
					person.setTitle(Title.MS);
				} else if(title == "mr") {
					person.setTitle(Title.MR);
				} else {
					person.setTitle(Title.MRS);
				}
				
				organization.setName(organizationName);
				organization.setAddress(organizationAddress);
				organization.setResponsiblePerson(person);
				organization.setEmail(customerEmail);
				organization.addBillingInformation(new CreditCard(creditCardNumber, cvc, expirationDate));
				
				customer = organization;
			}
			
			//3. System stores customer information
			customers.addCustomer(customer);
		}
		
		//14. System finds and provides all customer information; name, telephone number, billing address and credit card information.
		customer = customers.getCustomerByEmail(customerEmail);
		System.out.println(customer.toString());
		
		//15. Assume: Customer information does not need updating.
		String customerInfoUptodateChoice = "";
		do {
			System.out.print("Is the customer information up-to-date? (y/n): ");
			customerInfoUptodateChoice = userInput.nextLine();
			
		} while(!customerInfoUptodateChoice.equals("y") && !customerInfoUptodateChoice.equals("n"));
		
		if(customerInfoUptodateChoice.equals("n")) {			
			//1. System asks for customer information; name, telephone number, billing address and credit card information.
			//2. Actor provides customer information
			if(customer instanceof IndividualCustomer) {
				IndividualCustomer individualCustomer = (IndividualCustomer)customer;
				
				//Update IndividualCustomer info
				System.out.print("First name: ");
				String firstName = userInput.nextLine();
				individualCustomer.addFirstName(firstName);
				
				System.out.print("Family name: ");
				String familyName = userInput.nextLine();
				individualCustomer.addFamilyName(familyName);
				
				System.out.print("Email: ");
				String email = userInput.nextLine();
				individualCustomer.setEmail(email);
				
				System.out.print("Telephone number: ");
				String telephoneNumber = userInput.nextLine(); //Some phonenumbers are very long (or very strange) so string is more appropiate
				individualCustomer.setPhoneNumber(telephoneNumber);
				
				System.out.print("Billing address: ");
				String billingAddress = userInput.nextLine();
				individualCustomer.setAddress(billingAddress);
				
				System.out.print("Credit-card number: ");
				String creditCardNumber = userInput.nextLine();
				
				System.out.print("CVC: ");
				String cvc = userInput.nextLine();
				
				System.out.print("Expiration-date: ");
				String expirationDate = userInput.nextLine();

				CreditCard creditCard = new CreditCard(creditCardNumber, cvc, expirationDate);
				individualCustomer.addBillingInformation(creditCard);
				
			} else if(customer instanceof Organization) {
				Organization organization = (Organization)customer;
				
				System.out.print("Organization name: ");
				String organizationName = userInput.nextLine();

				System.out.print("Address: ");
				String organizationAddress = userInput.nextLine();
				
				System.out.print("Credit-card number: ");
				String creditCardNumber = userInput.nextLine();
				
				System.out.print("CVC: ");
				String cvc = userInput.nextLine();
				
				System.out.print("Expiration-date: ");
				String expirationDate = userInput.nextLine();
			
				String title = "";
				do {
					System.out.print("Contact persons title (ms/mr/mrs): ");
					title = userInput.nextLine();
				} while(!title.equals("ms") && !title.equals("mr") && !title.equals("mrs"));
				
				System.out.print("Contact persons first name: ");
				String contactPersonFirstName = userInput.nextLine();
				
				System.out.print("Contact persons last name: ");
				String contactPersonLastName = userInput.nextLine();
				
				Person person = ClassDiagramFactoryImpl.eINSTANCE.createPerson();
				person.addFirstName(contactPersonFirstName);
				person.addFamilyName(contactPersonLastName);
				
				//This is good coding
				if(title == "ms") {
					person.setTitle(Title.MS);
				} else if(title == "mr") {
					person.setTitle(Title.MR);
				} else {
					person.setTitle(Title.MRS);
				}
				
				organization.setName(organizationName);
				organization.setAddress(organizationAddress);
				organization.setResponsiblePerson(person);
				organization.addBillingInformation(new CreditCard(creditCardNumber, cvc, expirationDate));
			} else {
				System.out.println("ERROR: Could not determine type of customer (if customer is an IndividualCustomer or an Organization), terminating!");
				return;
			}
			
			//3. System stores customer information
			//Moved to below 16.
		}
		
		//16. Actor confirms the customer information.
		String customerInfoConfirmChoice = "";
		do {
			System.out.print("Confirm customer information up-to-date? (y/n): ");
			customerInfoConfirmChoice = userInput.nextLine();
			
		} while(!customerInfoConfirmChoice.equals("y") && !customerInfoConfirmChoice.equals("n"));
		
		//If customer is unruly...
		if(customerInfoConfirmChoice.equals("n")) {
			return;
		}
		
		customers.addCustomer(customer); //Be vary of duplicate customer here.. I assume identical customer overrides
		
		//17. System asks if the booking should be paid by invoice.
		String invoiceChoice = "";
		do {
			System.out.print("Do you wish to pay with invoice? (y/n): ");
			invoiceChoice = userInput.nextLine();
			
		} while(!invoiceChoice.equals("y") && !invoiceChoice.equals("n"));
		
		//17-18a The booking will be paid by invoice.
		Invoice invoice = null;
		if(invoiceChoice.equals("y")) {
			//1. Assume: customer is a person and not an organisation.
			if(customer instanceof IndividualCustomer) {
				//2. System asks for the social security number of the customer.
				System.out.print("Enter social security number: ");
				//3. Actor provides the social security number.
				String socialSecurityNumber = userInput.nextLine();
				//4. System sends a request to validate the customer credit record.
				invoice = new Invoice(customer);
				if(!invoice.validate()){
					System.out.println("Customer not granted to pay by invoice, terminating...");
					return;
				}
			} else if (customer instanceof Organization) {
				//17-18a.1-3a. The customer is an organisation.
				//1. The system asks for the organisation number.
				System.out.print("Enter organization number: ");
				//2. Actor provides organisation number
				String organizationNumber = userInput.nextLine();
				invoice = new Invoice(customer);
				if(!invoice.validate()){
					System.out.println("Customer not granted to pay by invoice, terminating...");
					return;
				}
			} else {
				System.out.println("Couldn't determine if customer is private customer or organization, terminating");
				return;
			}
		}
		
		//18. Assume: The booking will not be paid pay by invoice.
		//Ok.
		
		//19. System requests credit card validation from bank.
		boolean validCC = false;
		for(BillingInformation bi : customer.getBillingInformation()) {
			if(bi.getClass() == CreditCard.class) {
				validCC = bi.validate();
				break;
			}
		}
		
		//20. Assume: payment is valid.
		if(!validCC) {
			//1. System states that the payment is invalid.
			System.out.println("The payment is invalid");
			//2. Assume: Customer changes payment information.
			String cancelChoice = "";
			do {
				System.out.print("Do you wish to cancel the booking? (y/n): ");
				cancelChoice = userInput.nextLine();
			} while(!cancelChoice.equals("y") && !cancelChoice.equals("n"));
			
			if(cancelChoice.equals("y")) {
				return;
			}
			
			System.out.println("Enter new credit-card information (this replaces your old credit-card information)");
			System.out.print("Credit-card number: ");
			String creditCardNumber = userInput.nextLine();
			
			System.out.print("CVC: ");
			String cvc = userInput.nextLine();
			
			System.out.print("Expiration-date: ");
			String expirationDate = userInput.nextLine();

			CreditCard creditCard = new CreditCard(creditCardNumber, cvc, expirationDate);
			customer.addBillingInformation(creditCard);
			//3. Return to 11.
			//Nope. It does not make sense. Wont adhere to use case. 
		}
		
		//21. System asks if the booking should be paid in advance.
		String payInAdvanceChoice = "";
		do {
			System.out.print("Should the booking be paid in advance? (y/n): ");
			payInAdvanceChoice = userInput.nextLine();
			
		} while(!payInAdvanceChoice.equals("y") && !payInAdvanceChoice.equals("n"));
		
		//23. Assume: Booking is not to be paid in advance
		if(payInAdvanceChoice.equals("y")) {
			Bill bill = ClassDiagramFactoryImpl.eINSTANCE.createBill();
			for(RoomType roomType : newBooking.getRoomType()) {
				bill.addCost(roomType);
			}
			if(invoice != null){
				invoice.getPaymentStrategy().pay(bill);
			} else {
				for(BillingInformation info : customer.getBillingInformation()){
					if(info.getClass() == CreditCard.class){
						info.getPaymentStrategy().pay(bill);
					}
				}
			}
		}
		
		//24. System adds customer to the booking.
		//25. System adds the booking to the system and decreases the number of room types available on the dates between arrival and departure date.
		customer.addRoomBooking(newBooking);
		
		//26. Actor states if a confirmation email should be sent.
		String confirmationEmailChoice = "";
		do {
			System.out.print("Do you want an confirmation email? (y/n): ");
			confirmationEmailChoice = userInput.nextLine();
			
		} while(!confirmationEmailChoice.equals("y") && !confirmationEmailChoice.equals("n"));
		
		if(confirmationEmailChoice.equals("y")) {
			//27. Assume: Confirmation email should be sent
			//28. System generates a PDF containing the booking information and sends it to the customer email address.
			System.out.println("Sent confimation email"); //Lies
		}

		//29. System states that the booking is completed.
		System.out.println("Booking completed!");

		/*****************************************************************************************************/
		/**	THIS IS CODE THAT SZABI WROTE. PARTS OF IT HAS BEEN COPIED. KEPT FOR SAKE OF FUTURE REFERENCING **/
		/*****************************************************************************************************/
/*		System.out.print("Enter the ID of the customer who will be the owner of the booking: ");
		long customerID = userInput.nextLong();
		
		//We search for the customer
		int searchResult = findCustomer(customerID);
		
		//If we don't find the customer, return with an error
		if (searchResult < 0) {
			System.out.println("ERROR! Customer not found!");
			return;
		}
		
		System.out.print("Number of guests: ");
		int numberOfGuests = userInput.nextInt();
		
		//TODO Ask if the user wants to enter room types one by one or select a package
		
		System.out.print("Number of rooms: ");
		int numberOfRooms = userInput.nextInt();
		
		int addedRooms = 0;
		//Add 'numberOfRooms' rooms to the booking
		while (addedRooms < numberOfRooms) {
			listRoomTypes();
			
			System.out.print("Room type #" + (addedRooms+1) + ": ");
			int roomTypeNumber = userInput.nextInt();
			
			//If the room adding failed, don't increase 'addedRooms'!
			boolean success = addARoomTypeToBooking(newBooking, roomTypeNumber);
			if (success)
				++addedRooms;
		}
		
		//TODO The use case says paying for the room happens here. Is there a Bank class which can be used?
		//TODO Ask if the customer wants to pay in advance
		
		Customer customer = customers.get(searchResult);
		//Add the newly created booking to the customer. This means bookings are stored in the customers' data.
		customer.addRoomBooking(newBooking);
		
		System.out.println();
		
		if (customer instanceof IndividualCustomer)
			System.out.println("Booking #" + newBooking.getId() + " created for "
							+ ((IndividualCustomer) customer).getFirstNames().get(0) + " "
							+ ((IndividualCustomer) customer).getFamilyNames().get(0) + ".");
		
		if (customer instanceof Organization)
			System.out.println("Booking #" + newBooking.getId() + " created for "
							+ ((Organization) customer).getName() + ".");
		
		System.out.println(); */
	}

	//This method takes an existing booking, updates it with new data, and puts it back to the customer's bookings
	@SuppressWarnings("deprecation")
	private void modifyBooking() {
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		System.out.println();
		System.out.print("Enter the ID of the customer who is owner of the booking you want to modify: ");
		long customerID = userInput.nextLong();
		
		//We search for the customer
		int searchResult = findCustomer(customerID);
		//If the customer was found, ask which booking should be replaced with a new one
		if (searchResult >= 0) {
			
			System.out.println();
			
			Customer customer = customers.get(searchResult);
			EList<RoomBooking> bookings = customer.getRoomBookings();
			
			if (bookings.size() == 0) {
				System.out.println("This customer does not have any bookings at the moment!");
				return;
			}
			
			listBookings(customer);
			
			//After listing the bookings, we ask which booking should be updated (until a valid input is given)
			int chosenBooking = -1;
			while (chosenBooking < 1 || chosenBooking > bookings.size()) {
				System.out.print("Choose the booking you want to modify: ");
				chosenBooking = userInput.nextInt();
			}
			
			//This is the booking that needs to be modified
			RoomBooking bookingToBeModified = bookings.get(chosenBooking-1);
			
			System.out.print("Year of new start date: ");
			int newStartYear = userInput.nextInt();
			
			System.out.print("Month of new start date: ");
			int newStartMonth = userInput.nextInt();
			
			System.out.print("Day of new start date: ");
			int newStartDay = userInput.nextInt();
			
			Date newStartDate = new Date();
			newStartDate.setYear(newStartYear);
			newStartDate.setMonth(newStartMonth-1);
			newStartDate.setDate(newStartDay);
			newStartDate.setHours(12);
			newStartDate.setMinutes(0);
			newStartDate.setSeconds(0);
			
			bookingToBeModified.setStartDate(newStartDate);
			
			System.out.print("Year of new end date: ");
			int newEndYear = userInput.nextInt();
			
			System.out.print("Month of new end date: ");
			int newEndMonth = userInput.nextInt();
			
			System.out.print("Day of new end date: ");
			int newEndDay = userInput.nextInt();
			
			Date newEndDate = new Date();
			newEndDate.setYear(newEndYear);
			newEndDate.setMonth(newEndMonth-1);
			newEndDate.setDate(newEndDay);
			newEndDate.setHours(10);
			newEndDate.setMinutes(0);
			newEndDate.setSeconds(0);
			
			bookingToBeModified.setEndDate(newEndDate);
			
			//The rest is almost like createBooking()
			
			System.out.print("New number of guests: ");
			int newNumberOfGuests = userInput.nextInt();
			bookingToBeModified.setNumberOfGuests(newNumberOfGuests);
			
			System.out.print("New number of rooms: ");
			int newNumberOfRooms = userInput.nextInt();
			
			int addedRooms = 0;
			while (addedRooms < newNumberOfRooms) {
				listRoomTypes();
				
				System.out.print("Room type #" + (addedRooms+1) + ": ");
				int roomTypeNumber = userInput.nextInt();
				
				boolean success = addARoomTypeToBooking(bookingToBeModified, roomTypeNumber);
				if (success)
					++addedRooms;
			}

			//Put back the booking to where we took it
			bookings.set(chosenBooking-1, bookingToBeModified);
			
			System.out.println();
			System.out.println("Booking #" + bookingToBeModified.getId() + " updated.");
		}
		else
			System.out.println("ERROR! Customer not found!");
		
		System.out.println();
		
	}
	
	//This method takes a customer, and removes one of its bookings
	private void removeBooking() {
		System.out.println();
		System.out.println();
		System.out.print("Enter the ID of the customer who is owner of the booking you want to remove: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		//If we found the customer, print its bookings, then delete one
		if (searchResult >= 0) {
			
			System.out.println();
			
			Customer customer = customers.get(searchResult);
			EList<RoomBooking> bookings = customer.getRoomBookings();
			
			if (bookings.size() == 0) {
				System.out.println("This customer does not have any bookings at the moment!");
				return;
			}
			
			listBookings(customer);
			
			int chosenBooking = -1;
			//We ask the user which booking should be removed (until a valid input is given)
			while (chosenBooking < 1 || chosenBooking > bookings.size()) {
				System.out.print("Choose the booking you want to remove: ");
				chosenBooking = userInput.nextInt();
			}
			
			//We have to subtract 1 from 'chosenBooking' because the list on the screen goes from 1 to size
			//But the 'bookings' list goes from 0 to size-1
			bookings.remove(chosenBooking-1);
			System.out.println("Booking removed.");
		}
		else
			System.out.println("ERROR! Customer not found!");
		
	}
	
	public void start() {
		System.out.println();
		System.out.println("1. List all existing bookings");
		System.out.println("2. List a customer's existing bookings");
		System.out.println("3. Create a new booking");
		System.out.println("4. Modify an existing booking");
		System.out.println("5. Cancel an existing booking");
		System.out.println("6. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		//If the input is invalid, change it to 5, so it will just simply quit
		if (choice < 1 || choice > 5) choice = 5;
		
		switch(choice) {
		case 1:
			listAllBookings();
			break;
		case 2:
			listBookings();
			break;
		case 3:
			createBooking();
			break;
		case 4:
			modifyBooking();
			break;
		case 5:
			removeBooking();
			break;
		}
	}
}