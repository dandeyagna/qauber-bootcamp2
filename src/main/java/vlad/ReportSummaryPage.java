package vlad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReportSummaryPage {
		WebDriver driver;
		
		@FindBy(xpath = ".//*[text()='Case ID']/../div")
		WebElement caseId;
		@FindBy(xpath = ".//*[text()='First Name']/../div")
		WebElement firstName;
		@FindBy(xpath = ".//*[text()='Last Name']/../div")
		WebElement lastName;
		@FindBy(xpath = ".//*[text()='Location of Stop']/../div")
		WebElement location;
		
		
		public ReportSummaryPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void verifyCaseId(){
			String Id = caseId.getText();
			Assert.assertEquals(Id, "123456789");
		}
		public void verifyFirstName(){
			String first = firstName.getText();
			Assert.assertEquals(first, "Gena");
		}
		public void verifyLastName(){
			String last = lastName.getText();
			Assert.assertEquals(last, "Krokodil");
		}
		public void verifyLocation(){
			String locationString = location.getText();
			Assert.assertEquals(locationString, "1234 Mockingbird Way");
		}
		public void quit(){
			driver.quit();
		}
}
