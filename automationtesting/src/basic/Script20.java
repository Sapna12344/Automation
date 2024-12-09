package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement dd = driver.findElement(By.xpath("//section[.='Dropdown']"));
		WebElement dm = driver.findElement(By.xpath("//a[.='Multi Select']"));
		WebElement dc = driver.findElement(By.xpath("//option[.='Running Shoes']"));
		WebElement dm1 = driver.findElement(By.xpath("//button[.='Add']"));
		dm1.click();
		
		


		
	}

}
