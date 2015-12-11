package DatabaseInterfaces;

import ClassDiagram.Event;

public interface Events {
	void addEvent(Event event);
	void deleteEvent(Event event);
	void dispEvent(Event event);
	void listEvents();
}
