package methods;

import java.util.ArrayList;

import containers.Container;
import items.Item;

public class Calculation{

	// Item as argument
	public void addItem(Item item) {
		
		
	}

	public void printItem(Item item) {		item.printInfo();
	}

	// Items as argument
	public Double totalVolume(ArrayList<Item> items) {		Double totalVolume = 0.0;
		
		for(Item item : items) {
			totalVolume += item.calculateVolume();
		}
		
		return totalVolume;
	}

	public Double totalWeight(ArrayList<Item> items) {
		Double totalWeight = 0.0;
		
		for(Item item : items) {
			totalWeight += item.getWeight();
		}
		
		return totalWeight;
	}
	
	public ArrayList<Container> bestShipping(ArrayList<Item> items) {
		return null;
	}

	// Order (Containers) as argument
	public Double shippingPrice(ArrayList<Container> order) {
		return null;
	}

	public void addOrder(ArrayList<Container> order) {
		
	}

	public void printOrder(ArrayList<Container> order) {
		
	}
	
}
