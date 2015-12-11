package DatabaseInterfaces;

import java.util.List;
import java.util.UUID;

import ClassDiagram.EventBooking;

public interface EventBookings {
	
	boolean addEventBooking(EventBooking eventBooking);
	boolean deleteEventBooking(UUID id);
	EventBooking getEventBooking(UUID id);
	List<EventBooking> getEventBookings();

}
