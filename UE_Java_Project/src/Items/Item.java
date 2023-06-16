package Items;

import java.util.ArrayList;

public abstract class Item {
	// Type
	private String type;

	// Size (m)
	private ArrayList<Double> size; // 3D Size

	// Weight (kg)
	private Double weight;

	// Constructor 
	Item(String type, ArrayList<Double> size, Double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	// Getters & Setters
	public String getType() {
		return type;
	}

	public void setSize(String type) {
		this.type = type;
	}

	public ArrayList<Double> getSize() {
		return size;
	}

	public void setSize(ArrayList<Double> size) {
		this.size = size;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	// Methods
	public Double calculateVolume() {
		Double volume = 1.0;

		for (Double dimension : size) {
			volume *= dimension;
		}

		return volume; // (m^3)
	}

	public void printInfo() {
		System.out.println("Type: " + this.getType());
		System.out.println("Size: " + this.getSize().toString().replaceAll(",", " x").replaceAll("[\\[\\]]", "") + " (m)");
		System.out.println("Weight: " + this.getWeight() + " (kg)");
	}
}
