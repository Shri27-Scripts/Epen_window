package win.ePen.Scripts;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.ValuationSessionPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ValuationSessions extends Epen_BaseClass{
	
	@Test
	public void Scripts_ValuationSessions() throws InterruptedException, Exception {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setValuationSession();
		
		//Add New ValuationSession
		ValuationSessionPage vsp = new ValuationSessionPage(driver);
		vsp.getRefresh().click();
		vsp.getAdd().click();
		
		Actions action= new Actions(driver);
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("ValuationSession");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			
			vsp.getCode().sendKeys(code);
			vsp.getTitle().sendKeys(title);
			vsp.getSpinUpButton().click();
			vsp.getSpinUpButton().click();
			vsp.getEndTime().sendKeys("4");
			
			vsp.getExamination().click();
			vsp.getSelected_Examination().click();
			vsp.getSave().click();
			vsp.getOk().click();
			vsp.getRefresh().click();
		}
		
		//Edit ValuationSession
		action.doubleClick(vsp.getEditValuationSession()).perform();
		vsp.getTitle().sendKeys("Valuation Session Edited");
		vsp.getSave().click();
		vsp.getOk().click();
		vsp.getRefresh().click();
		
		//Delete ValuationSession
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("ValuationSession");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			vsp.getSearchBar().sendKeys(code);
			vsp.getCheckbox().click();
			vsp.getDelete().click();
			vsp.getSearchBar().clear();
			vsp.getRefresh().click();
			
			Thread.sleep(2000);
			vsp.getClose().click();
			vsp.getWindowClose().click();
		}
	}

}
