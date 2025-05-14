package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ValuationSessionPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtValuationSessionCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
	@FindBy(xpath = "//*[@AutomationId='Start Time     ' and @ClassName='LayoutItem']")
	private WebElement StartTime;
	
	@FindBy(xpath = "//*[@AutomationId='PART_SpinUpButton' and @ClassName='RepeatButton']")
	private WebElement ST_SpinUpButton;
	
	@FindBy(xpath = "//*[@AutomationId='PART_SpinDownButton' and @ClassName='RepeatButton']")
	private WebElement ST_SpinDownButton;
	
	@FindBy(xpath = "//*[@AutomationId='End Time' and @ClassName='LayoutItem']")
	private WebElement EndTime;
	
	@FindBy(xpath = "//*[@ClassName='LookUpEdit' and @AutomationId='dlktExaminations']")
	private WebElement Examination;
	
	@FindBy(xpath = "//*[@Name='Exam-012, Item: ePen.Admin.Models.qvwExamination, Column Display Index: 0' and @AutomationId='Code']")
	private WebElement Selected_Examination;
	
	@FindBy(xpath = "//*[@AutomationId='sbtnSave' and @ClassName='Button']")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@AutomationId='PART_OKDialogButton' and @ClassName='ThemedWindowDialogButton']")
	private WebElement Ok;
	
	@FindBy(xpath = "//*[@AutomationId='SearchComboBox' and @ClassName='ComboBoxEdit']")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//*[@AutomationId='sbtnRefresh' and @ClassName='Button']")
	private WebElement Refresh;
	
	@FindBy(xpath = "//*[@AutomationId='sbtnClose' and @ClassName='Button']")
	private WebElement Close;
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.qvwValuationSession, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='HaB9N, Item: ePen.Admin.Models.qvwValuationSession, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditValuationSession;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;

	public ValuationSessionPage(WiniumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdd() {
		return Add;
	}
	public WebElement getCode() {
		return Code;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getStartTime() {
		return StartTime;
	}
	public WebElement getEndTime() {
		return EndTime;
	}
	public WebElement getSpinUpButton() {
		return ST_SpinUpButton;
	}
	public WebElement getSpinDownButton() {
		return ST_SpinDownButton; 	
	}
	public WebElement getExamination() {
		return Examination;
	}
	public WebElement getSelected_Examination() {
		return Selected_Examination;  
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getOk() {
		return Ok;
	}
	public WebElement getRefresh() {
		return Refresh;
	}
	public WebElement getClose() {
		return Close;
	}
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getCheckbox() {
		return Checkbox;
	}
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getEditValuationSession() {
		return EditValuationSession;
	}
	public WebElement getWindowClose() {
		return CloseWindow;
	}
}
