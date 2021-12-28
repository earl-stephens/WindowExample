package test;

import org.junit.Assert;
import org.junit.Test;

import application.Window;

public class WindowTest {
	@Test
	public void shouldReturnAnInstanceOf() {
		Window window1 = new Window();
		Assert.assertNotNull(window1);
	}
	
	@Test
	public void shouldHaveDefaultColorAttributes() {
		Window window1 = new Window();
		String result = window1.getWindowColor();
		String expected = "Green";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void shouldBeAbleToChangeColors() {
		Window window1 = new Window();
		window1.setWindowColor(2);
		String result = window1.getWindowColor();
		Assert.assertEquals("Blue", result);
	}
	
	@Test
	public void shouldReturnColorOptions() {
		Window window1 = new Window();
		String[] expected = {"Green", "Black", "Blue", "White"};
		String[] result = window1.getColorOptions();
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void shouldReturnSizeOptions() {
		Window window1 = new Window();
		String[] expected = {"Default", "Maximize", "Minimize"};
		String result[] = window1.getSizeOptions();
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void shouldHaveDefaultSize() {
		Window window1 = new Window();
		String result = window1.getWindowSize();
		String expected = "Default";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void shouldBeAbleToSelectSize() {
		Window window1 = new Window();
		window1.setWindowSize(1);
		String expected = "Maximize";
		String result = window1.getWindowSize();
		Assert.assertEquals(expected, result);
	}
}
