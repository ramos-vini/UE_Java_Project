package containers;

import java.util.ArrayList;

import items.*;

public abstract class Container {
	    // Type
		private String type;

		// Size (m)
		private ArrayList<Double> size; // 3D Size

		Container(String type, ArrayList<Double> size) {
			this.type = type;
			this.size = size;
		}

		// Getters & Setters
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public ArrayList<Double> getSize() {
			return size;
		}

		public void setSize(ArrayList<Double> size) {
			this.size = size;
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
		}
}
