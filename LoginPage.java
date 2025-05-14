package win.ePen.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//*[@AutomationId='dtxtUserName' and @ClassName='TextEdit']")
	private WebElement Username;
	
	@FindBy(xpath = "//*[@AutomationId='dpwdUserPassword' and @ClassName='PasswordBoxEdit']")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@AutomationId='dlkupServers' and @ClassName='LookUpEdit']")
	private WebElement Server;
	
	@FindBy(name = "ePen.ASC.Server")
	private WebElement Server_01;
	
	@FindBy(xpath = "//*[@Name='Login' and @ClassName='Button']")
	private WebElement Login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String UserId, String PassId) {
		Username.sendKeys(UserId);
		Password.sendKeys(PassId);
		Server.click();
		Server_01.click();
		Login.click();
	}

}
