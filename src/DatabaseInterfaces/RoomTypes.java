package DatabaseInterfaces;

import java.util.List;

import ClassDiagram.RoomType;

public interface RoomTypes {
	//add a roomtype to the RoomTypes table
	public void addRoomType(RoomType roomType);
	//remove roomtype from the RoomType table
	public void deleteRoomType(RoomType roomType);
	//Display roomtype
	public void dispRoomType(RoomType roomType);
	//List all roomTypes
	public void listRoomTypes();
	public List<RoomType> getAvailableRoomTypes();
}
