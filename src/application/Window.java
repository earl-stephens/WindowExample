package application;

public class Window {
	private String[] colorOptions = {"Green", "Black", "Blue", "White"};
	private String windowColor = colorOptions[0];
	
	public String getWindowColor() {
		return windowColor;
	}
	
	public String setWindowColor(int colorOption) {
		windowColor = colorOptions[colorOption];
		return windowColor;
	}
	
	public String[] getColorOptions() {
		return colorOptions;
	}
}
