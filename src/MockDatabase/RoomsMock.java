package MockDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.Room;
import ClassDiagram.RoomType;
import DatabaseInterfaces.Rooms;

public class RoomsMock implements Rooms{

	private HashMap<Integer, Room> rooms;
	private static RoomsMock instance = null;
	
	private RoomsMock(){
		rooms = new HashMap<Integer, Room>();
		RoomTypesMock roomTypes = RoomTypesMock.getInstance();
		List<RoomType> roomTypesInDb = roomTypes.getRoomTypes();
		
		Room r1 = ClassDiagramFactory.eINSTANCE.createRoom();
		r1.setRoomNumber(1);
		r1.setRoomType(roomTypesInDb.get(0));
		rooms.put(1, r1);
		
		Room r2 = ClassDiagramFactory.eINSTANCE.createRoom();
		r2.setRoomNumber(2);
		r2.setRoomType(roomTypesInDb.get(1));
		rooms.put(2, r2);
		
		Room r3 = ClassDiagramFactory.eINSTANCE.createRoom();
		r3.setRoomNumber(3);
		r3.setRoomType(roomTypesInDb.get(2));
		rooms.put(3, r3);
		
		Room r4 = ClassDiagramFactory.eINSTANCE.createRoom();
		r4.setRoomNumber(4);
		r4.setRoomType(roomTypesInDb.get(0));
		rooms.put(4, r1);
		
		Room r5 = ClassDiagramFactory.eINSTANCE.createRoom();
		r5.setRoomNumber(5);
		r5.setRoomType(roomTypesInDb.get(1));
		rooms.put(5, r5);
		
		Room r6 = ClassDiagramFactory.eINSTANCE.createRoom();
		r6.setRoomNumber(6);
		r6.setRoomType(roomTypesInDb.get(2));
		rooms.put(6, r6);
		
		Room r7 = ClassDiagramFactory.eINSTANCE.createRoom();
		r7.setRoomNumber(7);
		r7.setRoomType(roomTypesInDb.get(0));
		rooms.put(7, r7);
		
		Room r8 = ClassDiagramFactory.eINSTANCE.createRoom();
		r8.setRoomNumber(8);
		r8.setRoomType(roomTypesInDb.get(1));
		rooms.put(8, r8);
		
		Room r9 = ClassDiagramFactory.eINSTANCE.createRoom();
		r9.setRoomNumber(9);
		r9.setRoomType(roomTypesInDb.get(2));
		rooms.put(9, r9);
	}
	
	public static RoomsMock getInstance(){
		if(instance == null){
			instance = new RoomsMock();
		}
		return instance;
	}
	
	@Override
	/**
	 * @returns null if everything went well, the previous room associated with the room number if the room number was occupied
	 */
	public Room addRoom(Room room) {
		Room result = rooms.put(room.getRoomNumber(), room);
		if(result == null || result.equals(room)){
			return null;
		}
		return result;
	}

	@Override
	public Room deleteRoom(int roomNumber) {
		return rooms.remove(roomNumber);
	}

	@Override
	public Room getRoom(int roomNumber) {
		return rooms.get(roomNumber);
	}

	@Override
	public List<Room> listRooms() {
		ArrayList<Room> roomList = 	new ArrayList<Room>(rooms.values());
		//TODO: sort after room number
		return roomList;
	}

}
