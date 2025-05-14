package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class IdentityCardTypesPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtTitle']")
	private WebElement Title;
	
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
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.qvwIdentityCardType, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='IDC01, Item: ePen.Admin.Models.qvwIdentityCardType, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement Edit_IdentityCards;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public IdentityCardTypesPage(WiniumDriver driver) {
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
	public WebElement getCheckbox() {
		return Checkbox;
	}
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getEdit_IdentityCrads() {
		return Edit_IdentityCards;
	}
	public WebElement getWindowClose() {
		return CloseWindow; 
	} 
}
