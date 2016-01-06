package test;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ClassDiagram.Bill;
import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.CleaningStatus;
import ClassDiagram.Customer;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Organization;
import ClassDiagram.Payment;
import ClassDiagram.Person;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;
import ClassDiagram.Title;
import MockDatabase.CustomersMock;
import MockDatabase.RoomsMock;
import Payment.CreditCard;
import Payment.Invoice;

import static ClassDiagram.ClassDiagramFactory.eINSTANCE;
import static ClassDiagram.CleaningStatus.DIRTY;

public class CheckOutTest {
	private final static ClassDiagramFactory factory = eINSTANCE;
	private Customer customer;
	private List<Room> rooms;
	private List<Guest> guests;
	private Payment payment;
	private RoomBooking roomBooking;
	private RoomType roomType;
	private CustomersMock cdb = CustomersMock.getInstance();
	private RoomsMock rdb = RoomsMock.getInstance();
	private final int NBRROOMS = 2;
	
	@Before
	public void setUp() throws Exception {
		// Instantiate global variables
		customer = factory.createIndividualCustomer();
		roomBooking = factory.createRoomBooking();
		roomType = factory.createRoomType();
		rooms = new ArrayList<>();
		guests = new ArrayList<>();
		
		//Set up the testing environment
		setUpGuests();
		setUpRoomBooking();
		setUpRoomType();
		setUpRooms();
		setUpCustomer();
		for(Room r: rooms){
			for(Guest g: guests){
				roomBooking.checkIn(g, r);
			}
		}
	}
	
	private void setUpGuests(){
		final Guest g1 = factory.createGuest();
		final Guest g2 = factory.createGuest(); 
		g1.addFamilyName("Edelman");
		g1.addFirstName("Julian");
		g1.setTitle(Title.DR);
		g2.addFamilyName("Brady");
		g2.addFirstName("Tom");
		g2.setTitle(Title.DR);
		guests.add(g1);
		guests.add(g2);
	}
	
	private void setUpCustomer(){
		if(customer instanceof IndividualCustomer){
			final IndividualCustomer c = (IndividualCustomer) customer;
			final BillingInformation bi = new CreditCard("0123456789121212", "121", "12/12");
			c.addFirstName("Tom");
			c.addFamilyName("Brady");
			c.setAddress("Bradygatan 12");
			c.setEmail("Tom.Brady@Patriots.com");
			c.setPhoneNumber("0123456789");
			c.setTitle(Title.DR);
			c.addBillingInformation(bi);
			c.addRoomBooking(roomBooking);
			c.setID(10);
		}else{
			final Organization c = (Organization) customer;
			final Person p = factory.createPerson();
			final BillingInformation bi = new Invoice(c);
			p.addFamilyName("Godell");
			p.addFirstName("Rodger");
			p.setTitle(Title.SIR);
			c.setAddress("NFL Headquarters");
			c.setEmail("Deflategate@NFL.com");
			c.setName("NFL");
			c.setResponsiblePerson(p);
			c.setID(10);
			c.addBillingInformation(bi);
		}
	}
	
	private void setUpRoomType(){
		roomType.setDescription("Super Bowl Suite");
		roomType.setGuestCapacity(10);
		roomType.setName("Super Bowl");
		roomType.setNumberOfBeds(2);
		roomType.setNumberOfExtraBeds(1);
		roomType.setPrice(121212);
	}
	
	private void setUpRoomBooking(){
		roomBooking.setNumberOfGuests(guests.size());
		roomBooking.setStartDate(Date.from(Instant.EPOCH));
		roomBooking.setEndDate(Date.from(Instant.now()));
		roomBooking.addRoomType(roomType);
	}
	
	private void setUpRooms(){
		final Bill b = factory.createBill();
		for(int i = 0; i < NBRROOMS; i++){
			final Room room = factory.createRoom();
			room.setRoomType(roomType);
			room.setBill(b);
			room.setRoomStatus(RoomStatus.OCCUPIED);
			room.setCleaningStatus(CleaningStatus.CLEAN);
			room.setRoomNumber(i);
			for(Guest g: guests){
				room.addGuest(g);
			}
			rooms.add(room);
			roomBooking.addRoom(room);
		}
	}
	
	// Tests the checkOut procedure and returns true if successful, false otherwise
	private Boolean checkOutSuccessful(){
		boolean success = true;
		final Customer thisCustomer = cdb.getCustomer(customer.getEmail());
		final CreditCard customerCC = (CreditCard)thisCustomer.getBillingInformation().get(0);
		final List<Payment> payments = thisCustomer.getRoomBookings().get(0).checkOut();
		final Bill customerBill = payments.get(0).getBill();
		final List<Room> customerRooms = thisCustomer.getRoomBookings().get(0).getRooms();
		List<Guest> customerGuests = customerRooms.get(0).getGuests();
		
		success &= 
		thisCustomer != null && // Check that a customer with that email exists
		customerRooms.size() == NBRROOMS && // Checks that there are correct nbr of rooms
		customerCC.validate() && // Check that the credit card is valid
		customerBill != null; // Check that there exists a bill
		for(Room r: customerRooms){
			customerGuests = r.getGuests();
			success &= 
			customerGuests.size() == 0 && // Check that there are no guests attached to the room ater checkout
			r.getCleaningStatus().equals(CleaningStatus.CHECKED_OUT) && // Check that the cleaning status is correct
			r.getRoomStatus().equals(RoomStatus.AVAILABLE); // Check that the room status is correct
		}
		
		// Perform the payment. This cannot be tested in our system
		payments.get(0).performPayment(customerCC);
		
		for(Guest g: guests){
			// Check that all the guests are marked as checked out after checkout
			success &= g.getStatus().equals(GuestStatus.CHECKED_OUT);
		}
		
		return success;
	}
	@Test
	public void testMainFlow(){
		assertTrue(checkOutSuccessful());
	}
	@Test
	public void testUnintendedBehaviour(){
		// Tests that an invalid creditCard fails the check-out procedure
		customer.addBillingInformation(new CreditCard("123123123", "2323", "323"));
		assertFalse(checkOutSuccessful());
	}
	

}
