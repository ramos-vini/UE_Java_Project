package orders;

import items.*;

public class ItemOrder {
	
	private Item item;
	
	private Integer quantity;
	
	private String details;
	
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ItemOrder(Item item, Integer quantity){
		this.setItem(item);
		this.setQuantity(quantity);
	}

	// Getters & Setters
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
