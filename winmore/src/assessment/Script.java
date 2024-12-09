package assessment;

import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class Script 
{
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//input[@type='text']"));
		from.click();
		
		WebElement s1=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		Thread.sleep(2000);
		s1.click();
	    WebElement s2=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
	    Thread.sleep(2000);
	    s2.click();
	    WebElement s3=driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
	    Thread.sleep(2000);
	    s3.click();
	    WebElement s4=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[20]"));
	    Thread.sleep(2000);
	    s4.click();
	    WebElement s5=driver.findElement(By.xpath("//input[@type='button']"));
	    Thread.sleep(2000);
	    s5.click();
	    WebElement s6=driver.findElement(By.xpath("//td[@style='padding-left: 10px; padding-bottom: 4px;']"));
	    Thread.sleep(2000);
	    s6.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		Thread.sleep(2000);
		driver.quit();
		
	}
}
