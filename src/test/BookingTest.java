package test;

import static org.junit.Assert.*;

import java.util.Date;

import ClassDiagram.impl.*;


import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void test() {

		// setup
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		RoomBookingImpl roomBook = (RoomBookingImpl) factory.createRoomBooking();
		RoomImpl room = (RoomImpl)factory.createRoom();
		RoomTypeImpl roomType = (RoomTypeImpl) factory.createRoomType();
		RoomTypeImpl roomType2 = (RoomTypeImpl) factory.createRoomType();
		
		// Test Start date
		Date startDate = new Date(2015,12,24);
		roomBook.setStartDate(startDate);
		Boolean testResult;
		int x = roomBook.getStartDate().compareTo(new Date(2015,12,24));
		testResult = x == 0;
		
		assertTrue(testResult);
		//-----------------
		
		// Test End date
		Date endDate = new Date(2016,01,01);
		roomBook.setEndDate(endDate);
		int y = roomBook.getEndDate().compareTo(new Date(2016,01,01));
		testResult = y == 0;
		
		assertTrue(testResult);
		//-----------------
		
		//Test getRoom
		roomBook.addRoom(room);
		testResult = roomBook.getRooms().contains(room);
		
		assertTrue(testResult);
		//-----------------
		
		//TEST RoomType
		roomBook.addRoomType(roomType);
		testResult = roomBook.getRoomType().contains(roomType);
		
		assertTrue(testResult);
		//-----------------
		
		roomBook.addRoomType(roomType2);
		testResult = roomBook.getRoomType().contains(roomType)&&
				roomBook.getRoomType().contains(roomType2);
		
		assertTrue(testResult);
		//-----------------
		
		
	}

}
