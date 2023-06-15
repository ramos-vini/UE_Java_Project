package Items;

import java.util.ArrayList;
import java.util.Arrays;

public class Mouse extends Item{

	public Mouse(){
		// Mouse Size: 0.3 x 0.3 x 0.2 m
		// Mouse Weight: 0.2 kg
		super("Mouse", new ArrayList<Double>(Arrays.asList(0.3, 0.3, 0.2)), 0.2);
	}
	
}
