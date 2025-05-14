package win.ePen.Scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.ValuationTypesPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ValuationTypes extends Epen_BaseClass{
	
	@Test
	public void Scripts_ValuationTypes() throws InterruptedException, IOException, Exception {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setValuationTypes();
		
		//Add New Valuation Type
		ValuationTypesPage vtp = new ValuationTypesPage(driver);
		vtp.getRefresh().click();
		vtp.getAdd().click();
		
		Actions action= new Actions(driver);
		Robot robot = new Robot();
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("ValuationTypes");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			
			vtp.getCode().sendKeys(code);
			vtp.getTitle().sendKeys(title);
			
			action.click(vtp.getProcessType()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			vtp.getExamination().click();
			vtp.getSelected_Examination().click();
			vtp.getSave().click();
			vtp.getOk().click();
			vtp.getRefresh().click();
		}
		
		//Edit Valuation Type
		action.doubleClick(vtp.getEdit_ValuationType()).perform();
		vtp.getTitle().sendKeys("Valuation Types Edited");
		vtp.getSave().click();
		vtp.getOk().click();
		vtp.getRefresh().click();
		
		//Delete valuation Type
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epen_Examination-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("ValuationTypes");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			vtp.getSearchBar().sendKeys(code);
			vtp.getCheckbox().click();
			vtp.getDelete().click();
			vtp.getSearchBar().clear();
			vtp.getRefresh().click();
			
			Thread.sleep(2000);
			vtp.getClose().click();
			vtp.getWindowClose().click();
		}
		
	}

}
