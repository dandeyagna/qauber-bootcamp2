package vlad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='fa fa-user size']")
	WebElement subjectInfo;
	@FindBy(xpath = "//input[@ng-model='wizard.report.caseNumber']")
	WebElement caseIdTextbox;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameTextbox;
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameTextbox;
	@FindBy(xpath = "//h4/div[@title='Gang Membership']")
	WebElement gangTab;
	@FindBy(xpath = "//input[@ng-model='wizard.report.locationOfStop']")
	WebElement locationTextbox;
	@FindBy(xpath = "//h4/div[@title='Preview']")
	WebElement previewButton;
	@FindBy(xpath = "//button[@ng-click='wizard.commitReport()']")
	WebElement commitButton;
	
	public ReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSubjectInfo() throws InterruptedException{
		Thread.sleep(5000);
		subjectInfo.click();
	}
	public void fillCaseId(String caseId){
		caseIdTextbox.sendKeys(caseId);
	}
	public void fillLastName(String lastName){
		lastNameTextbox.sendKeys(lastName);
	}
	public void fillFirstName(String firstName){
		firstNameTextbox.sendKeys(firstName);
	}
	public void clickGangTab() throws InterruptedException{
		Thread.sleep(5000);
		gangTab.click();
	}
	public void fillLocationTextbox(String location){
		locationTextbox.sendKeys(location);
	}
	public void clickPreviewButton(){
		previewButton.click();
	}
	public void clickCommitButton() throws InterruptedException{
		Thread.sleep(5000);
		commitButton.click();
	}
}
