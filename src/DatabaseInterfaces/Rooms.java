package DatabaseInterfaces;

import ClassDiagram.CleaningStatus;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;

public interface Rooms {
	
		//add a room to the Rooms table
		public void addRoom(Room room);
		//remove room from the room table
		public void deleteRoom(Room room);
		//Display room with certain status and cleaningstatus
		public void dispRoom(Room room);
		//List all rooms
		public void listRooms();

}
