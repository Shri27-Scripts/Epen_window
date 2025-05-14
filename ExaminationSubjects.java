package win.ePen.Scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import win.ePen.generic.Epen_BaseClass;
import win.ePen.pom.DashboardPage;
import win.ePen.pom.ExaminationSubjectsPage;

@Listeners(win.ePen.generic.ListnerClass.class)

public class ExaminationSubjects extends Epen_BaseClass{
	
	@Test
	public void Scripts_ExaminationSubjects() throws InterruptedException {
		
		Thread.sleep(2000);
		DashboardPage dp= new DashboardPage(driver);
		dp.setExamination_Module();
		dp.setExaminationSubjects();
		
		ExaminationSubjectsPage esp = new ExaminationSubjectsPage(driver);
		esp.getDropdown().click();
		esp.getSelected_Examination().click();
		esp.getLoad().click();
		esp.getSave().click();
		esp.getOk().click();
		
		esp.getClose().click();
		Thread.sleep(2000);
	}

}
