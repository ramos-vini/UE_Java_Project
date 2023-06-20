// Name: Vinícius de Souza Ramos

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import methods.*;
import containers.*;
import items.*;
import orders.*;

public class Main {

	public static void main(String[] args) {
		// Orders
		ArrayList<Order> orders = new ArrayList<Order>();

		// Items available
		ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList("Desktop", "Laptop", "LCD Screen", "Mouse"));

		System.out.println(" ____________________ ");
		for (int i = 0; i < itemsList.size(); i++) {
			System.out.printf("| " + (i + 1) + "  -  %-12s%2s\n", itemsList.get(i), "|");
			System.out.println("|____________________|");
		}

		// Calculation Object
		Calculation calc = new Calculation();

		// Order creation
		Order order = new Order();

		// Item(s) Input
		Scanner scanner = new Scanner(System.in);

		Boolean addMoreProducts = true;

		while (addMoreProducts == true) {
			// Item's Type
			Integer item = 0;

			while (item < 1 || item > itemsList.size()) {
				try {
					System.out.println("\nEnter the number of the item (1-" + itemsList.size() + "): ");
					item = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			// Item's Quantity
			Integer quantity = 0;

			while (quantity < 1) {
				try {
					System.out.println("\nEnter the quantity of the item [" + itemsList.get(item - 1) + "]: ");
					quantity = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			// Adding the item(s) to the order
			ItemOrder itemOrder = null;

			switch (item) {
			case 1:
				itemOrder = new ItemOrder(new Desktop(), quantity);
				break;

			case 2:
				itemOrder = new ItemOrder(new Laptop(), quantity);
				break;

			case 3:
				itemOrder = new ItemOrder(new LcdScreen(), quantity);
				break;

			case 4:
				itemOrder = new ItemOrder(new Mouse(), quantity);
				break;

			default:
				break;
			}

			// Add details?
			String YNResponse = "";
			while (!YNResponse.equalsIgnoreCase("Y") && !YNResponse.equalsIgnoreCase("N")) {
				try {
					System.out.println("\nAdd product details? (Y/N)");
					YNResponse = scanner.nextLine();

					if (YNResponse.equalsIgnoreCase("Y")) {
						System.out.println(
								"\nEnter the details for [" + itemsList.get(item - 1) + " (x" + quantity + ")]: ");
						String details = scanner.nextLine();

						addProductDetails(itemOrder, details);
					}

				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			// Add items to the order
			calc.addItems(itemOrder, order);

			// Add more products or Finish the order
			YNResponse = "";
			while (!YNResponse.equalsIgnoreCase("Y") && !YNResponse.equalsIgnoreCase("N")) {
				try {
					System.out.println("\nAdd more products? (Y/N)");
					YNResponse = scanner.nextLine();

					if (YNResponse.equalsIgnoreCase("N")) {
						addMoreProducts = false;
					}

				} catch (Exception e) {
					scanner.nextLine();
				}
			}
		}
		scanner.close();

		// Adding order to orders array
		calc.addOrder(order, orders);

		// Reading the order
		System.out.println("*************************");
		System.out.println("Thank you for your Order!");
		System.out.println("*************************");
		readOrder(order);

	}

	// Test static methods
	public static void addProductDetails(ItemOrder itemOrder, String details) {
		itemOrder.setDetails(details);
	}

	public static void readOrder(Order order) {
		// (print ItemOrders and ContainerOrders from Order)
		System.out.println("\nSummary: ");

		ArrayList<ItemOrder> itemOrders = order.getItemOrders();

		for (ItemOrder item : itemOrders) {
			System.out.printf("\nItem: [%s]", item.getItem().getType());
			System.out.printf("\nQuantity: %d", item.getQuantity());
			if (item.getDetails() != null) {
				System.out.printf("\nDetails: \"%s\"", item.getDetails());
			}
			System.out.println();
		}

	}

	public static void printResults() {
		// printOrder() + print bestShipping()
	}

}
