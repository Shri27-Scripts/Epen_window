package win.ePen.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class ModuleExaminationPage {
	
	@FindBy(xpath = "//*[@Name='Examination' and @ClassName='RibbonPageHeaderControl']")
	private WebElement Examination;
	
	@FindBy(xpath = "//*[@Name='Scanning Centres' and @AutomationId='BarButtonItemLink']")
	private WebElement Scanning_Centres;
	
	@FindBy(xpath = "//*[@Name='Valuation Centres' and @AutomationId='BarButtonItemLink']")
	private WebElement Valuation_Centres;
	
	@FindBy(xpath = "//*[@Name='Valuation Types' and @AutomationId='BarButtonItemLink']")
	private WebElement Valuation_Types;
	
	@FindBy(xpath = "//*[@Name='Regions' and @AutomationId='BarButtonItemLink']")
	private WebElement Regions;
	
	@FindBy(xpath = "//*[@Name='Valuation Sessions' and @AutomationId='BarButtonItemLink']")
	private WebElement Valuation_Session;
	
	public ModuleExaminationPage(WiniumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setExamination() {
		Examination.click();
	}
	public void setScanning_Centres() {
		Scanning_Centres.click();
	}
	public void setValuation_Centres() {
		Valuation_Centres.click();
	}
	public void setValuation_Types() {
		Valuation_Types.click();
	}
	public void setRegions() {
		Regions.click();
	}
	public void setValuation_Session() {
		Valuation_Session.click();
	}
}
