package items;

import java.util.ArrayList;
import java.util.Arrays;

public class Desktop extends Item{

	public Desktop(){
		// Desktop Size: 1.0 x 1.5 x 0.5 m
		// Desktop Weight: 20.0 kg
		super("Desktop", new ArrayList<Double>(Arrays.asList(1.0, 1.5, 0.5)), 20.0);
	}
	
}
