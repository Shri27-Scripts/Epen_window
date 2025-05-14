package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ExaminationSubjectsPage {
	
	@FindBy(xpath = "//*[@AutomationId='dlkupExaminations' and @ClassName='LookUpEdit']")
	private WebElement Dropdown;
	
	@FindBy(xpath = "//*[@Name='Exam-012, Item: ePen.Admin.Models.qvwExamination, Column Display Index: 0' and @AutomationId='Code']")
	private WebElement Selected_Examination;
	
	@FindBy(xpath = "//*[@Name='Load' and @ClassName='Button']")
	private WebElement Load;
	
	@FindBy(xpath = "//*[@Name='DataPanel' and @AutomationId='dataPresenter']")
	private WebElement Map_Course;
	
	@FindBy(xpath = "//*[@Name='Save' and @ClassName='Button']")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@AutomationId='PART_OKDialogButton' and @ClassName='ThemedWindowDialogButton']")
	private WebElement Ok;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement Close;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='ToolTip']")
	private WebElement CloseWindow;
	
	public ExaminationSubjectsPage(WiniumDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown() {
		return Dropdown;
	}
	public WebElement getSelected_Examination() {
		return Selected_Examination;
	}
	public WebElement getLoad() {
		return Load;
	}
	public WebElement getMap_Course() {
		return Map_Course;
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getOk() {
		return Ok;
	}
	public WebElement getClose() {
		return Close;
	}
	public WebElement getCloseWindow() {
		return CloseWindow;
	}

}
