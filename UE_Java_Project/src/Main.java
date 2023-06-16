import Items.*;
import Containers.*;

public class Main {

	public static void main(String[] args) {
		SmallContainer mySmallContainer = new SmallContainer();
		
		mySmallContainer.printInfo();
		System.out.println("---------------");
		System.out.println("Volume: " + mySmallContainer.calculateVolume() + " (m^3)");

	}

}
