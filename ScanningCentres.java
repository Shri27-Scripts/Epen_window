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
import win.ePen.pom.ScanningCentersPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ScanningCentres extends Epen_BaseClass{
	
	@Test
	public void Scripts_ScanningCentres() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setScanningCentres();
		
		//Add new Scanning Centre
		ScanningCentersPage scp = new ScanningCentersPage(driver);
		scp.getRefresh().click();
		scp.getAdd().click();
		
		Actions action= new Actions(driver);
		
				FileInputStream fis = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
				try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
					Sheet sheet= wb.getSheet("ScanningCentres");
					String code = sheet.getRow(1).getCell(0).getStringCellValue();
					String title = sheet.getRow(1).getCell(1).getStringCellValue();
					
					scp.getCode().sendKeys(code);
					scp.getTitle().sendKeys(title);
					scp.getExamination().click();
					scp.getSelected_Examination().click();
					scp.getSave().click();
					scp.getOk().click();
					scp.getRefresh().click();
				}
				
				//Edit Scanning Centres
				action.doubleClick(scp.getEdit_ScanningCentres()).perform();
				scp.getTitle().sendKeys("Scanning Centre Edited");
				scp.getSave().click();
				scp.getOk().click();
				scp.getRefresh().click();
				
				//Delete Scanning Centres
				FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
				try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
					Sheet sheet= wb.getSheet("ScanningCentres");
					String code = sheet.getRow(1).getCell(0).getStringCellValue();
					
					scp.getSearchBar().sendKeys(code);
					scp.getCheckbox().click();
					scp.getDelete().click();
					scp.getSearchBar().clear();
					scp.getRefresh().click();
					
					Thread.sleep(2000);
					scp.getClose().click();
					scp.getWindowClose().click();
				}
	}
}
