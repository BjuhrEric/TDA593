package DatabaseInterfaces;

import ClassDiagram.Item;

public interface Items {
	//add a event to the Item table
	public void addItem(Item item);
	//remove event from the Item table
	public void deleteItem(Item item);
	//Display event
	public void dispItem(Item item);
	//List all items
	public void listItems();	
}
