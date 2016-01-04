package MockDatabase;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import DatabaseInterfaces.RoomBookings;

public class RoomBookingsMock implements RoomBookings{
	
	

	@Override
	public boolean addRoomBooking(RoomBooking roomBooking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRoomBooking(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRoomBooking(RoomBooking roomBooking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RoomBooking getRoomBooking(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomBooking> getRoomBookings(UUID customerId, Date date, RoomType roomType) {
		// TODO Auto-generated method stub
		return null;
	}

}
