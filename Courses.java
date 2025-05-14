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
import win.ePen.pom.CoursePage;
import win.ePen.pom.DashboardPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class Courses extends Epen_BaseClass{
	
	@Test
	public void Script_Courses() throws InterruptedException, IOException, Exception {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setCourses(); 
		
		//Add new Course
		CoursePage cp= new CoursePage(driver);
		cp.getRefresh().click();
		cp.getAdd().click();
		
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		
		FileInputStream fis = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			Sheet sheet= wb.getSheet("Courses");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			String title = sheet.getRow(1).getCell(1).getStringCellValue();
			String display_title = sheet.getRow(1).getCell(2).getStringCellValue();
			double total_subjects = sheet.getRow(1).getCell(3).getNumericCellValue();
			String NoOf_subjects = Double.toString(total_subjects);
		
		cp.getCode().sendKeys(code);
		cp.getTitle().sendKeys(title);
		cp.getDisplayTitle().sendKeys(display_title);
		cp.getTotalNoOfSubjects().sendKeys(NoOf_subjects);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		action.click(cp.getCurrentStatus()).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		cp.getInstitute().click();
		cp.getSelected_Institute().click();
		
		cp.getSave().click();
		cp.getOk().click();
		cp.getRefresh().click();
		}
		
		//Edit Courses
		action.doubleClick(cp.getEditCourse()).perform();
		
		cp.getTitle().sendKeys("Bachelors Of Commerse");
		cp.getDisplayTitle().sendKeys("UG\\SEM02\\Commerse_part01");
		cp.getTotalNoOfSubjects().sendKeys("20");
		cp.getSave().click();
		cp.getOk().click();
		cp.getRefresh().click();
		
		//Delete Courses
		FileInputStream fis01 = new FileInputStream("./Epen_Credentials/Epem_DashBoard-Inputs.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fis01)) {
			Sheet sheet= wb.getSheet("Courses");
			String code = sheet.getRow(1).getCell(0).getStringCellValue();
			
			cp.getSearchBar().sendKeys(code);
		cp.getCheckbox().click();
		cp.getDelete().click();
		cp.getSearchBar().clear();
		//cp.getOk().click();
		cp.getRefresh().click();
		cp.getClose().click();
		Thread.sleep(2000);
		cp.getWindowClose().click();
		}
	}

}
