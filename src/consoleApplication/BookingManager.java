package consoleApplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class BookingManager {

	private Scanner userInput;
	private List<RoomBooking> bookings;
	private List<RoomType> roomTypes;
	private int ID;
	
	public BookingManager(Scanner userInput, List<RoomBooking> bookings, List<RoomType> roomTypes) {
		this.userInput = userInput;
		this.bookings = bookings;
		this.roomTypes = roomTypes;
		ID = 1;
	}
	
	private int findBooking(long bookingId) {
		
		for (int i = 0; i < bookings.size(); ++i)
			if (bookings.get(i).getId() == bookingId)
				return i;
		
		return -1;
	}
	
	private void listBookings() {
		System.out.println();
		System.out.println("Current bookings in the system:");
		System.out.println();
		
		System.out.println("No. Id\tStart Date\t\t\tEnd date");
		
		for (int i = 0; i < bookings.size(); ++i) {
			RoomBooking elem = bookings.get(i);
			System.out.println((i+1) + ". " + elem.getId()
									 + "\t" + elem.getStartDate().toString()
									 + "\t" + elem.getEndDate().toString());
			//TODO Print out room types too?
		}
		
		System.out.println();
		
	}
	
	//private int findGuest(String firstName, String familyName) {
	//	
	//	for (int i = 0; i < guests.size(); ++i)
	//		if (guests.get(i).getFirstNames().contains(firstName)
	//			&& guests.get(i).getFamilyNames().contains(familyName))
	//			return i;
	//	
	//	return -1;
	//}
	
	//requires !Guests.isEmpty()
	//private void addAGuestToBooking(RoomBooking newBooking) {
	//	
	//	int searchResult = -1;
	//	do {
	//		System.out.print("First name of the guest: ");
	//		String firstName = userInput.next();
	//
	//		System.out.print("Family name of the guest: ");
	//		String familyName = userInput.next();
	//		
	//		searchResult = findGuest(firstName, familyName);
	//		if (searchResult != -1) {
	//			System.out.println("TODO: addGuest is missing?");
	//			//newBooking.addGuest(guests.get(searchResult));
	//		}
	//		else
	//			System.out.println("ERROR! Guest '" + firstName + " " + familyName + "'not found!");
	//		
	//	} while (searchResult == -1);
	//	
	//}

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
		
		//for (int i = 0; i < numberOfGuests; ++i)
		//	addAGuestToBooking(newBooking);
		
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
		
		//TODO Ask for e-mail address? Search for guest in the guest list using e-mail address?
		//TODO If guest is not in the system, call GuestManager.addGuest()
		//TODO why would I ask "pay by invoice" if payment method is already stored in the guest's data??
		//TODO is there a Bank class?
		//TODO ask if pay in advance
		//TODO can't add customer to Booking! Booking class has no "customer" attribute!
		
		
		bookings.add(newBooking);
		
		System.out.println();
		System.out.print("Booking #" + newBooking.getId() + " created.");
		System.out.println();
	}

	@SuppressWarnings("deprecation")
	private void modifyBooking() {
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		System.out.println();
		System.out.print("Enter the ID of the booking you want to modify: ");
		long bookingID = userInput.nextLong();
		
		int searchResult = findBooking(bookingID);
		if (searchResult >= 0) {
			
			System.out.println();
			
			ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
			RoomBooking newBooking = factory.createRoomBooking();
			
			newBooking.setId(bookingID);
			
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
			
			newBooking.setStartDate(newStartDate);
			
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
			
			newBooking.setEndDate(newEndDate);
			
			System.out.print("New number of guests: ");
			int newNumberOfGuests = userInput.nextInt();
			newBooking.setNumberOfGuests(newNumberOfGuests);
			
			//for (int i = 0; i < numberOfGuests; ++i)
			//	addAGuestToBooking(newBooking);
			
			System.out.print("New number of rooms: ");
			int newNumberOfRooms = userInput.nextInt();
			
			int addedRooms = 0;
			while (addedRooms < newNumberOfRooms) {
				listRoomTypes();
				
				System.out.print("Room type #" + (addedRooms+1) + ": ");
				int roomTypeNumber = userInput.nextInt();
				
				boolean success = addARoomTypeToBooking(newBooking, roomTypeNumber);
				if (success)
					++addedRooms;
			}

			bookings.set(searchResult, newBooking);
			
			System.out.println();
			System.out.println("Booking #" + bookingID + " updated.");
		}
		else
			System.out.println("ERROR! Booking not found!");
		
		System.out.println();
		
	}
	
	private void removeBooking() {
		System.out.println();
		System.out.print("Enter the ID of the booking you want to remove: ");
		long bookingID = userInput.nextLong();
		
		int searchResult = findBooking(bookingID);
		
		if (searchResult >= 0) {
			bookings.remove(searchResult);
			System.out.println("Booking #" + bookingID + " removed.");
		}
		else
			System.out.println("ERROR! No booking found with ID #" + bookingID + "!");
		
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
