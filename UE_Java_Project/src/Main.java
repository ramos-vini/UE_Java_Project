import Items.*;

public class Main {

	public static void main(String[] args) {
		Laptop myLaptop = new Laptop();
		Mouse myMouse = new Mouse();
		Desktop myDesktop = new Desktop();
		LcdScreen myLcdScreen = new LcdScreen();
		
		myLaptop.printInfo();
		System.out.println();
		myMouse.printInfo();
		System.out.println();
		myDesktop.printInfo();
		System.out.println();
		myLcdScreen.printInfo();
	}

}
