package win.ePen.Scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.IdentityCardTypesPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class IdentityCardTypes extends Epen_BaseClass{
	
	@Test
	public void Scripts_IDCards() throws InterruptedException, IOException, Exception {
		
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver);
		dp.setIdentityCardTypes();
		
		IdentityCardTypesPage icp = new IdentityCardTypesPage(driver);
		icp.getRefresh().click();
		icp.getAdd().click();
		
		//Add New Identity Card
		Actions action = new Actions(driver);
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet = wb.getSheet("IdentityCardTypes");
			
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			
			icp.getCode().sendKeys(code);
			icp.getTitle().sendKeys(title);
			
			icp.getInstitute().click();
			icp.getSelected_Institute().click();
			icp.getSave().click();
			icp.getOk().click();
			icp.getRefresh().click(); 
		}
		
		//Edit Identity Cards
		action.doubleClick(icp.getEdit_IdentityCrads()).perform();
		icp.getTitle().sendKeys("Identity details Edited");
		icp.getSave().click();
		icp.getOk().click();
		icp.getRefresh().click();
		
		//Delete Idntity Cards
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet = wb.getSheet("IdentityCardTypes");
			
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			icp.getSearchBar().sendKeys(code);
			icp.getCheckbox().click();
			icp.getDelete().click();
			icp.getSearchBar().clear();
			icp.getRefresh().click();
			Thread.sleep(2000);
			icp.getClose().click();
			icp.getWindowClose().click();
		}
		
	}

}
