package win.ePen.Scripts;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.RegionsPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Regions extends Epen_BaseClass{
	
	@Test
	public void Scripts_Regions() throws InterruptedException, Exception {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setRegions();
		
		//Add New Region
		RegionsPage rp = new RegionsPage(driver);
		rp.getRefresh().click();
		rp.getAdd().click();
		
		Actions action= new Actions(driver);
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("Regions");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			
			rp.getCode().sendKeys(code);
			rp.getTitle().sendKeys(title);
			
			rp.getExamination().click();
			rp.getSelected_Examination().click();
			rp.getSave().click();
			rp.getOk().click();
			rp.getRefresh().click();
		}
		
		//Edit Regions
		action.doubleClick(rp.getEditRegions()).perform();
		rp.getTitle().sendKeys("Regions Details are Edited");
		rp.getSave().click();
		rp.getOk().click();
		rp.getRefresh().click();
		
		//Delete Regions
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("Regions");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			rp.getSearchBar().sendKeys(code);
			rp.getCheckbox().click();
			rp.getDelete().click();
			rp.getSearchBar().clear();
			rp.getRefresh().click();
			
			Thread.sleep(2000);
			rp.getClose().click();
			rp.getWindowClose().click();
		}
		
	}

}
