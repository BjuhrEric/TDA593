package DatabaseInterfaces;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EDataType;

import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;

public interface RoomBookings {
	boolean addRoomBooking(RoomBooking roomBooking);
	boolean deleteRoomBooking(UUID id);	
	boolean updateRoomBooking(RoomBooking roomBooking);
	RoomBooking getRoomBooking(UUID id);
	List<RoomBooking> getRoomBookings(UUID customerId, Date date, RoomType roomType);
	
	
	
	
	
	

}
