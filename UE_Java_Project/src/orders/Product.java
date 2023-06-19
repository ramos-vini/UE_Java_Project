package orders;

import items.*;

public class Product {
	
	private Item item;
	
	private Integer quantity;
	
	public Product(Item item, Integer quantity){
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
