package items;

import java.util.ArrayList;
import java.util.Arrays;

public class LcdScreen extends Item{

	public LcdScreen(){
		// LcdScreen Size: 1.2 x 1.4 x 0.8 m
		// LcdScreen Weight: 2.6 kg
		super("LCD Screen", new ArrayList<Double>(Arrays.asList(1.2, 1.4, 0.8)), 2.6);
	}
	
}
