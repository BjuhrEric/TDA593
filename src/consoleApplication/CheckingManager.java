package consoleApplication;

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
	
	private Scanner userInput;
	private List<Room> rooms;
	private List<Customer> customers;
	
	public CheckingManager(Scanner userInput, List<Room> rooms, List<Customer> customers) {
		this.userInput = userInput;
		this.rooms = rooms;
		this.customers = customers;
	}
	
	private int findCustomer(long customerID) {
		
		for (int i = 0; i < customers.size(); ++i)
			if (customers.get(i).getID() == customerID)
				return i;
		
		return -1;
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
	
	private boolean renderRoomsToBooking(RoomBooking booking) {
		EList<RoomType> roomTypes = booking.getRoomType();
		
		for (int i = 0; i < roomTypes.size(); ++i) {
			int j = 0;
			while (j < rooms.size() && (!rooms.get(j).getRoomType().equals(roomTypes.get(i))
									    || !rooms.get(j).getRoomStatus().equals(RoomStatus.AVAILABLE)
									    || !rooms.get(j).getCleaningStatus().equals(CleaningStatus.CLEAN)))
				++j;
			
			if (j < rooms.size()) {
				booking.addRoom(rooms.get(j));
				rooms.get(j).setRoomStatus(RoomStatus.BOOKED);
			}
			else
				return false;
		}
		return true;
	}
	
	private void listRoomsOfBooking(RoomBooking booking) {
		System.out.println();
		
		int n = 1;
		EList<Room> roomsOfBooking = booking.getRooms();
		for (int i = 0; i < roomsOfBooking.size(); ++i) {
			Room room = roomsOfBooking.get(i);
			if (room.getNumberOfGuests() < room.getRoomType().getGuestCapacity()) {
				System.out.println(n + ". room #" + room.getRoomNumber()
								   + ": " + room.getRoomType().getName());
				++n;
			}
		}
		
		System.out.println();
	}
	
	private boolean addGuestToRoom(RoomBooking booking, Guest guest, int selectedRoom) {
		if (selectedRoom <= 0)
			return false;
		
		int n = 0;
		int i = 0;
		EList<Room> roomsOfBooking = booking.getRooms();
		while (i < roomsOfBooking.size() && n < selectedRoom) {
			Room room = roomsOfBooking.get(i);
			if (room.getNumberOfGuests() < room.getRoomType().getGuestCapacity())
				++n;
			++i;
		}
		
		if (n == selectedRoom) {
			--i;
			roomsOfBooking.get(i).addGuest(guest);
			roomsOfBooking.get(i).setRoomStatus(RoomStatus.OCCUPIED);
		}
		
		return (i < roomsOfBooking.size());
	}
	
	public void startCheckIn() {
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
		
		RoomBooking booking = bookings.get(chosenBooking-1);
		boolean success = renderRoomsToBooking(booking);
		if (!success) {
			System.out.println("ERROR! There are not enough rooms to complete this booking!");
			return;
		}
		
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		
		for (int i = 0; i < booking.getNumberOfGuests(); ++i) {
			Guest guest = factory.createGuest();
			
			System.out.print("First name of guest #" + (i+1) + ": ");
			String firstName = userInput.next();
			guest.addFirstName(firstName);
			
			System.out.print("Family name of guest #" + (i+1) + ": ");
			String familyName = userInput.next();
			guest.addFamilyName(familyName);
			
			guest.setStatus(GuestStatus.CHECKED_IN);
			
			//TODO guest.setTitle(value);
			
			success = false;
			while (!success) {
				listRoomsOfBooking(booking);
				
				System.out.print("Select which room this guest should stay in: ");
				int selectedRoom = userInput.nextInt();
			
				success = addGuestToRoom(booking, guest, selectedRoom);			
			}
		}
	}
	
	public void startCheckOut() {
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
		
		RoomBooking booking = bookings.get(chosenBooking-1);
		EList<Room> roomsOfBooking = booking.getRooms();
		for (int i = 0; i < roomsOfBooking.size(); ++i) {
			Room room = roomsOfBooking.get(i);
			Payment payment = room.checkOut();
			payment.performPayment(customer.getBillingInformation().get(0));			
		}
		
	}
}