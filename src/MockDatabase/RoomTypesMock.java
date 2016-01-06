package MockDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;
import DatabaseInterfaces.RoomTypes;

public class RoomTypesMock implements RoomTypes{
	
	private static ArrayList<RoomType> roomTypes;
	private static RoomTypesMock instance = null;
	
	private RoomTypesMock(){
		roomTypes = new ArrayList<RoomType>();
		
	}
	
	public static RoomTypesMock getInstance(){
		if(instance == null){
			instance = new RoomTypesMock();
			init();
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
	
	public List<RoomType> getRoomTypes() {
		return new ArrayList<>(roomTypes);
	}
	
	//Helper method for getAvailableRoomTypes(...)
	private boolean roomTypeIsEligible(Date start, Date end, int numPeople, List<Date> startDates, List<Date> endDates, int capacity, int numRooms) {
		
		if(startDates.size() != endDates.size()) {
			return false; //If this happens something is very much broke
		}
		
		if(numPeople > capacity) {
			return false;
		}
		
		class DateType implements Comparable<DateType> {

			private Date date;
			private boolean type;
			
			DateType(Date date, boolean type) {
				this.date = date;
				this.type = type;
			}
			
			@Override
			public int compareTo(DateType rhs) {
				if(date.compareTo(rhs.date) < 0) {
					return -1;
				} else if(date == rhs.date) {
					if(!type) {
						return -1;
					} else if(rhs.type) {
						return 0;
					} else {
						return 1;
					}
				} else {
					return 1;
				}
			}
		};
		
		ArrayList<DateType> sortedDates = new ArrayList<DateType>();
		for(Date startDate : startDates) {
			sortedDates.add(new DateType(startDate, true));
		}
		
		for(Date endDate : endDates) {
			sortedDates.add(new DateType(endDate, false));
		}
		
		sortedDates.sort(null); //Comparable interface is realized for DateType
		
		int sum = 0;
		for(DateType dateType : sortedDates) {
			sum = dateType.type ? sum + 1 : sum - 1;
			if(sum > numRooms) {
				return false;
			}
		}
		return true;
	}

	@Override
	public List<RoomType> getAvailableRoomTypes(Date start, Date end, int numPeople) {		
		ArrayList<RoomType> availableRoomTypes = new ArrayList<RoomType>();
		
		for(RoomType roomType : getRoomTypes()) {
			if(roomTypeIsEligible(start, end, numPeople, getStartDates(roomType), getEndDates(roomType), roomType.getGuestCapacity(), getNumberOfRooms(roomType))) {
				availableRoomTypes.add(roomType);
			}
		}
		
		return availableRoomTypes;
	}

	@Override
	public List<Date> getStartDates(RoomType roomType) {
		List<RoomBooking> bookings = RoomBookingsMock.getInstance().getRoomBookings();
		ArrayList<Date> toReturn = new ArrayList<Date>();
		for(RoomBooking booking : bookings){
			if(booking.getRoomTypes().equals(roomType)){
				toReturn.add(booking.getStartDate());
			}
		}
		
		return toReturn;
	}

	@Override
	public List<Date> getEndDates(RoomType roomType) {
		List<RoomBooking> bookings = RoomBookingsMock.getInstance().getRoomBookings();
		ArrayList<Date> toReturn = new ArrayList<Date>();
		for(RoomBooking booking : bookings){
			if(booking.getRoomTypes().equals(roomType)){
				toReturn.add(booking.getEndDate());
			}
		}
		return toReturn;
	}

	@Override
	public int getNumberOfRooms(RoomType roomType) {
		List<Room> rooms = RoomsMock.getInstance().listRooms();
		int numberOfRooms = 0;
		for(Room room : rooms){
			if(room.getRoomType().equals(roomType)){
				numberOfRooms++;
			}
		}
		return numberOfRooms;
	}
	public static void init(){
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

}
