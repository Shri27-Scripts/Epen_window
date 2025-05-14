package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ScanningCentersPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
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
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.qvwScanningCentre, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='HAX9P, Item: ePen.Admin.Models.qvwScanningCentre, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditScanningCentre;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public ScanningCentersPage(WiniumDriver driver) {
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
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getRefresh() {
		return Refresh;
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
	public WebElement getEdit_ScanningCentres() {
		return EditScanningCentre;
	}
	public WebElement getWindowClose() {
		return CloseWindow; 
	}
}
