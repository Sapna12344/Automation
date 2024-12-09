package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Asus/Desktop/selenium/link.html");
		WebElement usn = driver.findElement(By.xpath("//input[@class='c1']"));
		JavascriptExecutor is=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		is.executeScript("arguments[0].value=' '",usn);

	}

}
