package test;

import static org.junit.Assert.*;
import static ClassDiagram.impl.ClassDiagramFactoryImpl.*;
import static ClassDiagram.GuestStatus.*;
import static ClassDiagram.RoomStatus.*;
import static ClassDiagram.CleaningStatus.*;

import org.junit.Before;
import org.junit.Test;

import ClassDiagram.Bill;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.Customer;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Person;
import ClassDiagram.RoomType;
import ClassDiagram.Title;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckInTest {

	private final static ClassDiagramFactory factory = eINSTANCE;
	
	private Customer customer;
	private RoomType roomType;
	private RoomBooking roomBooking;
	private List<Room> rooms; 
	private List<Guest> guests;
	
	@Before
	public void setUp() throws Exception {
		/*
		 *  Instantiate the global variables
		 */
		customer = factory.createIndividualCustomer();
		roomType = factory.createRoomType();
		roomBooking = factory.createRoomBooking();
		rooms = new ArrayList<>();
		guests = new ArrayList<>();
		
		/*
		 *  Set up default values to the variables
		 */
		setUpCustomer();
		setUpGuests();
		setUpRoomType();
		setUpRooms();
		
		// Assume the booking was already made beforehand
		setUpBooking();
	}
	
	private void setUpCustomer() {
		if (customer instanceof IndividualCustomer) {
			final IndividualCustomer c = (IndividualCustomer) customer;
			c.addFirstName("Nils");
			c.addFirstName("Eric");
			c.addFamilyName("Bjuhr");
			c.setTitle(Title.MR);
			c.setAddress("Adressvägen 666b");
			c.setEmail("email@domain.fu");
			c.setPhoneNumber("0706666666");
		} else if (customer instanceof Organization) {
			final Organization o = (Organization) customer;
			final Person p = factory.createPerson();
			o.setName("Organisation AB");
			o.setAddress("Organisationgatan");
			o.setEmail("no-reply@organisation.com");
			o.setResponsiblePerson(p);
			p.setTitle(Title.DR);
			p.addFamilyName("Evil");
		}
	}
	
	private void setUpGuests() {
		final Guest g = factory.createGuest();
		g.addFamilyName("Bjuhr");
		g.addFirstName("Nils");
		g.addFirstName("Eric");
		g.setTitle(Title.MR);
		g.setStatus(NOT_ARRIVED_YET);
		
		guests.add(g);
	}
	
	private void setUpRooms() {
		for (int i = 0; i < 3; i++) {
			final Room r = factory.createRoom();
			final Bill b = factory.createBill();
			r.setBill(b);
			r.setRoomNumber(i);
			r.setRoomType(roomType);
			r.setCleaningStatus(CLEAN);
			r.setRoomStatus(AVAILABLE);
			
			rooms.add(r);
		}
	}
	
	private void setUpRoomType() {
		roomType.setDescription("All inclusive, full luxury suite");
		roomType.setGuestCapacity(2);
		roomType.setName("Suite");
		roomType.setNumberOfBeds(2);
		roomType.setNumberOfExtraBeds(0);
		roomType.setPrice(Double.MAX_VALUE);
	}
	
	private void setUpBooking() {
		final Date start, end;
		start = Date.from(Instant.EPOCH);
		end = Date.from(Instant.now());
		
		roomBooking.addRoomType(roomType);
		roomBooking.setNumberOfGuests(1);
		roomBooking.setStartDate(start);
		roomBooking.setEndDate(end);
		
		customer.addRoomBooking(roomBooking);
	}

	private boolean checkInSuccessful() {
		final List<Room> checkedInRooms = checkIn(customer, guests, rooms);
		boolean success = true;
		System.out.println();
		System.out.println("## A total of " + checkedInRooms.size() + " rooms are checked in. ##");
		System.out.println();
		
		for (Room r : checkedInRooms) {
			success &= r.getRoomStatus().equals(OCCUPIED);
			success &= r.getCleaningStatus().equals(CLEAN);
			success &= guests.containsAll(r.getGuests());
			System.out.println("Room " + r.getRoomNumber() + ":");
			r.getGuests().forEach((guest) -> System.out.println(formatName(guest) 
											+ " guest status: " + guest.getStatus()));
			System.out.println();
		}
		
		for (Guest g : guests) {
			success &= g.getStatus() == CHECKED_IN;
		}
		
		return success;
	}
	
	@Test
	public void testMainFlow() {
		assertTrue("Post condition valid", checkInSuccessful());
	}
	
	@Test
	public void testUnintendedBehavior1() {
		rooms.forEach((room) -> room.setCleaningStatus(DIRTY));
		assertTrue("Post condition valid", !checkInSuccessful());
	}
	
	public static List<Room> checkIn(final Customer customer,
			final List<Guest> guests, final List<Room> rooms) {
		final List<Room> checkedInRooms = new ArrayList<>();
		customer.getRoomBookings().forEach((booking) -> checkedInRooms.addAll(checkIn(booking, guests, rooms)));
		return checkedInRooms;
	}
	
	public static List<Room> checkIn(final RoomBooking roomBooking, 
			List<Guest> guests, final List<Room> rooms) {
		final List<Room> availableRooms = new ArrayList<>();
		final List<RoomType> roomTypes = new ArrayList<>(roomBooking.getRoomType());
		final List<Room> ret;
		final int n = roomTypes.size();
		
		guests = new ArrayList<>(guests);
		
		System.out.println("Checking in " + guests.size() + " guest(s) to " + n + " room(s).");
		for (Room r : rooms) {
			for (RoomType roomType : roomTypes) {
				if (r.getRoomStatus().equals(AVAILABLE) && r.getRoomType().equals(roomType)) {
					availableRooms.add(r);
					roomTypes.remove(roomType);
					break;
				}
			}
			
			if (availableRooms.size() >= n) {
				break;
			}
		}
		
		ret = new ArrayList<>(availableRooms);
		System.out.println("Found " + availableRooms.size() + " available rooms, and require at least " + n);
		
		
		if (availableRooms.size() == n) {
			System.out.println();
			System.out.println("## Now checking in guests to rooms ##");
			roomBooking.addRoom(availableRooms.get(0));
			while (!guests.isEmpty() && !availableRooms.isEmpty()) {
				System.out.println();
				final Guest g = guests.remove(0);
				
				System.out.println("Checking in guest " + formatName(g) + " to room " + availableRooms.get(0).getRoomNumber());
				roomBooking.checkIn(g, availableRooms.get(0));
				
				System.out.println("Guest status: " + g.getStatus());
				System.out.println("Room status: " + availableRooms.get(0).getRoomStatus());
				System.out.println("Cleaning status: " + availableRooms.get(0).getCleaningStatus());
				if (availableRooms.get(0).getNumberOfGuests() >= availableRooms.get(0).getRoomType().getGuestCapacity()) {
					availableRooms.remove(0);
					roomBooking.addRoom(availableRooms.get(0));
				}
			}
		}
		
		return ret;
	}
	
	private static String formatName(final Person p) {
		final StringBuilder sb = new StringBuilder();
		sb.append(p.getTitle());
		sb.append(" ");
		if (!p.getFirstNames().isEmpty()) {
			sb.append(p.getFirstNames().get(0));
			for (int i = 1; i < p.getFirstNames().size(); i++) {
				sb.append(" ");
				sb.append(p.getFirstNames().get(i));
			}
		
			for (String familyName : p.getFamilyNames()) {
				sb.append(" ");
				sb.append(familyName);
			}
		} else {
			if (!p.getFamilyNames().isEmpty()) {
				sb.append(p.getFamilyNames().get(0));
				for (int i = 1; i < p.getFamilyNames().size(); i++) {
					sb.append(" ");
					sb.append(p.getFamilyNames().get(0));
				}
			}
		}
		
		return sb.toString();
	}
	
}
