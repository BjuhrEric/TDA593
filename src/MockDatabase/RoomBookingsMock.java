package MockDatabase;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import ClassDiagram.Customer;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.RoomBookings;

public class RoomBookingsMock implements RoomBookings{
	
	private HashMap<Long, RoomBooking> bookings;
	private static RoomBookingsMock instance = null;
	
	private RoomBookingsMock(){
		bookings = new HashMap<Long, RoomBooking>();
		RoomTypesMock roomType = RoomTypesMock.getInstance();
		CustomersMock customers = CustomersMock.getInstance();
		//TODO: add bookings
		RoomBooking rb1 = ClassDiagramFactoryImpl.eINSTANCE.createRoomBooking();
		rb1.addRoomType(roomType.getRoomTypes().get(0));
		rb1.setStartDate(new Date(2016,1,20));
		rb1.setEndDate(new Date(2016, 1, 25));
		rb1.setId(UUID.randomUUID().getLeastSignificantBits());
		Customer c1 = customers.getCustomer("elvirajonsson123@hotmail.com");
		c1.addRoomBooking(rb1);
		
		
		
	}
	
	public static RoomBookingsMock getInstance(){
		if(instance == null){
			instance = new RoomBookingsMock();
		}
		return instance;
	}

	@Override
	public boolean addRoomBooking(RoomBooking roomBooking) {
		RoomBooking result = bookings.put(roomBooking.getId(), roomBooking);
		return result == null || result.equals(roomBooking);
	}

	@Override
	public boolean deleteRoomBooking(UUID id) {
		RoomBooking result = bookings.remove(id.getLeastSignificantBits());
		return result != null;
	}

	@Override
	public boolean updateRoomBooking(RoomBooking roomBooking) {
		RoomBooking result = bookings.put(roomBooking.getId(), roomBooking);
		return result.equals(roomBooking);
	}

	@Override
	public RoomBooking getRoomBooking(UUID id) {
		return bookings.get(id.getLeastSignificantBits());
	}

	@Override
	public List<RoomBooking> getRoomBookings(UUID customerId, Date date, RoomType roomType) {
		// TODO Auto-generated method stub
		return null;
	}

}
