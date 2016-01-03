package consoleApplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import ClassDiagram.Customer;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

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

		System.out.println();
		
		//Since an individual customer's name and a company's name is stored in a different name
		//we have to print it in two different ways
		if (customer instanceof IndividualCustomer)
			System.out.println("Current bookings of "
							+ ((IndividualCustomer) customer).getFirstNames().get(0) + " "
							+ ((IndividualCustomer) customer).getFamilyNames().get(0) + ":");
		
		if (customer instanceof Organization)
			System.out.println("Current bookings of "
							+ ((Organization) customer).getName() + ":");			
		
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
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		System.out.print("Enter the ID of the customer who will be the owner of the booking: ");
		long customerID = userInput.nextLong();
		
		//We search for the customer
		int searchResult = findCustomer(customerID);
		
		//If we don't find the customer, return with an error
		if (searchResult < 0) {
			System.out.println("ERROR! Customer not found!");
			return;
		}
		
		RoomBooking newBooking = ClassDiagramFactoryImpl.eINSTANCE.createRoomBooking();
		
		newBooking.setId(ID);
		++ID;
		
		System.out.print("Year of start date: ");
		int startYear = userInput.nextInt();
		
		System.out.print("Month of start date: ");
		int startMonth = userInput.nextInt();
		
		System.out.print("Day of start date: ");
		int startDay = userInput.nextInt();
		
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
		int endYear = userInput.nextInt();
		
		System.out.print("Month of end date: ");
		int endMonth = userInput.nextInt();
		
		System.out.print("Day of end date: ");
		int endDay = userInput.nextInt();
		
		Date endDate = new Date();
		endDate.setYear(endYear);
		endDate.setMonth(endMonth-1);
		endDate.setDate(endDay);
		endDate.setHours(10);
		endDate.setMinutes(0);
		endDate.setSeconds(0);
		
		newBooking.setEndDate(endDate);
		
		System.out.print("Number of guests: ");
		int numberOfGuests = userInput.nextInt();
		//Not sure if this is needed, or numberOfGuests is calculated inside the 'Booking' class
		newBooking.setNumberOfGuests(numberOfGuests);
		
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
		
		System.out.println();
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
		System.out.println("1. List existing bookings");
		System.out.println("2. Create a new booking");
		System.out.println("3. Modify an existing booking");
		System.out.println("4. Cancel an existing booking");
		System.out.println("5. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		//If the input is invalid, change it to 5, so it will just simply quit
		if (choice < 1 || choice > 5) choice = 5;
		
		switch(choice) {
		case 1:
			listBookings();
			break;
		case 2:
			createBooking();
			break;
		case 3:
			modifyBooking();
			break;
		case 4:
			removeBooking();
			break;
		}
	}
}