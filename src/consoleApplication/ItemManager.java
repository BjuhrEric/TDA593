package consoleApplication;

import java.util.List;
import java.util.Scanner;

import ClassDiagram.Item;
import ClassDiagram.impl.ClassDiagramFactoryImpl;

public class ItemManager {
	
	Scanner userInput;
	List<Item> items;
	
	
	
	public ItemManager(Scanner userInput, List<Item> items) {
		this.userInput = userInput;
		this.items = items;
	}

	private int findItem(String itemName) {
		
		for (int i = 0; i < items.size(); ++i)
			if (items.get(i).getName().equals(itemName))
				return i;
		
		return -1;
	}
	
	private void listItems() {
		System.out.println();
		System.out.println("Current items in the system:");
		System.out.println();
		
		System.out.println("No. Name\tPrice");
		
		for (int i = 0; i < items.size(); ++i) {
			Item elem = items.get(i);
			System.out.println((i+1) + ". " + elem.getName()
									 + "\t" + elem.getPrice());
		}
		
		System.out.println();
	}
	
	private void createItem() {
		Item newItem = ClassDiagramFactoryImpl.eINSTANCE.createItem();
		
		String name = "";
		int searchResult = -1;
		
		System.out.println();
		
		//Ask for the name of the item until it's valid (not already used)
		do {
			System.out.print("Name of the new item: ");
			name = userInput.next();
			
			searchResult = findItem(name);
			
			if (searchResult >= 0)
				System.out.println("ERROR! Item '" + name + "' already exists!");
			
		} while (searchResult >= 0);
		
		newItem.setName(name);
		
		System.out.print("Price of the new item: ");
		double price = userInput.nextDouble();
		newItem.setPrice(price);
		
		items.add(newItem);
		
		System.out.println();
		System.out.print("Item '" + name + "' created.");
		System.out.println();
	}
	
	//This method takes an existing item, updates it with new data, and puts it back to the items
	private void modifyItem() {
		System.out.println();
		System.out.print("Enter the name of the item you want to modify: ");
		String itemName = userInput.next();
		
		int searchResult = findItem(itemName);
		if (searchResult >= 0) {
			
			System.out.println();
			
			String newItemName = "";
			int searchResult2 = -1;
			
			//Ask for item's name until it's valid (not already taken)
			//(it is OK if it's the old name of the item we want to modify)
			do {
				System.out.print("New name of the item: ");
				newItemName = userInput.next();
				
				searchResult2 = findItem(newItemName);
				
				//If the name already exists, and it is not the old name of the item we want to modify
				//then give an error
				if (searchResult2 >= 0 && searchResult2 != searchResult)
					System.out.println("ERROR! Item '" + newItemName + "' already exists!");
				
			} while (searchResult2 >= 0 && searchResult2 != searchResult);
			
			System.out.print("New price of the item: ");
			double newPrice = userInput.nextDouble();
			
			Item newItem = ClassDiagramFactoryImpl.eINSTANCE.createItem();
			newItem.setName(newItemName);
			newItem.setPrice(newPrice);
			//We replace the old item with the new one we just created
			items.set(searchResult, newItem);
			
			System.out.println();
			System.out.println("Item '" + itemName + "' updated.");
		}
		else
			System.out.println("ERROR! Item not found!");
		
		System.out.println();
		
	}
	
	private void removeItem() {
		System.out.println();
		System.out.print("Enter the name of the item you want to remove: ");
		String itemName = userInput.next();
		
		int searchResult = findItem(itemName);
		
		if (searchResult >= 0) {
			items.remove(searchResult);
			System.out.println("Item '" + itemName + "' removed.");
		}
		else
			System.out.println("ERROR! No item found with name '" + itemName + "'!");
	}

	public void start() {
		System.out.println();
		System.out.println("1. List existing items");
		System.out.println("2. Create a new item");
		System.out.println("3. Modify an existing item");
		System.out.println("4. Remove an existing item");
		System.out.println("5. Back");
		System.out.println();
		System.out.print("Please select a function: ");
		
		int choice = userInput.nextInt();
		if (choice < 1 || choice > 5) choice = 5;
		
		switch(choice) {
		case 1:
			listItems();
			break;
		case 2:
			createItem();
			break;
		case 3:
			modifyItem();
			break;
		case 4:
			removeItem();
			break;
		}
	}
}