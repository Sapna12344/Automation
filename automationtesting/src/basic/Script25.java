package basic;

import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class Script25 
{
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//input[@class='form-control custom-form-control-search left originState txtOriginGeneral']"));
		from.click();
		
		WebElement s1=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		Thread.sleep(1000);
		s1.click();
		
	    WebElement s2=driver.findElement(By.xpath("//input[@id='txtDestinationGeneral']"));
		Thread.sleep(1000);
	    s2.click();
	    
	    WebElement s3=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		Thread.sleep(1000);
	    s3.click();
	    
	    WebElement s4=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	    s4.click();
	    
	    WebElement s5=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[20]"));
	    s5.click();
	    
	    WebElement s6=driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']"));
	    s6.click();
	    
	    WebElement s7=driver.findElement(By.xpath("(//div[@class='trip-item trip-item-lg'])[1]"));
	    Thread.sleep(1000);
	    s7.click();
	    
	    WebElement s8=driver.findElement(By.xpath("(//button[@class='btn btn-orange mt-2 selectseatbutton'])[1]"));
	    Thread.sleep(1000);
	    s8.click();
	    
	    WebElement s9=driver.findElement(By.xpath("//small[.='9C']"));
	    Thread.sleep(1000);
	    s9.click();
  
//	    WebElement s10=driver.findElement(By.xpath("(//div[@class='trip-item trip-item-lg'])[1]"));
//	    Thread.sleep(1000);
//	    s10.click();
//	    WebElement s11=driver.findElement(By.xpath("(//div[@class='trip-item trip-item-lg'])[1]"));
//	    Thread.sleep(1000);
//	    s11.click();
//	    WebElement s12=driver.findElement(By.xpath("(//div[@class='trip-item trip-item-lg'])[1]"));
//	    Thread.sleep(1000);
//	    s12.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    driver.findElement(By.xpath("//small[.='28']")).click();
//	    driver.findElement(By.xpath("//small[.='25']")).click();
//	    driver.findElement(By.xpath("//small[.='29']")).click();
//	    driver.findElement(By.xpath("//small[.='26']")).click();
//	    driver.findElement(By.xpath("//small[.='23']")).click();
//	    driver.findElement(By.xpath("//small[.='20']")).click();
	    
	    
		Thread.sleep(2000);
		driver.quit();
		
	}
}
