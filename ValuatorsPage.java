package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ValuatorsPage {
	
	@FindBy(xpath = "//*[@ClassName='Button' and @Name='Add']")
	private WebElement Add;
	
	@FindBy(xpath = "//*[@ClassName='TextEdit' and @AutomationId='dtxtCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//*[@ClassName='Button' and @AutomationId='dtswChangePassword']")
	private WebElement ChangePassword;
	
	@FindBy(xpath = "//*[@ClassName='Button' and @AutomationId='dtswCollectIDDetails']")
	private WebElement CollectIdDetails;
	
	@FindBy(xpath = "//*[@ClassName='Button' and @AutomationId='dtswCollectBankDetails']")
	private WebElement CollectBankDetails;
	
	@FindBy(xpath = "//*[@ClassName='Button' and @AutomationId='dtswCollectPersonalDetails']")
	private WebElement CollectPersonalDetails;
	
	@FindBy(xpath = "//*[@ClassName='ComboBoxEdit' and @AutomationId='dcmbValuatorTypes']")
	private WebElement ValuatorType;
	
	@FindBy(xpath = "//*[@ClassName='ListBoxItem' and @Name='External']") 
	private WebElement Selected_Valuator;
	
	@FindBy(xpath = "//*[@ClassName='ComboBoxEdit' and @AutomationId='dcmbValuatorStatus']")
	private WebElement Status;
	
	@FindBy(xpath = "//*[@ClassName='ListBoxItem' and @Name='Active']") 
	private WebElement Selected_Status;
	
	@FindBy(xpath = "//*[@ClassName='LookUpEdit' and @AutomationId='dlkeInstitute']")
	private WebElement Institute;
	
	@FindBy(xpath = "//*[@AutomationId='HeaderPanel' and @ClassName='ItemsControlBase']")
	private WebElement Institute_Search;
	
	@FindBy(xpath = "//*[@Name='IIMS_0018, Item: ePen.Admin.Models.Institute, Column Display Index: 0' and @AutomationId='Code']")
	private WebElement Selected_Institute;
	
	@FindBy(xpath = "//*[@AutomationId='sbtnSave' and @ClassName='Button']")
	private WebElement Save;
	
	@FindBy(xpath = "//*[@AutomationId='PART_OKDialogButton' and @ClassName='ThemedWindowDialogButton']")
	private WebElement Ok;
	
	@FindBy(xpath = "//*[@Name='Refresh' and @AutomationId='sbtnRefresh']")
	private WebElement Refresh;
	
	@FindBy(xpath = "//*[@Name='Close' and @AutomationId='sbtnClose']")
	private WebElement Close;
	
	@FindBy(xpath = "//*[@AutomationId='SearchComboBox' and @ClassName='ComboBoxEdit']")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//*[@AutomationId='DX$CheckboxSelectorColumn' and @Name='Unchecked, Item: ePen.Admin.Models.Valuator, Column Display Index: 0']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "//*[@Name='Delete' and @ClassName='Button']")
	private WebElement Delete;
	
	@FindBy(xpath = "//*[@Name='ALMV1, Item: ePen.Admin.Models.Valuator, Column Display Index: 1' and @AutomationId='Code']")
	private WebElement EditValuator;
	
	@FindBy(xpath = "//*[@AutomationId='PART_DownButton' and @ClassName='RepeatButton']")
	private WebElement ChangeStatus;
	
	@FindBy(xpath = "//*[@AutomationId='BarButtonItemLink' and @Name='Active']")
	private WebElement ActiveStatus;
	
	@FindBy(xpath = "//*[@Name='Close' and @ClassName='Button']")
	private WebElement CloseWindow;
	
	public ValuatorsPage(WiniumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAdd() {
		return Add;
	}
	public WebElement getCode() {
		return Code;
	}
	public WebElement getChangePassword() {
		return ChangePassword;
	}
	public WebElement getCollectIdDetails() {
		return CollectIdDetails;
	}
	public WebElement getCollectBankDetails() {
		return CollectBankDetails;
	}
	public WebElement getCollectPersonalDetails() {
		return CollectPersonalDetails;
	}
	public WebElement getValuatorType() {
		return ValuatorType;
	}
	public WebElement getSelected_Valuator() {
		return Selected_Valuator;
	}
	public WebElement getStatus() {
		return Status;
	}
	public WebElement getSelected_Status() {
		return Selected_Valuator;
	}
	public WebElement getInstitute() {
		return Institute;
	}
	public WebElement getInstitute_Search() {
		return Institute_Search;
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
	public WebElement getEditValuator() {
		return EditValuator;
	}
	public WebElement getChangeStatus() {
		return ChangeStatus;
	}
	public WebElement getActiveStatus() {
		return ActiveStatus;
	}
	public WebElement getWindowClose() {
		return CloseWindow;
	}
}
