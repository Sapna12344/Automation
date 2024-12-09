package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Script1 

{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(1);
		String val = cel.getStringCellValue();
		System.out.println(val);
		 
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.xpath("//input[@id='email']"));
		usn.sendKeys("Sapna");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("Sapna@2002");
		WebElement login = driver.findElement(By.xpath("input[@name='login']"));
		login.click();
		
		
		
		
		
	}
}
