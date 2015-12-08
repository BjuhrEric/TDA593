package DatabaseInterfaces;

import org.eclipse.emf.ecore.EDataType;

import ClassDiagram.RoomBooking;

public interface RoomBookings {
	//A roombooking to the RoomBookings table
	public void addRoomBooking(RoomBooking roomBooking);
	//Delete roombooking from the table
	public void deleteRoomBooking(RoomBooking roomBooking);	
	//Display roomBooking from the table
	public void dispRoomBooking(RoomBooking roomBooking);
	//List all roombookings
	public void listRoomBookings();
	
	
	
	

}
