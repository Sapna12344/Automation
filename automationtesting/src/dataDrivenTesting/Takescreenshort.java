import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Takescreenshort {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement usn=driver.findElement(By.id("email"));
	File temp=usn.getScreenshotAs(OutputType.FILE);
	File perm=new File("./screenshort/Elemement.png");
	FileHandler.copy(temp, perm);
	
	
		Thread.sleep(2000);
driver.quit();
	}
	
	
}