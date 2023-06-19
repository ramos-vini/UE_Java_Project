package orders;

import containers.*;

public class ContainerOrder {

	private Container container;
	
	private Integer quantity;
	
	public ContainerOrder(Container container, Integer quantity){
		this.setContainer(container);
		this.setQuantity(quantity);
	}

	// Getters & Setters
	public Container getContainer() {
		return container;
	}
	
	public void setContainer(Container container) {
		this.container = container;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
