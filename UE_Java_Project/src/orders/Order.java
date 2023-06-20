package orders;

import java.util.ArrayList;

public class Order {
	
	private ArrayList<ItemOrder> itemOrders = new ArrayList<ItemOrder>();
	
	private ArrayList<ContainerOrder> containerOrders = new ArrayList<ContainerOrder>();

	public ArrayList<ItemOrder> getItemOrders() {
		return itemOrders;
	}

	public void addItemOrder(ItemOrder itemOrder) {
		this.itemOrders.add(itemOrder);
	}

	public ArrayList<ContainerOrder> getContainerOrders() {
		return containerOrders;
	}

	public void addContainerOrder(ContainerOrder containerOrder) {
		this.containerOrders.add(containerOrder);
	}
}
