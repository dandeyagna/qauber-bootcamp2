package vlad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	@FindBy(xpath = ".//*[text()='Add Report']")
	WebElement addReport;
	@FindBy(xpath = "//div[5]/a[1]")
	WebElement viewReport;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddReport() throws InterruptedException{
		Thread.sleep(5000);
		addReport.click();
	}
	public void clickViewReport() throws InterruptedException{
		Thread.sleep(5000);
		viewReport.click();
	}
}