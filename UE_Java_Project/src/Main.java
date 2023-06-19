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
		
		// Order creation
		Order order = new Order();

		// Item Input
		Boolean addMoreProducts = true;
		
		while (addMoreProducts == true) {

			Scanner scanner = new Scanner(System.in);

			// Type
			Integer item = 0;

			while (item < 1 || item > itemsList.size()) {
				try {
					System.out.println("\nEnter the number of the item (1-" + itemsList.size() + "): ");
					item = scanner.nextInt();
				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			// Quantity
			Integer quantity = 0;

			while (quantity < 1) {
				try {
					System.out.println("\nEnter the quantity of the item: ");
					quantity = scanner.nextInt();
				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			// addItems()

			// Add more products or Finish the Order
			String addMoreResponse = "";
			while (addMoreResponse != "Y" || addMoreResponse != "N") {
				try {
					System.out.println("\nAdd more products? (Y/N)");
					addMoreResponse = (scanner.nextLine()).toUpperCase();
					
					if(addMoreResponse == "N") {
						addMoreProducts = false;
					}
					
				} catch (Exception e) {
					scanner.nextLine();
				}
			}

			scanner.close();
		}
		
		// addOrder()
	}

	// Test static methods
	public static void addProductDetails() {

	}

	public static void readOrder() {

	}

	public static void printResults() {

	}

}
