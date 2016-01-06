package test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import ClassDiagram.BillingInformation;
import ClassDiagram.GuestStatus;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;
import ClassDiagram.impl.*;
import MockDatabase.RoomTypesMock;
import Payment.CreditCard;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	ClassDiagramFactoryImpl factory;
	RoomBookingImpl roomBook;
	RoomBookingImpl roomBook2;
	RoomImpl room;
	RoomTypeImpl roomType;
	RoomTypeImpl roomType2;
	GuestImpl guest;
	BillImpl bill;
	ItemImpl item;
	Date startDate;
	Date endDate; 
	IndividualCustomerImpl customer;
	IndividualCustomerImpl customer2;
	BillingInformation info;
	BillingInformation info2;
	int[] array = {1};
	
	@Before
	public void setUp() throws Exception {
		
		factory = new ClassDiagramFactoryImpl();
		roomBook = (RoomBookingImpl) factory.createRoomBooking();
		roomBook2 = (RoomBookingImpl) factory.createRoomBooking();
		room = (RoomImpl)factory.createRoom();
		roomType = (RoomTypeImpl) factory.createRoomType();
		roomType2 = (RoomTypeImpl) factory.createRoomType();
		guest = (GuestImpl)factory.createGuest();
		bill = (BillImpl)factory.createBill();
		item = (ItemImpl)factory.createItem();
		customer = (IndividualCustomerImpl)factory.createIndividualCustomer();
		customer2 = (IndividualCustomerImpl)factory.createIndividualCustomer();
		
		info = new CreditCard("1234123412341234", "123", "2016-01-01");
		customer.addBillingInformation(info);
		info2 = new CreditCard("123412341234123", "12", "2016-01-01");
		customer2.addBillingInformation(info2);
		customer.setEmail("varmbrev@hotmail.com");
		
		roomType.setName("Suite");
		roomType.setGuestCapacity(3);
		roomType.setNumberOfBeds(1);
		roomType.setDescription("Beautiful luxurious room");
		roomType.setPrice(5000);
		
		startDate = new Date(2015,12,24);
		endDate = new Date(2016,01,01);
		
		
		item.setPrice(200);
		bill.addCost(item);
		room.setBill(bill);
	}

	@Test
	public void test() {
		
		//Make a booking #1
				
		//Assume customer wants 1 room.
		//Assume customer wants the roomType suite
		//Assume Customer wants 2 person to stay in room
		
		List rooms = RoomTypesMock.getInstance().getAvailableRoomTypes(startDate, endDate, array);
		
		assertTrue(rooms.size()!= 0);
		
		roomBook.setNumberOfGuests(2);
		roomBook.setStartDate(startDate);
		roomBook.setEndDate(endDate);
		roomBook.addRoomType(roomType);
		
		customer.addRoomBooking(roomBook);
		
		Boolean cardValid = customer.getBillingInformation().get(0).validate();
	
		assertTrue(cardValid);
		
		if(!(rooms.size()!= 0) && !cardValid) {
			roomBook.cancel();
		}
		
		//Make a booking #2 (Violates the intended behavior)
		rooms = RoomTypesMock.getInstance().getAvailableRoomTypes(startDate, endDate, array);
		
		assertTrue(rooms.size()!= 0);
		
		roomBook2.setNumberOfGuests(2);
		roomBook2.setStartDate(startDate);
		roomBook2.setEndDate(endDate);
		roomBook2.addRoomType(roomType);
		
		customer2.addRoomBooking(roomBook);
		
		cardValid = customer2.getBillingInformation().get(0).validate();
	
		//This card's validity is deliberately set to be incorrect.
		assertFalse(cardValid);
		
		if(!(rooms.size()!= 0) && !cardValid) {
			roomBook.cancel();
		}
		
		
		//extra tests for the roomBooking class
		Boolean testResult;
		
		//Start date
		roomBook.setStartDate(startDate);
		
		int x = roomBook.getStartDate().compareTo(new Date(2015,12,24));
		testResult = x == 0;
		
		assertTrue(testResult);
		//-----------------
		
		//End date
		roomBook.setEndDate(endDate);
		int y = roomBook.getEndDate().compareTo(new Date(2016,01,01));
		testResult = y == 0;
		
		assertTrue(testResult);
		//-----------------
		
		//getRoom
		roomBook.addRoom(room);
		testResult = roomBook.getRooms().contains(room);
		
		assertTrue(testResult);
		//-----------------
		
		//removeRoom
		try {
			roomBook.removeRoom(room);
		} catch (Exception e) {
			e.printStackTrace();
		}
		testResult = roomBook.getRooms().contains(room);
		
		//This test does deliberately violate the intended behavior
		//Should cause failed test
		assertTrue(!testResult);
				
		
		//RoomType
		roomBook.addRoomType(roomType);
		testResult = roomBook.getRoomType().contains(roomType);
		
		assertTrue(testResult);
		//-----------------
		
		roomBook.addRoomType(roomType2);
		testResult = roomBook.getRoomType().contains(roomType)&&
				roomBook.getRoomType().contains(roomType2);
		
		assertTrue(testResult);
		//-----------------
		
		
		//Check in
		room.setRoomStatus(RoomStatus.AVAILABLE);
		roomBook.addRoom(room);
		roomBook.checkIn(guest, room);
		
		testResult = room.getGuests().contains(guest);
		assertTrue(testResult);
		
		testResult = room.getRoomStatus() == RoomStatus.OCCUPIED;
		assertTrue(testResult);
		
		testResult = guest.getStatus() == GuestStatus.CHECKED_IN;
		assertTrue(testResult);
		
		//Check out
		testResult =  room.checkOut().getBill().getCost().get(0).getPrice() == 200 ;
		assertTrue(testResult);
		
		testResult = true;
		for (Room theRoom: roomBook.getRooms()) {
			if (theRoom.getRoomStatus() != RoomStatus.AVAILABLE) {
				testResult = false;
			}
		}
		assertTrue(testResult);
		
	}

}
