package Methods;

import java.util.ArrayList;

import Containers.Container;
import Items.Item;

public interface CalcInterface {
	// Item as argument
	void addItem(Item item);
	void printItem(Item item);
	
	// Items as argument
	Double totalVolume(ArrayList<Item> items);
	Double totalWeight(ArrayList<Item> items);
	ArrayList<Container> bestShipping(ArrayList<Item> items);
	
	// Order (Containers) as argument
	Double shippingPrice(ArrayList<Container> order);
	void addOrder(ArrayList<Container> order);
	void printOrder(ArrayList<Container> order);
}
