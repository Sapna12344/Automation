package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Asus/Desktop/selenium/frame1.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Sapna");
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("Sapna@123");
		driver.quit();
		

	}

}
