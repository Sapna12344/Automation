package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script15 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement Fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(Fashion).perform();
		


	}

}
