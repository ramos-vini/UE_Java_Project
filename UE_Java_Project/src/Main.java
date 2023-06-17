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
		ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList("Desktop", "Laptop", "LCD Screen", "Mouse"));
		Integer orderId = 1;
		Integer item;
		
		System.out.println(" ____________________ ");
		for(int i = 0; i < itemsList.size(); i++) {
			System.out.printf("| " + (i+1) + "  -  %-12s%2s\n", itemsList.get(i), "|");
			System.out.println("|____________________|");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the number of the item: ");
		

	}
	
	// Test static methods
	public static void addProductDetails() {
		
	}
	
	public static void readOrder() {
		
	}
	
	public static void printResults() {
		
	}

}
