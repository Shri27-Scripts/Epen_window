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
import win.ePen.pom.SubjectsPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Subjects extends Epen_BaseClass{
	
	@Test
	public void Scripts_Subjects() throws InterruptedException, IOException, Exception {
		
		DashboardPage dp= new DashboardPage(driver);
		Thread.sleep(2000);
		dp.setSubjects();
		
		SubjectsPage sp= new SubjectsPage(driver);
		sp.getRefresh().click();
		sp.getAdd().click();
		
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		
		//Add new Subject
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("Subjects");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String display_code = sheet.getRow(1).getCell(1).getStringCellValue();
			String title = sheet.getRow(1).getCell(2).getStringCellValue();
			String display_title = sheet.getRow(1).getCell(3).getStringCellValue();
			
			sp.getCode().sendKeys(code);
			sp.getDisplayCode().sendKeys(display_code);
			sp.getTitle().sendKeys(title);
			sp.getDisplayTitle().sendKeys(display_title);
			
			action.click(sp.getCurrentStatus()).build().perform();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			sp.getInstitute().click();
			sp.getSelected_Institute().click();
			
			sp.getSave().click();
			sp.getOk().click();
			sp.getRefresh().click();
		}
		//Edit Subject
		action.doubleClick(sp.getEditSubject()).perform();
		
		sp.getDisplayCode().sendKeys("Math-0021");
		sp.getTitle().sendKeys("UG\\Mathematics-0021");
		sp.getDisplayTitle().sendKeys("UG\\SEM_02\\Math0021_Exam");
		sp.getInstitute().click();
		sp.getSelected_Institute().click();
		sp.getSave().click();
		sp.getOk().click();
		sp.getRefresh().click();
		
		//Delete subject
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("Subjects");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			sp.getSearchBar().sendKeys(code);
			sp.getCheckbox().click();
			sp.getDelete().click();
			sp.getSearchBar().clear();
			sp.getRefresh().click();
			Thread.sleep(3000);
			sp.getClose().click();
			sp.getWindowClose().click();
		}
	}

}
