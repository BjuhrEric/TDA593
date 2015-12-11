package DatabaseInterfaces;

import ClassDiagram.Item;

public interface Items {
	void addItem(Item item);
	void deleteItem(Item item);
	void dispItem(Item item);
	void listItems();	
}
