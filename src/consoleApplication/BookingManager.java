package consoleApplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ClassDiagram.Guest;
import ClassDiagram.RoomBooking;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class BookingManager {

	private Scanner userInput;
	private List<RoomBooking> bookings;
	private List<Guest> guests; //TODO maybe not needed?
	private int ID;
	
	public BookingManager(Scanner userInput, List<RoomBooking> bookings, List<Guest> guests) {
		this.userInput = userInput;
		this.bookings = bookings;
		this.guests = guests;
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
		
		System.out.println("No. Id\tStart Date\tEnd date");
		
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

	@SuppressWarnings("deprecation")
	private void createBooking() {
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
		startDate.setMonth(startMonth);
		startDate.setDate(startDay);
		
		newBooking.setStartDate(startDate);
		
		System.out.print("Year of end date: ");
		int endYear = userInput.nextInt();
		
		System.out.print("Month of end date: ");
		int endMonth = userInput.nextInt();
		
		System.out.print("Day of end date: ");
		int endDay = userInput.nextInt();
		
		Date endDate = new Date();
		endDate.setYear(endYear);
		endDate.setMonth(endMonth);
		endDate.setDate(endDay);
		
		newBooking.setEndDate(endDate);
		
		System.out.print("Number of guests: ");
		int numberOfGuests = userInput.nextInt();
		newBooking.setNumberOfGuests(numberOfGuests);
		
		//for (int i = 0; i < numberOfGuests; ++i)
		//	addAGuestToBooking(newBooking);
		
		//TODO add roomTypes
		
		bookings.add(newBooking);
		
		System.out.println();
		System.out.print("Booking #" + newBooking.getId() + " created.");
		System.out.println();
	}

	private void modifyBooking() {
		// TODO Auto-generated method stub
		
	}
	
	private void removeBooking() {
		// TODO Auto-generated method stub
		
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
