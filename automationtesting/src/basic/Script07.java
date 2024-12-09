package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script07 {
	

		public static void main(String[] args) throws InterruptedException
		{
			
			
			System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
			
			WebElement se = driver.findElement(By.cssSelector("input[id='search']"));
			se.sendKeys("songs");
			Thread.sleep(2000);
			
			WebElement search = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
			Thread.sleep(2000);
			search.click();
			
			Thread.sleep(4000);
			driver.quit();
			
         }   
}