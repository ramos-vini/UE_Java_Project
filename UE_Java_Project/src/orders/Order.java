package orders;

import java.util.ArrayList;

import items.Item;

public class Order {
	
	private Integer id; // Primary Key
	private String clientName;
	private ArrayList<Item> items;
	
	// Getters & Setters
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
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
