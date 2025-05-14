package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ExaminationPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtDisplayTitle']")
	private WebElement DisplayTitle;
	
	@FindBy(xpath = "//*[@ClassName='ComboBoxEdit' and @AutomationId='dcmbValuationMode']")
	private WebElement ValuatorMode;
	
	@FindBy(xpath = "//*[@ClassName='ListBoxItem' and @Name='Internet']")
	private WebElement Mode_Option;
	
	@FindBy(xpath = "//*[@ClassName='ButtonEdit' and @AutomationId='dbedBookletFolderPath']")
	private WebElement BookletPath;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtReportTitle']")
	private WebElement ReportTitle;
	
	@FindBy(xpath = "//*[@ClassName='ComboBoxEdit' and @AutomationId='dcmbStatus']")
	private WebElement CurrentStatus;
	
	@FindBy(xpath = "//*[@ClassName='TextBlock' and @Name='Active']") 
	private WebElement Status;
	
	@FindBy(xpath = "//*[@ClassName='LookUpEdit' and @AutomationId='dlkeInstitute']")
	private WebElement Institute;
	
	@FindBy(xpath = "//*[@Name='IIMS_0018, Item: ePen.Admin.Models.Institute, Column Display Index: 0' and @AutomationId='Code']")
	private WebElement Selected_Institute;
	
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
	
	@FindBy(xpath = "//*[@Name='Code' and @ClassName='TextBlock']")
	private WebElement Code_column;
	
	@FindBy(xpath = "//*[@AutomationId='FilterDropDown' and @ClassName='PopupBaseEdit']")
	private WebElement dropdown_filter;
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.qvwExamination, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='AS_0224, Item: ePen.Admin.Models.qvwExamination, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditExamination;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public ExaminationPage(WiniumDriver driver) {
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
	public WebElement getValuatorMode() {
		return ValuatorMode;
	}
	public WebElement getMode_Option() {
		return Mode_Option;
	}
	public WebElement getBookletPath() {
		return BookletPath;
	}
	public WebElement getReportTitle() {
		return ReportTitle;
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
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getRefresh() {
		return Refresh;
	}
	public WebElement getClose() {
		return Close;
	}
	public WebElement getCode_Column() {
		return Code_column;
	}
	public WebElement getDropdown_filter() {
		return dropdown_filter;
	}
	public WebElement getCheckbox() {
		return Checkbox;
	}
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getEditExamination() {
		return EditExamination;
	}
	public WebElement getWindowClose() {
		return CloseWindow; 
	}

}
