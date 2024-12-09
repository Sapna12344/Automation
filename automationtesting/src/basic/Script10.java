package basic;

import java.awt.Dimension;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {

	private static final Dimension Dimension = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Dimension dimension = new Dimension();
		driver.manage().window().setSize(dimension);

	}

}
