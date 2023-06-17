package items;

import java.util.ArrayList;
import java.util.Arrays;

public class Laptop extends Item{
	
	public Laptop(){
		// Laptop Size: 0.6 x 0.5 x 0.5 m
		// Laptop Weight: 6.5 kg
		super("Laptop", new ArrayList<Double>(Arrays.asList(0.6, 0.5, 0.5)), 6.5);
	}
	
}
