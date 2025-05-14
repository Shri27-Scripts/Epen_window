package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class CoursePage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtDisplayTitle']")
	private WebElement DisplayTitle;
	
	@FindBy(xpath = "//*[@ClassName='SpinEdit' and @AutomationId='dspnedtTotalSubjects']")
	private WebElement TotalNoOfSubjects;
	
	@FindBy(xpath = "//*[@ClassName='ComboBoxEdit' and @AutomationId='dcmbStatus']")
	private WebElement CurrentStatus;
	
	@FindBy(xpath = "//*[@ClassName='ListBoxItem' and @Name='Active']") 
	private WebElement Status;
	
	@FindBy(xpath = "//*[@ClassName='LookUpEdit' and @AutomationId='dlkeInstitute']")
	private WebElement Institute;
	
	@FindBy(xpath = "//*[@Name='IIMS_0018, Item: ePen.Admin.Models.Institute, Column Display Index: 0' and @AutomationId='Code']")
	private WebElement Selected_Institute;
	
	@FindBy(xpath = "//*[@Name='Save' and @ClassName='Button']")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@AutomationId='PART_OKDialogButton' and @ClassName='ThemedWindowDialogButton']")
	private WebElement Ok;
	
	@FindBy(xpath = "//*[@Name='Refresh' and @AutomationId='sbtnRefresh']")
	private WebElement Refresh;
	
	@FindBy(xpath = "//*[@AutomationId='SearchComboBox' and @ClassName='ComboBoxEdit']")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//*[@Name='Close' and @AutomationId='sbtnClose']")
	private WebElement Close;
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.qvwCourse, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='BCOM-0023, Item: ePen.Admin.Models.qvwCourse, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditCourse;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public CoursePage(WiniumDriver driver) {
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
	public WebElement getDisplayTitle() {
		return DisplayTitle;
	}
	public WebElement getTotalNoOfSubjects() {
		return TotalNoOfSubjects;
	}
	public WebElement getCurrentStatus() {
		return CurrentStatus;
	}
	public WebElement getStatus() {
		return Status;
	}
	public WebElement getInstitute() {
		return Institute;
	}
	public WebElement getSelected_Institute() {
		return Selected_Institute;
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
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getClose() {
		return Close;
	}
	public WebElement getCheckbox() {
		return Checkbox;
	}
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getEditCourse() {
		return EditCourse;
	}
	public WebElement getWindowClose() {
		return CloseWindow;
	}
}
