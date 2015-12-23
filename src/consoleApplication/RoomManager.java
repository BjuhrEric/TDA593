package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Room;
import ClassDiagram.RoomType;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class RoomManager {

	Scanner userInput;
	List<Room> rooms;
	List<RoomType> roomTypes;
	
	public RoomManager(Scanner userInput, List<Room> rooms, List<RoomType> roomTypes) {
		this.userInput = userInput;
		this.rooms = rooms;
		this.roomTypes = roomTypes;
	}

	private int findRoomType(String roomTypeName) {
		
		for (int i = 0; i < roomTypes.size(); ++i)
			if (roomTypes.get(i).getName().equals(roomTypeName))
				return i;
		
		return -1;
	}
	
	private void listRoomTypes() {
		System.out.println();
		System.out.println("Current room types in the system:");
		System.out.println();
		
		System.out.println("No. Name\tPrice\tBeds#\tExtra beds#\tGuest Capacity\tDescription");
		
		for (int i = 0; i < roomTypes.size(); ++i) {
			RoomType elem = roomTypes.get(i);
			System.out.println((i+1) + ". " + elem.getName()
									 + "\t" + elem.getPrice()
									 + "\t" + elem.getNumberOfBeds()
									 + "\t" + elem.getNumberOfExtraBeds() + "\t"
									 + "\t" + elem.getGuestCapacity() + "\t"
									 + "\t" + elem.getDescription());
		}
		
		System.out.println();
	}
	
	private int findRoom(int roomNumber) {
		
		for (int i = 0; i < rooms.size(); ++i)
			if (rooms.get(i).getRoomNumber() == roomNumber)
				return i;
		
		return -1;
	}	
	
	private void listRooms() {
		System.out.println();
		System.out.println("Current rooms in the system:");
		System.out.println();
		
		System.out.println("No. Number\tType\tStatus\t\tCleaning Status");
		
		for (int i = 0; i < rooms.size(); ++i) {
			Room elem = rooms.get(i);
			/*elem.getBill()
			elem.getGuests()
			elem.getNumberOfGuests()*/
			System.out.println((i+1) + ". #" + elem.getRoomNumber() + "\t"
									 + "\t" + elem.getRoomType().getName()
									 + "\t" + elem.getRoomStatus().getName()
									 + "\t" + elem.getCleaningStatus().getName());
		}
		
		System.out.println();
	}
	
	private void createRoomType() {
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		RoomType newRoomType = factory.createRoomType();
		
		System.out.print("Name of new room type: ");
		String name = userInput.next();
		newRoomType.setName(name);
		
		System.out.print("Number of beds in room type: ");
		int numberOfBeds = userInput.nextInt();
		newRoomType.setNumberOfBeds(numberOfBeds);
		
		System.out.print("Number of extra beds in room type: ");
		int numberOfExtraBeds = userInput.nextInt();
		newRoomType.setNumberOfExtraBeds(numberOfExtraBeds);
		
		System.out.print("Guest capacity of room type: ");
		int guestCapacity = userInput.nextInt();
		newRoomType.setGuestCapacity(guestCapacity);
		
		System.out.print("Price of room type: ");
		double price = userInput.nextDouble();
		newRoomType.setPrice(price);
		
		System.out.print("Description of room type: ");
		String description = userInput.next();
		newRoomType.setDescription(description);
		
		roomTypes.add(newRoomType);
		
		System.out.println();
		System.out.print("Room type '" + name + "' created.");
		System.out.println();
		
	}
	
	private void modifyRoomType() {
		
		System.out.println();
		System.out.print("Enter the name of the room type you want to modify: ");
		String roomTypeName = userInput.next();
		
		int searchResult = findRoomType(roomTypeName);
		if (searchResult >= 0) {
			
			System.out.println();
			
			String newRoomTypeName = "";
			int searchResult2 = -1;
			do {
				System.out.print("New name of room type: ");
				newRoomTypeName = userInput.next();
				
				searchResult2 = findRoomType(newRoomTypeName);
				
				if (searchResult2 >= 0 && searchResult2 != searchResult)
					System.out.println("ERROR! Room type '" + newRoomTypeName + "' already exists!");
				
			} while (searchResult2 >= 0 && searchResult2 != searchResult);
			
			System.out.print("New number of beds in room type: ");
			int numberOfBeds = userInput.nextInt();
			
			System.out.print("Number of extra beds in room type: ");
			int numberOfExtraBeds = userInput.nextInt();
			
			System.out.print("Guest capacity of room type: ");
			int guestCapacity = userInput.nextInt();
			
			System.out.print("Price of room type: ");
			double price = userInput.nextDouble();
			
			System.out.print("Description of room type: ");
			String description = userInput.next();
			
			ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
			RoomType newRoomType = factory.createRoomType();
			newRoomType.setName(newRoomTypeName);
			newRoomType.setNumberOfBeds(numberOfBeds);
			newRoomType.setNumberOfExtraBeds(numberOfExtraBeds);
			newRoomType.setGuestCapacity(guestCapacity);
			newRoomType.setPrice(price);
			newRoomType.setDescription(description);
			roomTypes.set(searchResult, newRoomType);
			
			System.out.println();
			System.out.println("Room type '" + roomTypeName + "' updated.");
		}
		else
			System.out.println("ERROR! Room type not found!");
		
		System.out.println();
	}
	
	private void removeRoomType() {
		
		System.out.println();
		System.out.print("Enter the name of the room type you want to remove: ");
		String roomTypeName = userInput.next();
		
		int searchResult = findRoomType(roomTypeName);
		
		if (searchResult >= 0) {
			roomTypes.remove(searchResult);
			System.out.println("Room type '" + roomTypeName + "' removed.");
		}
		else
			System.out.println("ERROR! No room type found with name '" + roomTypeName + "'!");
	}
	
	private void createRoom() {
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
		Room newRoom = factory.createRoom();
		
		int number = -1;
		int searchResult = -1;
		
		System.out.println();
		
		do {
			System.out.print("Number of new room: ");
			number = userInput.nextInt();
			
			searchResult = findRoom(number);
			
			if (searchResult >= 0)
				System.out.println("ERROR! Room #" + number + " already exists!");
			
		} while (searchResult >= 0);
		
		newRoom.setRoomNumber(number);
		
		
		for (int i = 0; i < roomTypes.size(); ++i)
			System.out.println((i+1) + ". " + roomTypes.get(i).getName());
		
		int roomType = 0;
		
		do {
			System.out.print("Choose a room type: ");
			roomType = userInput.nextInt();
		} while (roomType <= 0 || roomType > roomTypes.size());
		
		newRoom.setRoomType(roomTypes.get(roomType-1));
		
		rooms.add(newRoom);
		
		System.out.println();
		System.out.print("Room #" + number + " created.");
		System.out.println();
		
	}
	
	private void modifyRoom() {
		if (roomTypes.isEmpty()) {
			System.out.println("ERROR! There are no room types in the system. Create a room type and try again!");
			return;
		}
		
		System.out.println();
		System.out.print("Enter the number of the room you want to modify: ");
		int roomNumber = userInput.nextInt();
		
		int searchResult = findRoom(roomNumber);
		if (searchResult >= 0) {
			
			System.out.println();
			
			int newRoomNumber = -1;
			int searchResult2 = -1;
			do {
				System.out.print("New number of room: ");
				newRoomNumber = userInput.nextInt();
				
				searchResult2 = findRoom(newRoomNumber);
				
				if (searchResult2 >= 0 && searchResult2 != searchResult)
					System.out.println("ERROR! Room #" + newRoomNumber + " already exists!");
				
			} while (searchResult2 >= 0 && searchResult2 != searchResult);
			
			for (int i = 0; i < roomTypes.size(); ++i)
				System.out.println((i+1) + ". " + roomTypes.get(i).getName());
			
			int roomType = 0;
			
			do {
				System.out.print("Choose a room type: ");
				roomType = userInput.nextInt();
			} while (roomType <= 0 || roomType > roomTypes.size());
			
			ClassDiagramFactoryImpl factory = new ClassDiagramFactoryImpl();
			Room newRoom = factory.createRoom();
			newRoom.setRoomNumber(newRoomNumber);
			newRoom.setRoomType(roomTypes.get(roomType-1));
			rooms.set(searchResult, newRoom);
			
			System.out.println();
			System.out.println("Room #" + roomNumber + " updated.");
		}
		else
			System.out.println("ERROR! Room type not found!");
		
		System.out.println();
		
	}
	
	private void removeRoom() {
		System.out.println();
		System.out.print("Enter the number of the room you want to remove: ");
		int roomNumber= userInput.nextInt();
		
		int searchResult = findRoom(roomNumber);
		
		if (searchResult >= 0) {
			rooms.remove(searchResult);
			System.out.println("Room #" + roomNumber + " removed.");
		}
		else
			System.out.println("ERROR! No room found with number #" + roomNumber + "!");
		
	}
	
	public void start() {
		System.out.println();
		System.out.println("1. List existing room types");
		System.out.println("2. Create a new room type");
		System.out.println("3. Modify an existing room type");
		System.out.println("4. Remove an existing room type");
		System.out.println("5. List existing rooms");
		System.out.println("6. Create a new room");
		System.out.println("7. Modify an existing room");
		System.out.println("8. Remove an existing room");
		System.out.println("9. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		if (choice < 1 || choice > 9) choice = 9;
		
		switch(choice) {
		case 1:
			listRoomTypes();
			break;
		case 2:
			createRoomType();
			break;
		case 3:
			modifyRoomType();
			break;
		case 4:
			removeRoomType();
			break;
		case 5:
			listRooms();
			break;
		case 6:
			createRoom();
			break;
		case 7:
			modifyRoom();
			break;
		case 8:
			removeRoom();
			break;
		}
	}

}