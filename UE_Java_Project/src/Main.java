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

			calc.addItems(itemOrder, order);

			// User Choice: Add more products or finish the order
			String addMoreResponse = "";
			while (!addMoreResponse.equalsIgnoreCase("Y") && !addMoreResponse.equalsIgnoreCase("N")) {
				try {
					System.out.println("\nAdd more products? (Y/N)");
					addMoreResponse = scanner.nextLine();

					if (addMoreResponse.equalsIgnoreCase("N")) {
						addMoreProducts = false;
					}

				} catch (Exception e) {
					scanner.nextLine();
				}
			}
		}
		scanner.close();

		// addOrder()
		System.out.println("Order added!");

	}

	// Test static methods
	public static void addProductDetails() {
		// call ItemOrder's setDetails()
	}

	public static void readOrder() {
		// print Order's items
	}

	public static void printResults() {
		// call printOrder()
		// call bestShipping
	}

}
