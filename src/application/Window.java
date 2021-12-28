package application;

public class Window {
	private String[] colorOptions = {"Green", "Black", "Blue", "White"};
	private String windowColor = colorOptions[0];
	private String[] sizeOptions = {"Default", "Maximize", "Minimize"};
	private String windowSize = sizeOptions[0];
	
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
	
	public String[] getSizeOptions() {
		return sizeOptions;
	}
	
	public String getWindowSize() {
		return windowSize;
	}
	
	public String setWindowSize(int selectedWindowSize) {
		this.windowSize = sizeOptions[selectedWindowSize];
		return windowSize;
	}
}
