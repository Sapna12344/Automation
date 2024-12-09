package dataDrivenTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.compress.utils.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script5 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement dropdown = driver.findElement(By.id("month"));
		Select s=new Select(dropdown);
		List<WebElement> opts=s.getOptions();
		int optscount=opts.size();
		System.out.println(optscount);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<optscount;i++)
		{
			WebElement opt = opts.get(i);
			String txt=opt.getText();
			arr.add(txt);
			System.out.println(txt);
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
