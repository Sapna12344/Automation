package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script26 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone11");
		WebElement s2=driver.findElement(By.xpath("//button[@class='MJG8Up']"));
		s2.click();
//		WebElement s1=driver.findElement(By.xpath("//img[@class='DByuf4']"));
//		s1.click();
		
	}

}
