package DatabaseInterfaces;

import java.util.List;

import ClassDiagram.CleaningStatus;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;

public interface Rooms {
	
		//add a room to the Rooms table
		public Room addRoom(Room room);
		//remove room from the room table
		public Room deleteRoom(int roomNumber);
		public Room getRoom(int RoomNumber);
		//List all rooms
		public List<Room> listRooms();

}
