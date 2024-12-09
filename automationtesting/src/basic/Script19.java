package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script19 {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Asus/Desktop/selenium/Script21.html");
		WebElement dd = driver.findElement(By.id("Celebrities"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("k");
			Thread.sleep(2000);
			s.selectByVisibleText("Samantha");
			Thread.sleep(2000);
            s.deselectAll();
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("k");
			Thread.sleep(2000);
			s.deselectByVisibleText("Samantha");
			
		}
		else
		{
			System.out.println("the dropdown is singleselect");
		}
		
		Thread.sleep(2000);
		driver.quit();
		



	}

}
