package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(id="login")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterusn()
	{
		usn.sendKeys("admin");
	}
	public void enterpsw()
	{
		psw.sendKeys("admin@123");
	}
	public void clickLogin()
	{
		login.click();
	}
	

}
