package orders;

import java.util.ArrayList;

import items.Item;

public class Order {
	
	private ArrayList<Item> items;
	
	// Getters & Setters
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
