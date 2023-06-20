package methods;

import java.util.ArrayList;

import containers.*;
import items.*;
import orders.*;

public class Calculation {

	// Item as argument
	public void printItem(Item item) {
		item.printInfo();
	}

	// ItemOrder as argument
	public void addItems(ItemOrder itemOrder, Order order) {
		order.addItemOrder(itemOrder);
	}

	// Order as argument
	public Double totalVolume(Order order) {

		ArrayList<ItemOrder> itemOrders = order.getItemOrders();

		Double volume = 0.0;
		for (ItemOrder itemOrder : itemOrders) {
			volume += itemOrder.getItem().calculateVolume() * itemOrder.getQuantity();
		}

		return volume;
	}

	public Double totalWeight(Order order) {

		ArrayList<ItemOrder> itemOrders = order.getItemOrders();

		Double weight = 0.0;
		for (ItemOrder itemOrder : itemOrders) {
			weight += itemOrder.getItem().getWeight() * itemOrder.getQuantity();
		}

		return weight;
	}

	public void bestShipping(Order order) {
		// Containers' Variables
		BigContainer bigContainer = new BigContainer();
		Double bigVolume = bigContainer.calculateVolume();
		Integer bigQuantity = 0;

		SmallContainer smallContainer = new SmallContainer();
		Double smallVolume = smallContainer.calculateVolume();
		Integer smallQuantity = 0;
		
		// Calculate Containers' Quantities
		Double totalVolume = totalVolume(order);
		
		if (totalVolume > smallVolume) {
			bigQuantity = (int) (totalVolume / bigVolume);

			if (totalVolume % bigVolume > smallVolume) {
				bigQuantity++;
			} else {
				smallQuantity++;
			}

		} else {
			smallQuantity++;
		}
		
		// Add Containers to the Order
		if (bigQuantity > 0) {
			ContainerOrder bigContainerOrder = new ContainerOrder(bigContainer, bigQuantity);
			order.addContainerOrder(bigContainerOrder);
		}

		if (smallQuantity > 0) {
			ContainerOrder smallContainerOrder = new ContainerOrder(smallContainer, smallQuantity);
			order.addContainerOrder(smallContainerOrder);
		}

	}

	public Double shippingPrice(Order order) {
		// use the bestShipping() to calc the value
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
