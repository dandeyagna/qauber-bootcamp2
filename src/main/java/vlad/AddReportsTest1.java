package vlad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddReportsTest1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://fits.qauber.com");
		
		LoginPage login = new LoginPage(driver);
		login.fillUsername("dryrun4@mailinator.com");
		login.fillPassword("password");
		Thread.sleep(10000);
		login.clickLoginButton();
		
		Thread.sleep(5000);
		
		DashboardPage dash = new DashboardPage(driver);
		dash.clickAddReport();
		
		Thread.sleep(5000);
		
		ReportsPage reports = new ReportsPage(driver);
		reports.clickSubjectInfo();
		reports.fillCaseId("123456789");
		reports.fillLastName("Krokodil");
		reports.fillFirstName("Gena");
		reports.clickGangTab();
		reports.fillLocationTextbox("1234 Mockingbird Way");
		reports.clickPreviewButton();
		reports.clickCommitButton();
		
		Thread.sleep(5000);
		dash.clickViewReport();
		
		ReportSummaryPage summary = new ReportSummaryPage(driver);
		summary.verifyCaseId();
		summary.verifyFirstName();
		summary.verifyLastName();
		summary.verifyLocation();
		summary.quit();
	}

}
