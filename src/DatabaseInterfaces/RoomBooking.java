package DatabaseInterfaces;

import org.eclipse.emf.ecore.EDataType;

/*
 * The following text is just to get an idea of the database structure, the way I see it there is a table RoomBooking,
 * a table Rooms, the database itself may use associations between tables
 * 
 * Ex:
 * RoomBookings/ Bookings:
 * 1
 * 2
 * 3
 * 
 * Rooms:
 * 101
 * 102
 * 103
 * 
 * Association:
 * 1	101
 * 1	102
 * 2	103
 * 3	103
 * 
 */

public interface RoomBooking {
	//A RoomBooking containing a roomtype and a room is added to the Booking table
	public void addRoomBooking(EDate startDate, EDate endDate, RoomType roomType, Room room);
	public void deleteRoomBooking();	
	//Display all current roombookings in a list
	public void listRoomBookings();
	
	
	
	

}
