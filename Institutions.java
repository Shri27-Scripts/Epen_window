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
import win.ePen.pom.InstitutionPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Institutions extends Epen_BaseClass{
	
	@Test
	public void Scripts_Institution() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setInstitution();
		
		//Add new Institution
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("Institutions");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			String report_title = sheet.getRow(1).getCell(2).getStringCellValue();
			
			InstitutionPage ip= new InstitutionPage(driver);
			ip.getRefresh().click();
			
			ip.getAdd().click();
			ip.getCode().sendKeys(code);
			ip.getTitle().sendKeys(title);
			ip.getReportTitle().sendKeys(report_title);
			
			Actions action= new Actions(driver);
			action.doubleClick(ip.getLogo()).perform();
			//action.click(ip.getDesktop()).perform();
			//action.doubleClick(ip.getSample_Data()).perform();
			
			ip.getLogo_path().click();
			ip.getOpen().click();
			ip.getSave().click();
			ip.getOk().click();
			ip.getRefresh().click();
		}
		
		InstitutionPage ip= new InstitutionPage(driver);
		//Edit Operation
		Actions action= new Actions(driver);
		 action.doubleClick(ip.getEditInstitute()).perform();
			ip.getTitle().sendKeys("Indian Institute of Medical Technology, Bengaluru");
			ip.getReportTitle().sendKeys("IIMT University_0023");
			
			action.doubleClick(ip.getLogo()).perform();
			ip.getNewLogo_path().click();
			ip.getOpen().click();
			ip.getSave().click();
			ip.getOk().click();
			ip.getRefresh().click();
		
		//Delete operation
			FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
			try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
				Sheet sheet= wb.getSheet("Institutions");
				String code = sheet.getRow(1).getCell(0).getStringCellValue();
			ip.getSearchBar().sendKeys(code);
		ip.getCheckbox().click();
		ip.getDelete().click();
		ip.getSearchBar().clear();
		//ip.getOk().click();
		ip.getRefresh().click();
		
		ip.getClose().click();
		Thread.sleep(3000);
		ip.getWindowClose().click();
			}
	}

}
