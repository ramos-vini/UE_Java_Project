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

	// itemOrder (items) as argument
	public Double totalVolume(ItemOrder itemOrder) {		
		Double volume = itemOrder.getItem().calculateVolume() * itemOrder.getQuantity();
		
		return volume;
	}

	public Double totalWeight(ItemOrder itemOrder) {

		Double weight = itemOrder.getItem().getWeight() * itemOrder.getQuantity();
		
		return weight;
	}

	// Order as argument
	public ArrayList<Container> bestShipping(ItemOrder itemOrder) {
		// formula to return the cheapest containers arrangement
		return null;
	}
	
	public Double shippingPrice(Order order) {		// use the bestShipping() and totalWeight() to return the value
		// P.S.: Add values ($) to the Containers Class
		return null;
	}
	
	public void addItems(ItemOrder itemOrder, Order order) {
		order.addItemOrders(itemOrder);
	}

	public void addOrder(Order order, ArrayList<Order> orders) {		// add Order to an ArrayList
		
	}

	public void printOrder(Order order) {
		// print Order's items		// call shippingPrice()
		
	}
	
}
