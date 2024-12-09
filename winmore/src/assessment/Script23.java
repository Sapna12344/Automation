package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script23 {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Downloads\\geckodriver-v0.35.0-win32 (2)\\geckodriver.exe");
		//C:\Users\Asus\Downloads\geckodriver-v0.35.0-win32 (2)\geckodriver.exe
		
		//C:\Users\Asus\Downloads\chromedriver-win64 (2)\chromedriver-win64\chromedriver
		
		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		//C:\Users\Asus\Downloads\geckodriver-v0.35.0-win32 (2)\geckodriver.exe
//		
//		//C:\Users\Asus\Downloads\chromedriver-win64 (2)\chromedriver-win64\chromedriver
//		
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone11");
		WebElement s2=driver.findElement(By.xpath("//button[@type='submit']"));
		s2.click();
     	WebElement s1=driver.findElement(By.xpath("(//img[@class='DByuf4'])[1]"));
        s1.click();
//        WebElement s3=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']"));
//        s3.click();
        
		driver.close();	
	}

}
