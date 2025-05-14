package win.ePen.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import win.ePen.pom.LoginPage;

public class Epen_BaseClass {
	
public static WiniumDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException, URISyntaxException, MalformedURLException {
		Reporter.log("open Window", true);
		
		DesktopOptions options= new DesktopOptions();
		options.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Avia Technologies\\ePen Admin.lnk");
		
		URI serverUri= new URI("http://localhost:9999");
		URL serverUrl= serverUri.toURL();
		
		driver= new WiniumDriver(serverUrl, options);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("close Window", true);
	}
	
	@BeforeMethod
	public void Login() throws IOException  {
		Reporter.log("login", true);
		
		FileInputStream fis= new FileInputStream("./Epen_Credentials/Epen_Data.xlsx");
		try (Workbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet = wb.getSheet("Epen_Data");
			String UserId = sheet.getRow(1).getCell(1).getStringCellValue();
			String PassId = sheet.getRow(2).getCell(1).getStringCellValue();
			
			LoginPage lp= new LoginPage(driver);
			lp.setLogin(UserId, PassId);
		}
		
	}
	
	@AfterMethod
	public void Logout() {
		Reporter.log("Close Page", true);
	}

}
