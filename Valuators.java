package win.ePen.Scripts;

import java.awt.AWTException;
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
import win.ePen.pom.ValuatorsPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Valuators extends Epen_BaseClass{
	
	@Test
	public void Scripts_Valuators() throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setValuators();
		
		ValuatorsPage vp= new ValuatorsPage(driver);
		vp.getRefresh().click();
		vp.getAdd().click();
		
		//Add new Valuator
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet = wb.getSheet("Valuators");
			
			String code = sheet.getRow(2).getCell(0).getStringCellValue();
			
			vp.getCode().sendKeys(code);
			vp.getChangePassword().click();
			vp.getCollectIdDetails().click();
			vp.getCollectBankDetails().click();
			vp.getCollectPersonalDetails().click();
			
			action.click(vp.getValuatorType()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			action.click(vp.getStatus()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			vp.getInstitute().click();
			vp.getSelected_Institute().click();
			vp.getSave().click();
			vp.getOk().click();
			vp.getClose().click();
			vp.getRefresh().click();
		}
		
		//Edit Valuators
		action.doubleClick(vp.getEditValuator()).perform();
		vp.getChangePassword().click();
		vp.getCollectPersonalDetails().click();
		action.click(vp.getValuatorType()).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		action.click(vp.getStatus()).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		vp.getSave().click();
		vp.getOk().click();
		vp.getRefresh().click();
		
		//Delete Valuators
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet = wb.getSheet("Valuators");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			vp.getSearchBar().sendKeys(code);
			vp.getCheckbox().click();
			vp.getDelete().click();
			vp.getSearchBar().clear();
			vp.getRefresh().click();
			Thread.sleep(3000);
			vp.getClose().click();
			vp.getWindowClose().click();
		}
		
	}

}
