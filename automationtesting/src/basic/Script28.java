package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script28 {

	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
//		Thread.sleep(2000);
//		driver.findElement(By.id("browserButton3")).click();
//		Set<String> wins=driver.getWindowHandles();
//		int count=wins.size();                   	    	
//		System.out.println(count);
		
	}

}
