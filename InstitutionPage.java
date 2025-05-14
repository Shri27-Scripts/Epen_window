package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class InstitutionPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtReportTitle']")
	private WebElement ReportTitle;
	
	@FindBy(xpath = "//*[@ClassName='ButtonEdit' and @AutomationId='dtetLogo']")
	private WebElement Logo;
	
	@FindBy(xpath = "//*[@Name='Start of Quick Access - Desktop (pinned)']")
	private WebElement Desktop;
	
	@FindBy(xpath = "//*[@Name='sample_Data' and @ClassName='UIItem']'")
	private WebElement Sample_Data;
	
	@FindBy(xpath = "//*[@Name='dummy_ID01' and @ClassName='UIItem']")
	private WebElement Logo_path;
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Open']")
	private WebElement Open;
	
	@FindBy(xpath = "//*[@Name='Save' and @ClassName='Button']")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@AutomationId='PART_OKDialogButton' and @ClassName='ThemedWindowDialogButton']")
	private WebElement Ok;
	
	@FindBy(xpath = "//*[@Name='Refresh' and @AutomationId='sbtnRefresh']")
	private WebElement Refresh;
	
	@FindBy(xpath = "//*[@Name='Close' and @AutomationId='sbtnClose']")
	private WebElement Close;
	
	@FindBy(xpath = "//*[@AutomationId='SearchComboBox' and @ClassName='ComboBoxEdit']")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//*[@Name='Code' and @ClassName='TextBlock']")
	private WebElement Code_column;
	
	@FindBy(xpath = "//*[@AutomationId='FilterDropDown' and @ClassName='PopupBaseEdit']")
	private WebElement dropdown_filter;
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.Institute, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='INS-00, Item: ePen.Admin.Models.Institute, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditInstitute;
	
	@FindBy(xpath = "//*[@Name='dummy_image' and @ClassName='UIItem']")
	private WebElement NewLogo_path;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public InstitutionPage(WiniumDriver driver) {
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
	public WebElement getReportTitle() {
		return ReportTitle;
	}
	public WebElement getLogo() {
		return Logo;
	}
	public WebElement getDesktop() {
		return Desktop;
	}
	public WebElement getSample_Data() {
		return Sample_Data;
	}
	public WebElement getLogo_path() {
		return Logo_path;
	}
	public WebElement getOpen() {
		return Open;
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
	public WebElement getCode_Column() {
		return Code_column;
	}
	public WebElement getDropdown_filter() {
		return dropdown_filter;
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
	public WebElement getEditInstitute() {
		return EditInstitute;
	}
	public WebElement getNewLogo_path() {
		return NewLogo_path;
	}
	public WebElement getWindowClose() {
		return CloseWindow;
	}
}
