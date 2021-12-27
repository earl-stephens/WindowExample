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
		System.out.println("Enter one of the numbers below to select that window color: ");
		String[] colorOptions = window1.getColorOptions();
		for(int i = 0; i < colorOptions.length; i++) {
			System.out.printf(" %d. %s\n", (i+1), colorOptions[i]);
		}
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		scanner.close();
		window1.setWindowColor(userInput - 1);
		String newColor = window1.getWindowColor();
		System.out.println("The new window color is " + newColor);
	}
}
