package test;

import static org.junit.Assert.*;

import java.util.Date;

import ClassDiagram.GuestStatus;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;
import ClassDiagram.impl.*;


import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void test() {

		//Setup
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		RoomBookingImpl roomBook = (RoomBookingImpl) factory.createRoomBooking();
		RoomImpl room = (RoomImpl)factory.createRoom();
		RoomTypeImpl roomType = (RoomTypeImpl) factory.createRoomType();
		RoomTypeImpl roomType2 = (RoomTypeImpl) factory.createRoomType();
		GuestImpl guest = (GuestImpl)factory.createGuest();
		BillImpl bill = (BillImpl)factory.createBill();
		ItemImpl item = (ItemImpl)factory.createItem();
		item.setPrice(200);
		bill.addCost(item);
		room.setBill(bill);
				
		
		//Start date
		Date startDate = new Date(2015,12,24);
		roomBook.setStartDate(startDate);
		Boolean testResult;
		int x = roomBook.getStartDate().compareTo(new Date(2015,12,24));
		testResult = x == 0;
		
		assertTrue(testResult);
		//-----------------
		
		//End date
		Date endDate = new Date(2016,01,01);
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
