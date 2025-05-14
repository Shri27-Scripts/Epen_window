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
import win.ePen.pom.ValuationCentresPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ValuationCentres extends Epen_BaseClass{
	
	@Test
	public void Scripts_ValuationCentres() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setValuationCentres();
		
		//Add New Valuation Centre
		ValuationCentresPage vcp = new ValuationCentresPage(driver);
		vcp.getRefresh().click();
		vcp.getAdd().click();
		
		Actions action= new Actions(driver);
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("ValuationCentres");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			
			vcp.getCode().sendKeys(code);
			vcp.getTitle().sendKeys(title);
			vcp.getExamination().click();
			vcp.getSelected_Examination().click();
			vcp.getSave().click();
			vcp.getOk().click();
			vcp.getRefresh().click();
		}
		
		//Edit New Valuation Centre
		action.doubleClick(vcp.getEdit_ValuationCentre()).perform();
		vcp.getTitle().sendKeys("Valuation Centre Edited");
		vcp.getSave().click();
		vcp.getOk().click();
		vcp.getRefresh().click();
		
		//Delete Valuation Centre
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("ValuationCentres");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			vcp.getSearchBar().sendKeys(code);
			vcp.getCheckbox().click();
			vcp.getDelete().click();
			vcp.getSearchBar().clear();
			vcp.getRefresh().click();
			
			Thread.sleep(2000);
			vcp.getClose().click();
			vcp.getWindowClose().click();
		}
		
	}

}
