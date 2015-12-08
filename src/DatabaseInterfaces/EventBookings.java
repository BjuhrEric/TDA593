package DatabaseInterfaces;

import ClassDiagram.EventBooking;

public interface EventBookings {
	
	//add a eventbooking to the EventBooking table
	public void addEventBooking(EventBooking eventBooking);
	//remove eventbooking from the EventBooking table
	public void deleteEventBooking(EventBooking eventBooking);
	//Display eventbooking
	public void dispEventBooking(EventBooking eventBooking);
	//List all eventBookings
	public void listEventBookings();

}
