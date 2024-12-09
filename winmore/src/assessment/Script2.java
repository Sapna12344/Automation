package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		usn.sendKeys("admin");
		WebElement psw=driver.findElement(By.id("pass"));
		psw.sendKeys("Admin@123");
		driver.navigate().refresh();
		usn.sendKeys("admin");
		psw.sendKeys("Admin@123");
	}
}
