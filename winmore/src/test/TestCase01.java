package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase01 extends GenericScript
{
	@Test
	public void usn()
	{
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(displayed+" "+enabled);
		
	}

}