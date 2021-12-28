package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/* Coding challenge
		 * Create a desktop window class, with attributes and methods.
		 * Use get and set methods.
		 */
		
		/* ideas 
		 * attributes: size, color, position
		 * methods: change color, minimize/maximize, reposition
		 */
		
		Window window1 = new Window();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter one of the numbers below to select that window color: ");
		String[] colorOptions = window1.getColorOptions();
		for(int i = 0; i < colorOptions.length; i++) {
			System.out.printf(" %d. %s\n", (i+1), colorOptions[i]);
		}

		int userInput = scanner.nextInt();

		window1.setWindowColor(userInput - 1);
		String newColor = window1.getWindowColor();
		System.out.println("The new window color is " + newColor);
		
		
		System.out.println("Enter one of the numbers below to select the window size: ");
		String[] sizeOptions = window1.getSizeOptions();
		for(int i = 0; i < sizeOptions.length; i++) {
			System.out.printf(" %d. %s\n", (i + 1), sizeOptions[i]);
		}
		
		
		int selectedSize = scanner.nextInt();
		window1.setWindowSize(selectedSize -1);
		System.out.println("The window size is now: " + window1.getWindowSize());
		
		scanner.close();
	}
}
