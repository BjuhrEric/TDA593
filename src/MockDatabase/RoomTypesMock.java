package MockDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.RoomTypes;

public class RoomTypesMock implements RoomTypes{
	
	private ArrayList<RoomType> roomTypes;
	private static RoomTypesMock instance = null;
	
	private RoomTypesMock(){
		roomTypes = new ArrayList<RoomType>();
		
		RoomType rt = ClassDiagramFactoryImpl.eINSTANCE.createRoomType();
		rt.setDescription("double");
		rt.setGuestCapacity(2);
		rt.setName("Double");
		rt.setNumberOfBeds(2);
		rt.setNumberOfExtraBeds(0);
		rt.setPrice(500);
		roomTypes.add(rt);
		
		RoomType rt2 = ClassDiagramFactoryImpl.eINSTANCE.createRoomType();
		rt2.setDescription("single");
		rt2.setGuestCapacity(1);
		rt2.setName("Single");
		rt2.setNumberOfBeds(1);
		rt2.setNumberOfExtraBeds(1);
		rt2.setPrice(280);
		roomTypes.add(rt2);
		
		RoomType rt3 = ClassDiagramFactoryImpl.eINSTANCE.createRoomType();
		rt3.setDescription("Grand royale suite - for your luxorious needs");
		rt3.setGuestCapacity(2);
		rt3.setName("Suite");
		rt3.setNumberOfBeds(2);
		rt3.setNumberOfExtraBeds(4);
		rt3.setPrice(5000);
		roomTypes.add(rt3);
	}
	
	public static RoomTypesMock getInstance(){
		if(instance == null){
			instance = new RoomTypesMock();
		}
		return instance;
	}

	@Override
	public void addRoomType(RoomType roomType) {
		for(RoomType type : roomTypes){
			if(type.equals(roomType)){
				return;
			}
		}
		roomTypes.add(roomType);
		
	}

	@Override
	public void deleteRoomType(RoomType roomType) {
		roomTypes.remove(roomType);
		
	}

	@Override
	public void dispRoomType(RoomType roomType) {
		// TODO Not implemented
		
	}

	@Override
	public List<RoomType> getRoomTypes() {
		return roomTypes;		
	}

	@Override
	public List<RoomType> getAvailableRoomTypes(Date start, Date end, int[] distribution) {
		// TODO This should be implemented so that it does not return unavailable room types or un matching room types
		return roomTypes;
	}

}
