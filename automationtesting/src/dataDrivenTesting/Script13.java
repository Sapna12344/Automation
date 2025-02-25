package dataDrivenTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@id='buttonAlert2']"));
		ele.click();
		Alert popup=driver.switchTo().alert();
		popup.sendKeys("yes");
		
		String msg=popup.getText();
		System.out.println(msg);
		driver.quit();

	}

}
