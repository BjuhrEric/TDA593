package DatabaseInterfaces;

import ClassDiagram.Event;

public interface Events {
	//add a event to the Event table
	public void addEvent(Event event);
	//remove event from the Event table
	public void deleteEvent(Event event);
	//Display event
	public void dispEvent(Event event);
	//List all events
	public void listEvents();
}
