package methods;

import java.util.ArrayList;

import containers.Container;
import items.Item;
import orders.ItemOrder;
import orders.Order;

public class Calculation{

	// Item as argument
	public void printItem(Item item) {		item.printInfo();
	}

	// ItemOrder as argument
	public void addItems(ItemOrder itemOrder, Order order) {
		order.addItemOrders(itemOrder);
	}

	// Order as argument
	public Double totalVolume(Order order) {
		
		ArrayList<ItemOrder> itemOrders = order.getItemOrders();
		
		Double volume = 0.0;
		for(ItemOrder itemOrder : itemOrders) {
			volume += itemOrder.getItem().calculateVolume() * itemOrder.getQuantity();
		}
		
		return volume;
	}

	public Double totalWeight(Order order) {
		
		ArrayList<ItemOrder> itemOrders = order.getItemOrders();
		
		Double weight = 0.0;
		for(ItemOrder itemOrder : itemOrders) {
			weight += itemOrder.getItem().getWeight() * itemOrder.getQuantity();
		}
		
		return weight;
	}
	
	public ArrayList<Container> bestShipping(Order order) {
		// formula to return the cheapest containers arrangement
		return null;
	}
	
	public Double shippingPrice(Order order) {		// use the bestShipping() and totalWeight() to return the value
		// P.S.: Add values ($) to the Containers Class
		return null;
	}

	public void addOrder(Order order, ArrayList<Order> orders) {
		orders.add(order);
	}

	public void printOrder(Order order) {
		// readOrder() + print shippingPrice()
		
	}
	
}
