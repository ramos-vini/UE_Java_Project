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
		// Item available
		ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList("Desktop", "Laptop", "LCD Screen", "Mouse"));

		System.out.println(" ____________________ ");
		for (int i = 0; i < itemsList.size(); i++) {
			System.out.printf("| " + (i + 1) + "  -  %-12s%2s\n", itemsList.get(i), "|");
			System.out.println("|____________________|");
		}

		// Calculation Object
		Calculation calc = new Calculation();

		// Order creation
		ArrayList<Product> order = new ArrayList<Product>();

		// Item Input
		Scanner scanner = new Scanner(System.in);

		Boolean addMoreProducts = true;

		while (addMoreProducts == true) {
			// Type
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

			// Quantity
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

			// addItems()
			Product product = null;

			switch (item) {
			case 1:
				product = new Product(new Desktop(), quantity);
				break;

			case 2:
				product = new Product(new Laptop(), quantity);
				break;

			case 3:
				product = new Product(new LcdScreen(), quantity);
				break;

			case 4:
				product = new Product(new Mouse(), quantity);
				break;

			default:
				break;
			}

			calc.addItems(product, order);

			// Add more products or Finish the Order
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
		System.out.println(order.get(0).getItem().getType());
		System.out.println(order.get(0).getQuantity());
		System.out.println("Order added!");
	}

	// Test static methods
	public static void addProductDetails() {

	}

	public static void readOrder() {

	}

	public static void printResults() {

	}

}
