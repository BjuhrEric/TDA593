package consoleApplication;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import ClassDiagram.CleaningStatus;
import ClassDiagram.Customer;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Payment;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class CheckingManager {
	
	//Local variables instead of database
	Scanner userInput;
	List<Room> rooms;
	List<Customer> customers;
	
	public CheckingManager(Scanner userInput, List<Room> rooms, List<Customer> customers) {
		this.userInput = userInput;
		this.rooms = rooms;
		this.customers = customers;
	}
	
	//Returns the index of the customer with the ID 'customerID'
	//Returns -1 if no customer found with ID 'customerID'
	private int findCustomer(long customerID) {
		
		for (int i = 0; i < customers.size(); ++i)
			if (customers.get(i).getID() == customerID)
				return i;
		
		return -1;
	}
	private int findCustomerByEmail(String email) {
		for (int i = 0; i < customers.size(); ++i) {
			if(customers.get(i).getEmail() == email) {
				return i;
			}
		}
			
		return -1;
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
	 * This method adds an (available) room to the booking for each room type of the booking
	 * @param booking the rooms will be added to this booking
	 * @return true, if the rendering was successful, false if there were not enough rooms
	 */
	private boolean renderRoomsToBooking(RoomBooking booking) {
		//TODO is this method buggy? If I enter an invalid input, it goes nuts
		EList<RoomType> roomTypes = booking.getRoomType();
		
		//Go through 'roomTypes' list
		for (int i = 0; i < roomTypes.size(); ++i) {
			int j = 0;
			
			//Searching for a room which
			//1. its room type equals to the current roomType I'm dealing with
			//2. it is available
			//3. it is clean
			//We increase 'j' until we find a room with these criterias in the 'rooms' List
			while (j < rooms.size() && (!rooms.get(j).getRoomType().equals(roomTypes.get(i))
									    || !rooms.get(j).getRoomStatus().equals(RoomStatus.AVAILABLE)
									    || !rooms.get(j).getCleaningStatus().equals(CleaningStatus.CLEAN)))
				++j;
			
			//If the searching was successful
			if (j < rooms.size()) {
				booking.addRoom(rooms.get(j));
				rooms.get(j).setRoomStatus(RoomStatus.BOOKED);
			}
			//If the searching was not successful
			else
				return false;
		}
		
		return true;
	}
	
	/**
	 * Lists the (non-full) rooms that are added to the booking
	 * @param booking the booking whose rooms are need to be listed
	 */
	private void listRoomsOfBooking(RoomBooking booking) {
		System.out.println();
		
		int n = 1;
		EList<Room> roomsOfBooking = booking.getRooms();
		
		for (int i = 0; i < roomsOfBooking.size(); ++i) {
			Room room = roomsOfBooking.get(i);
			//We only list rooms which are not full
			if (room.getNumberOfGuests() < room.getRoomType().getGuestCapacity()) {
				System.out.println(n + ". room #" + room.getRoomNumber()
								   + ": " + room.getRoomType().getName());
				++n;
			}
		}
		
		System.out.println();
	}
	
	/**
	 * Adds a guest to a room
	 * @param booking the booking which has the rooms
	 * @param guest the guest which should be added to the room
	 * @param selectedRoom the number in the list of the room that the guest should be added to
	 * @return true, if the adding was successful, false otherwise
	 */
	private boolean addGuestToRoom(RoomBooking booking, Guest guest, int selectedRoom) {
		if (selectedRoom <= 0)
			return false;
		
		int n = 0;
		int i = 0;
		EList<Room> roomsOfBooking = booking.getRooms();
		
		//We're going through the rooms of the booking with 'i'
		//and searching for the 'selectedRoom'-th room with 'n' which is non-full
		while (i < roomsOfBooking.size() && n < selectedRoom) {
			Room room = roomsOfBooking.get(i);
			//If we find a room which is not full, increase n
			if (room.getNumberOfGuests() < room.getRoomType().getGuestCapacity())
				++n;
			++i;
		}
		
		//If we found the 'selectedRoom'-th (non-full) room, add the guest to that room
		if (n == selectedRoom) {
			--i; //The while loop does an unnecessary increase at the end, we need to corrigate that
			roomsOfBooking.get(i).addGuest(guest);
			roomsOfBooking.get(i).setRoomStatus(RoomStatus.OCCUPIED);
		}
		
		//If the searching failed (i >= size) return false
		return (i < roomsOfBooking.size());
	}
	
	//TODO Lack of checks! For example, I can check in already checked in bookings!
	public void startCheckIn() {
		
	// START: ASK FOR CUSTOMER ID AND BOOKING ID
		String customerEmail = ""; 
		try{
		System.out.print("Enter the E-mail of the customer who is the owner of the booking: ");
		customerEmail = userInput.next();
		}catch(InputMismatchException e){
			System.out.println("Must enter a valid E-mail");
			userInput.nextLine();
			return;
		}
		
		int searchResult = findCustomerByEmail(customerEmail);
		
		if (searchResult < 0) {
			System.out.println("ERROR! Customer not found!");
			return;
		}
		
		Customer customer = customers.get(searchResult);
		EList<RoomBooking> bookings = customer.getRoomBookings();
		
		if (bookings.size() == 0) {
			System.out.println("This customer does not have any bookings!");
			return;
		}
		
		listBookings(customer);
		
		int chosenBooking = -1;
		while (chosenBooking < 1 || chosenBooking > bookings.size()) {
			System.out.print("Choose the current booking: ");
			chosenBooking = userInput.nextInt();
		}
	
	// END: ASK FOR CUSTOMER ID AND BOOKING ID
		
		RoomBooking booking = bookings.get(chosenBooking-1);
		boolean success = renderRoomsToBooking(booking);
		if (!success) {
			System.out.println("ERROR! There are not enough rooms to complete this booking!");
			return;
		}
		
		//Add each guest to one of the rooms
		for (int i = 0; i < booking.getNumberOfGuests(); ++i) {
			Guest guest = ClassDiagramFactoryImpl.eINSTANCE.createGuest();
			
			System.out.print("First name of guest #" + (i+1) + ": ");
			String firstName = userInput.next();
			guest.addFirstName(firstName);
			
			System.out.print("Family name of guest #" + (i+1) + ": ");
			String familyName = userInput.next();
			guest.addFamilyName(familyName);
			
			guest.setStatus(GuestStatus.CHECKED_IN);
			
			//Possible ToDo: Ask for title of the guest
			
			success = false;
			while (!success) {
				listRoomsOfBooking(booking);
				
				System.out.print("Select which room this guest should stay in: ");
				int selectedRoom = userInput.nextInt();
			
				success = addGuestToRoom(booking, guest, selectedRoom);			
			}
		}
	}
	
	//TODO Lack of checks! For example, I can check out a booking which was not even checked in!
	public void startCheckOut() {
	// START: ASK FOR CUSTOMER ID AND BOOKING ID
		System.out.print("Enter the ID of the customer who is the owner of the booking: ");
		long customerID = userInput.nextLong();
		
		int searchResult = findCustomer(customerID);
		
		if (searchResult < 0) {
			System.out.println("ERROR! Customer not found!");
			return;
		}
		
		Customer customer = customers.get(searchResult);
		EList<RoomBooking> bookings = customer.getRoomBookings();
		
		if (bookings.size() == 0) {
			System.out.println("This customer does not have any bookings!");
			return;
		}
		
		listBookings(customer);
		
		int chosenBooking = -1;
		while (chosenBooking < 1 || chosenBooking > bookings.size()) {
			System.out.print("Choose the current booking: ");
			chosenBooking = userInput.nextInt();
		}
		
	// END: ASK FOR CUSTOMER ID AND BOOKING ID
		
		//There is no need to select payment method, since the it's already stored in 'customer'
		
		RoomBooking booking = bookings.get(chosenBooking-1);
		EList<Room> roomsOfBooking = booking.getRooms();
		
			//TODO Split bills and join bills options. A possible implementation:
			//Collect the bills of the rooms into a List
			//Print out the list
			//Print out a menu:
				//1. Split a bill
					//Ask which bill?	
					//List the items on the selected bill (which are not on listOfSelectedItems)
					//While (selectedItem != 0)
						//Ask for selectedItem
						//Add selectedItem to listOfSelectedItems
					//bill.split(listOfSelectedItems)
					//Add the result of the split to the list of bills
			//2. join
				//Print out the list
				//Ask for bill1
				//Ask for bill2
				//bill1.join(bill2)
			//3. pay them all
				//Go through every bill in the list, and ask "will the customer pay it or someone else?"
				//If someone else, ask for name, payment type, invoice number or credit card number
		
		//Go through each room, check out all the guests, and pay all the bills with the customer's information
		//TODO should be replaced with the method sketched above
		for (int i = 0; i < roomsOfBooking.size(); ++i) {
			Room room = roomsOfBooking.get(i);
			Payment payment = room.checkOut();
			payment.performPayment(customer.getBillingInformation().get(0));
		}
	}
}