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

	private Scanner userInput;
	private List<RoomType> roomTypes;
	private List<Customer> customers;
	private int ID;
	
	public BookingManager(Scanner userInput, List<Customer> customers, List<RoomType> roomTypes) {
		this.userInput = userInput;
		this.customers = customers;
		this.roomTypes = roomTypes;
		ID = 1;
	}
	
	private int findCustomer(long customerID) {
		
		for (int i = 0; i < customers.size(); ++i)
			if (customers.get(i).getID() == customerID)
				return i;
		
		return -1;
	}
	
	private void listBookings() {
		System.out.println();
		System.out.print("Enter the ID of the customer of the bookings: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		
		if (searchResult >= 0) {
			Customer customer = customers.get(searchResult);
			listBookings(customer);
		}
		else {
			System.out.println("ERROR! Customer not found!");
			System.out.println();
		}		
	}
	
	private void listBookings(Customer customer) {

		System.out.println();
		
		if (customer instanceof IndividualCustomer)
			System.out.println("Current bookings of "
							+ ((IndividualCustomer) customer).getFirstNames().get(0) + " "
							+ ((IndividualCustomer) customer).getFamilyNames().get(0) + ":");
		
		if (customer instanceof Organization)
			System.out.println("Current bookings of "
							+ ((Organization) customer).getName() + ":");			
		
		System.out.println("No. Id\tStart Date\t\t\tEnd date");
		
		EList<RoomBooking> bookings = customer.getRoomBookings();
		for (int i = 0; i < bookings.size(); ++i) {
			RoomBooking elem = bookings.get(i);
			System.out.println((i+1) + ". #" + elem.getId()
									 + "\t" + elem.getStartDate().toString()
									 + "\t" + elem.getEndDate().toString());
			//TODO Print out room types too?
		}
		
		System.out.println();
	}

	private void listRoomTypes() {
		System.out.println();
		for (int i = 0; i < roomTypes.size(); ++i)
			System.out.println((i+1) + ". " + roomTypes.get(i).getName());
		System.out.println();
	}
	
	private boolean addARoomTypeToBooking(RoomBooking newBooking, int roomTypeNumber) {
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
		
		int searchResult = findCustomer(customerID);
		
		if (searchResult < 0) {
			System.out.println("ERROR! Customer not found!");
			return;
		}
		
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		RoomBooking newBooking = factory.createRoomBooking();
		
		newBooking.setId(ID);
		++ID;
		
		System.out.print("Year of start date: ");
		int startYear = userInput.nextInt();
		
		System.out.print("Month of start date: ");
		int startMonth = userInput.nextInt();
		
		System.out.print("Day of start date: ");
		int startDay = userInput.nextInt();
		
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
		newBooking.setNumberOfGuests(numberOfGuests);
		
		//TODO Add rooms or choose package?
		
		System.out.print("Number of rooms: ");
		int numberOfRooms = userInput.nextInt();
		
		int addedRooms = 0;
		while (addedRooms < numberOfRooms) {
			listRoomTypes();
			
			System.out.print("Room type #" + (addedRooms+1) + ": ");
			int roomTypeNumber = userInput.nextInt();
			
			boolean success = addARoomTypeToBooking(newBooking, roomTypeNumber);
			if (success)
				++addedRooms;
		}
		
		//TODO is there a Bank class?
		//TODO ask if pay in advance
		
		Customer customer = customers.get(searchResult);
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

	@SuppressWarnings("deprecation")
	private void modifyBooking() {
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		System.out.println();
		System.out.print("Enter the ID of the customer who is owner of the booking you want to modify: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
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
			while (chosenBooking < 1 || chosenBooking > bookings.size()) {
				System.out.print("Choose the booking you want to modify: ");
				chosenBooking = userInput.nextInt();
			}
			
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

			bookings.set(chosenBooking-1, bookingToBeModified);
			
			System.out.println();
			System.out.println("Booking #" + bookingToBeModified.getId() + " updated.");
		}
		else
			System.out.println("ERROR! Customer not found!");
		
		System.out.println();
		
	}
	
	private void removeBooking() {
		System.out.println();
		System.out.println();
		System.out.print("Enter the ID of the customer who is owner of the booking you want to remove: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
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
			while (chosenBooking < 1 || chosenBooking > bookings.size()) {
				System.out.print("Choose the booking you want to remove: ");
				chosenBooking = userInput.nextInt();
			}
			
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
