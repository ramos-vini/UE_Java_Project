package orders;

import java.util.ArrayList;

import items.Item;

public class Order {
	
	private Integer id; // Primary Key
	private ArrayList<Item> items;
	
	// Getters & Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
