package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;


public class Script21 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.name("email"));
		usn.sendKeys("Sapna");
		WebElement psw=driver.findElement(By.name("pass"));
		psw.sendKeys("sapna@123");
		WebElement btn=driver.findElement(By.name("login"));
		btn.click();
		
		
		
	

	}

}
