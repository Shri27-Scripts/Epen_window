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
import win.ePen.pom.ExaminationPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Examinations extends Epen_BaseClass{
	
	@Test
	public void Scripts_Examinations() throws InterruptedException, IOException, Exception {
		
		
		DashboardPage dp= new DashboardPage(driver);
		Thread.sleep(2000);
		dp.setExamination();
		
		//Add new Examination
		ExaminationPage ep= new ExaminationPage(driver);
		ep.getRefresh().click();
		ep.getAdd().click();
		
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet = wb.getSheet("Examinations");
			
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			String display_title = sheet.getRow(1).getCell(2).getStringCellValue();
			String report_title = sheet.getRow(1).getCell(5).getStringCellValue();
			
			ep.getCode().sendKeys(code);
			ep.getTitle().sendKeys(title);
			ep.getDisplayTitle().sendKeys(display_title);
			
			
			action.click(ep.getValuatorMode()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			ep.getReportTitle().sendKeys(report_title);
			Thread.sleep(1000);
			
			action.click(ep.getCurrentStatus()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			ep.getInstitute().click();
			ep.getSelected_Institute().click();
		
			ep.getSave().click();
			ep.getOk().click();
			ep.getRefresh().click();
		}
		
		//Edit Examination
		action.doubleClick(ep.getEditExamination()).perform();
		
		ep.getTitle().sendKeys("UG\\AS_0224\\Examination-0224");
		ep.getDisplayTitle().sendKeys("Exam Test for Testing-0224");
		ep.getReportTitle().sendKeys("Applied_Of_Materials_Exam0224");
		ep.getSave().click();
		ep.getOk().click();
		ep.getRefresh().click();
		
		//Delete Examination
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet = wb.getSheet("Examinations");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			ep.getSearchBar().sendKeys(code);
		ep.getCheckbox().click();
		ep.getDelete().click();
		ep.getSearchBar().clear();
		ep.getRefresh().click();
		//ep.getOk().click();
		
		ep.getClose().click();
		Thread.sleep(3000);
		ep.getWindowClose().click();
		}
	}

}
