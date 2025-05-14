package win.ePen.Scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.ExaminationCoursesPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ExaminationCourses extends Epen_BaseClass{
	
	@Test
	public void Scripts_ExaminationCourses() throws InterruptedException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setExaminationCourses();
		
		ExaminationCoursesPage ecp = new ExaminationCoursesPage(driver);
		ecp.getDropdown().click();
		ecp.getSelected_Examination().click();
		ecp.getLoad().click();
		ecp.getSave().click();
		ecp.getOk().click();
		
		ecp.getClose().click();
		Thread.sleep(2000);
	}

}
