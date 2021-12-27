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
	
}
