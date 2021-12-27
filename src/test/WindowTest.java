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
	
}
