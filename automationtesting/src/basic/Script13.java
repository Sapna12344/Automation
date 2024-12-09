package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement us = driver.findElement(By.id("email"));
		String val = us.getCssValue("background-color");
		System.out.println(val);
		
		String fontfamily=us.getCssValue("font-family");
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.name("login"));
		
		String txt=btn.getText();
		System.out.println(txt);
		driver.quit();


	}

}
