package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/selenium/Script1.html");
		WebElement ele=driver.findElement(By.id("t1"));
		ele.sendKeys("Chandamma");
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.name("n1"));
		ele1.sendKeys("sapna@123");
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.className("c1"));
		ele2.sendKeys("sapna@123");
		Thread.sleep(2000);
		
		ele.clear();
		Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.linkText("Instagram 2024"));
		ele3.click();
		
		Thread.sleep(2000);
		
		
		
	

	}

}