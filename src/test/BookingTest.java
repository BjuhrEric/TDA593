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

		// Create the instance of RoomBooking
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		RoomBookingImpl roomBook = (RoomBookingImpl) factory.createRoomBooking();
		
		// Test Start date
		 
		Date startDate = new Date(2015,12,24);
		roomBook.setStartDate(startDate);
		int x = roomBook.getStartDate().compareTo(new Date(2015,12,24));
		 
		assertTrue(x == 0);
		
		// Test End date
		Date endDate = new Date(2016,01,01);
		roomBook.setEndDate(endDate);
		
		int y = roomBook.getEndDate().compareTo(new Date(2016,01,01));
		 
		assertTrue(y == 0);
	}

}
