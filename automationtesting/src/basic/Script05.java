package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/selenium/Script05.html");
		
		WebElement email = driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		email.sendKeys("Sapna123@gmail.com");
		
		WebElement pwd = driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		pwd.sendKeys("Sapna@123");
		
		WebElement rb = driver.findElement(By.cssSelector("input[type='radio']"));
		Thread.sleep(2000);
		rb.click();
		
		WebElement link = driver.findElement(By.cssSelector("a[href='https://www.youtube.com/']"));
		Thread.sleep(2000);
		link.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
