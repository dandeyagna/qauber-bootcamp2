package ivanna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddReportTest {
    WebDriver driver;
    DashboardPage dashboard;
    ReportSummaryPage reportSummaryPage;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://fits.qauber.com/#/page/login");
        reportSummaryPage = new ReportSummaryPage(driver);
    }

    @Test(priority = 1)
    public void addReport(){
        LoginPage login = new LoginPage(driver);
        login.fillUsernameField("wonderchap@mailinator.com");
        login.fillPasswordField("ivanka.tester");
        login.clickLoginButton();

        dashboard = new DashboardPage(driver);
        dashboard.clickAddReportButton();

        ReportPage reportPage = new ReportPage(driver);
        reportPage.chooseEntity();

        reportPage.chooseSubjectInformationSection();
        reportPage.fillFirstNameField("Jack");
        reportPage.fillLastNameField("Daniels");

        reportPage.chooseIdentifiersSection();
        reportPage.clickOnTattoosCheckBox();
        reportPage.fillTattoosInputField("Some info about tattoo");

        reportPage.clickOnGangMembershipSection();
        reportPage.fillLocationOfStopField("Location near the waterfall");

        reportPage.clickOnPreviewSection();
        reportPage.clickOnPublishReportButton();
    }

    @Test(priority = 2)
    public void goToReportView(){
        reportSummaryPage.goToViewReport();
    }

    @Test(dependsOnMethods = {"addReport", "goToReportView"})
    public void checkFirstNameInSummary(){

        String text = reportSummaryPage.getFirstNameInSummary();
        assertEquals(text, "Jack");
    }

    @Test(dependsOnMethods = {"addReport", "goToReportView"})
    public void checkLastNameInSummary(){

        String text = reportSummaryPage.getLastNameInSummary();
        assertEquals(text, "Daniels");
    }

    @Test(dependsOnMethods = {"addReport", "goToReportView"})
    public void checkLocationInSummary(){

        String text = reportSummaryPage.getLocationOfStop();
        assertEquals(text, "Location near the waterfall");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
