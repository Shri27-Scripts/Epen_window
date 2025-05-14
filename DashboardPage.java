package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class DashboardPage {
	
	@FindBy(xpath = "//*[@Name='Institutions' and @AutomationId='BarButtonItemLink']")
	private WebElement Institution;
	
	@FindBy(xpath = "//*[@Name='Examinations' and @AutomationId='BarButtonItemLink']")
	private WebElement Examinations;
	
	@FindBy(xpath = "//*[@Name='Courses' and @AutomationId='BarButtonItemLink']")
	private WebElement Courses;
	
	@FindBy(xpath = "//*[@Name='Subjects' and @AutomationId='BarButtonItemLink']")
	private WebElement Subjects;
	
	@FindBy(xpath = "//*[@Name='Valuators' and @ClassName='BarButtonItemLinkControl']")
	private WebElement Valuators;
	
	@FindBy(xpath = "//*[@Name='Identity Card Types' and @AutomationId='BarButtonItemLink']")
	private WebElement IdentityCardTypes;
	
	@FindBy(xpath = "//*[@Name='Examination' and @ClassName='RibbonPageHeaderControl']")
	private WebElement Examination_Module;
	
	@FindBy(xpath = "//*[@Name='Scanning Centres' and @AutomationId='BarButtonItemLink']")
	private WebElement ScanningCentres;
	
	@FindBy(xpath = "//*[@Name='Valuation Centres' and @AutomationId='BarButtonItemLink']")
	private WebElement ValuationCentres;
	
	@FindBy(xpath = "//*[@Name='Valuation Types' and @AutomationId='BarButtonItemLink']")
	private WebElement ValuationTypes;
	
	@FindBy(xpath = "//*[@Name='Regions' and @AutomationId='BarButtonItemLink']")
	private WebElement Regions; 
	
	@FindBy(xpath = "//*[@Name='Valuation Sessions' and @AutomationId='BarButtonItemLink']")
	private WebElement ValuationSession;
	
	@FindBy(xpath = "//*[@Name='Examination Courses' and @AutomationId='BarButtonItemLink']")
	private WebElement ExaminationCourses;
	
	@FindBy(xpath = "//*[@Name='Examination Subjects' and @AutomationId='BarButtonItemLink']")
	private WebElement ExaminationSubjects;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public DashboardPage(WiniumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setInstitution() {
		Institution.click();
	}
	public void setExamination() {
		Examinations.click();
	}
	public void setCourses() {
		Courses.click();
	}
	public void setSubjects() {
		Subjects.click();
	}
	public void setValuators() {
		Valuators.click();
	}
	public void setIdentityCardTypes() {
		IdentityCardTypes.click();
	}
	public void setExamination_Module() {
		Examination_Module.click();
	}
	public void setScanningCentres() {
		ScanningCentres.click();
	}
	public void setValuationCentres() {
		ValuationCentres.click();
	}
	public void setValuationTypes() {
		ValuationTypes.click();
	}
	public void setRegions() {
		Regions.click();
	}
	public void setValuationSession() {
		ValuationSession.click();
	}
	public void setExaminationCourses() {
		ExaminationCourses.click();
	}
	public void setExaminationSubjects() {
		ExaminationSubjects.click();
	}
	public void setWindowClose() {
		 CloseWindow.click();
	}
}
