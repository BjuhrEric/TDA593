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
	private final int NBRROOMS = 1;
	
	@Before
	public void setUp() throws Exception {
		customer = factory.createIndividualCustomer();
		roomBooking = factory.createRoomBooking();
		roomType = factory.createRoomType();
		rooms = new ArrayList<>();
		guests = new ArrayList<>();
		setUpGuests();
		setUpRoomBooking();
		setUpRoomType();
		setUpRooms();
		setUpCustomer();
		for(Guest g: guests){
			roomBooking.checkIn(g, rooms.get(0));
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
			System.out.println(roomBooking.getRooms().get(0).getNumberOfGuests());
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
			room.setRoomStatus(RoomStatus.AVAILABLE);
			room.setCleaningStatus(CleaningStatus.CLEAN);
			room.setRoomNumber(1);
			for(Guest g: guests){
				room.addGuest(g);
			}
			rooms.add(room);
			roomBooking.addRoom(room);
		}
	}

	@Test
	public void testMainFlow(){
		final Customer thisCustomer = cdb.getCustomer(customer.getEmail());
		
		// Check that there exists a customer with the given email
		assertTrue(thisCustomer != null);
		
		final List<Room> customerRooms = thisCustomer.getRoomBookings().get(0).getRooms();
		List<Guest> customerGuests = customerRooms.get(0).getGuests();
		
		// Check that all guests are checked in before checking them out
		for(int i = 0; i < customerRooms.size(); i++){
			for(Guest g: customerRooms.get(i).getGuests()){
				assertTrue(g.getStatus().equals(GuestStatus.CHECKED_IN));
			}
		}
		
		// Check that there are correct number of rooms in the customer's name"
		assertTrue(customerRooms.size() == NBRROOMS);
		
		//Check that the customer's credit card is valid
		final CreditCard customerCC = (CreditCard)thisCustomer.getBillingInformation().get(0);
		assertTrue(customerCC.validate());
		
		//Check that there exists a room bill that can be payed
		final List<Payment> payments = thisCustomer.getRoomBookings().get(0).checkOut();
		final Bill customerBill = payments.get(0).getBill();
		assertTrue(customerBill != null);
		
		//Performing the payment. This is not testable in our system
		payments.get(0).performPayment(customerCC);
		
		// Check that there are no guests in the rooms after checkout
		// and also that all rooms are marked with the cleaning status checked out
		// and that the rooms are marked as available again
		for(int i = 0; i < customerRooms.size(); i++){
			customerGuests = customerRooms.get(i).getGuests();
			assertTrue(customerGuests.size() == 0);
			assertTrue(customerRooms.get(i).getCleaningStatus().equals(CleaningStatus.CHECKED_OUT));
			assertTrue(customerRooms.get(i).getRoomStatus().equals(RoomStatus.AVAILABLE));
		}
	}
	@Test
	public void testSomethingWroing(){
		//Check that if the email is entered incorrectly, it does not return a customer
		Customer thisCustomer = cdb.getCustomer("This is not an email");
		assertTrue(thisCustomer == null);
		
		//Checking that a room is correctly removed from a room booking
		try{
			customer.getRoomBookings().get(0).removeRoom(rooms.get(0));
		}catch(Exception e){
			
		};
		thisCustomer = cdb.getCustomer(customer.getEmail());
		assertTrue(thisCustomer.getRoomBookings().get(0).getRooms().size() == 0);
		
		//Check that an invalid credit card does not pass the validation
		CreditCard customerCC = new CreditCard("Not 16 chars", "333", "12/12");
		assertFalse(customerCC.validate());
	}
	

}
