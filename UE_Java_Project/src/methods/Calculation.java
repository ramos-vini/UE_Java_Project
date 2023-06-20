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
		/*
		Double smallPrice1 = 1000.0;
		
		Double smallPrice2 = 1200.0;
		*/
		
		// Weight Distribution
		Double totalWeight = totalWeight(order);
		Double totalVolume = totalVolume(order);
		
		// Big Containers' Volume
		Double bigVolume = 0.0;
		for (ContainerOrder containerOrder : order.getContainerOrders()) {
			if (containerOrder.getContainer().getType().equals("Big")) {
				bigVolume += containerOrder.getContainer().calculateVolume() * containerOrder.getQuantity();
			}
		}
		
		// Small Containers' Volume
		Double smallVolume = totalVolume - bigVolume;
		
		// Small Containers' Weight
		Double smallWeight = smallVolume * totalWeight / totalVolume;
		
		// Small Container's Price
		Double smallPrice = (smallWeight > 500) ? 1200.0 : 1000.0; // > 500kg: 1200 €; <= 500kg: 1000 €
		
		// Big Container's Price
		Double bigPrice = 1800.0;
		
		// Total Price
		Double totalPrice = 0.0;
		
		for (ContainerOrder containerOrder : order.getContainerOrders()) {
			Double price = 0.0;

			if (containerOrder.getContainer().getType().equals("Big")) {
				price = bigPrice;
			} else {
				price = smallPrice;
			}

			totalPrice += price * containerOrder.getQuantity();
		}

		return totalPrice;
	}

	public void addOrder(Order order, ArrayList<Order> orders) {
		orders.add(order);
	}

	public void printOrder(Order order) {

		ArrayList<ItemOrder> itemOrders = order.getItemOrders();

		for (ItemOrder item : itemOrders) {
			System.out.printf("\nItem: [%s]", item.getItem().getType());
			System.out.printf("\nQuantity: %d", item.getQuantity());
			if (item.getDetails() != null) {
				System.out.printf("\nDetails: \"%s\"", item.getDetails());
			}
			System.out.println();
		}
		
		System.out.printf("\nShipping Price: %.2f €",shippingPrice(order) );
	}

}
