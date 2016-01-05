package DatabaseInterfaces;

import java.util.Date;
import java.util.List;
import java.util.Set;

import ClassDiagram.RoomType;

public interface RoomTypes {
	//add a roomtype to the RoomTypes table
	public void addRoomType(RoomType roomType);
	//remove roomtype from the RoomType table
	public void deleteRoomType(RoomType roomType);
	//Display roomtype
	public void dispRoomType(RoomType roomType);
	//List all roomTypes
	public List<RoomType> getRoomTypes();
	public List<RoomType> getAvailableRoomTypes(Date start, Date end, int[] distribution);
}
