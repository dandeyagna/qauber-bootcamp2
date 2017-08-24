import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.Assert;

public class AddReportTestNG {
	private WebDriver wd;
    private WebDriverWait wait;

    @BeforeTest
    public void addReport(){
        wd = new FirefoxDriver();
        wait = new WebDriverWait(wd, 12);

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("xPathToAddReportButton", "//a[@ng-href=\"#/app/add-report-form\"]");
        map.put("xPathToEnterEmailField", "//input[@ng-model=\"login.account.email\"]");
        map.put("xPathToEnterPswField", "//input[@ng-model=\"login.account.password\"]");
        map.put("xPathToLoginButton", "//button[@class=\"btn btn-block btn-primary mt-lg\"]");
        map.put("xPathToPreloader", "html/body/div[1]");
        map.put("xPathToJulietRadioButton", "html/body/div[2]/section/div/div/" + "form/div[1]/div[2]/div[2]/fieldset/div[2]/div/div/label/span"
                 );
        map.put("xPathToSubjectInformation", "//div[@class=\"fa fa-user size\"]");
        map.put("xPathToFirstName", "//input[@ng-model=\"wizard.report.firstName\"]");
        map.put("xPathToLastName", "//input[@ng-model=\"wizard.report.lastName\"]");
        map.put("xPathToIdentifiers", "//div[@class=\"fa fa-binoculars size\"]");
        map.put("xPathToTattoosCheckBox", "//input[@ng-model=\"wizard.report.tattoos\"]/../span");
        map.put("xPathToTattoosInputField", "//input[@ng-model=\"wizard.report.tattoosDescription\"]");
        map.put("xPathToGangMembership", "//div[@title=\"Gang Membership\"]");
        map.put("xPathLocationOfStop", "//input[@ng-model=\"wizard.report.locationOfStop\"]");
        map.put("xPathToPreview", "//div[@title=\"Preview\"]");
        map.put("xPathToPublishReport", "//button[@ng-click=\"wizard.commitReport()\"]");
        map.put("xPathToViewReportButton", "//a[@ng-if=\"report.status==1\"]");

        map.put("validFirstName", "Soham");
        map.put("validLastName", "Kumar");
        map.put("validLocationOfStop", "Pune");

        wd.get("http://fits.qauber.com/#/page/login");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToEnterEmailField"))));
        wd.findElement(By.xpath(map.get("xPathToEnterEmailField"))).sendKeys("rome@mailinator.com");
        wd.findElement(By.xpath(map.get("xPathToEnterPswField"))).sendKeys("qauber2017");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(map.get("xPathToPreloader"))));
        wd.findElement(By.xpath(map.get("xPathToLoginButton"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToAddReportButton"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToJulietRadioButton"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToSubjectInformation"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToFirstName"))).sendKeys(map.get("validFirstName"));

        wd.findElement(By.xpath(map.get("xPathToLastName"))).sendKeys(map.get("validLastName"));

        wd.findElement(By.xpath(map.get("xPathToIdentifiers"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToTattoosCheckBox"))).click();

        wd.findElement(By.xpath(map.get("xPathToTattoosInputField"))).sendKeys("Dragon");

        wd.findElement(By.xpath(map.get("xPathToGangMembership"))).click();

        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathLocationOfStop"))).sendKeys(map.get("validLocationOfStop"));

        wd.findElement(By.xpath(map.get("xPathToPreview"))).click();
        wd.findElement(By.xpath(map.get("xPathToPublishReport"))).click();

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToViewReportButton"))).click();
    }

    @Test()
    public void checkFirstName(){
        WebElement label = wd.findElement(By.xpath(".//*[@id='reportBody']/div[1]/div/div[2]/div[2]/div"));
        String text = label.getText();
        Assert.assertEquals(text, "Soham");
    }

    @Test
    public void checkLastName(){
        WebElement label = wd.findElement(By.xpath(".//*[@id='reportBody']/div[1]/div/div[2]/div[1]/div"));
        String text = label.getText();
        Assert.assertEquals(text, "Kumar");
    }

    @Test
    public void checkLocationOfStop(){
        WebElement label = wd.findElement(By.xpath(".//*[@id='reportBody']/div[8]/div/div[2]/div/div"));
        String text = label.getText();
        Assert.assertEquals(text, "Pune");
    }

    @AfterTest
    public void closeBrowser(){
        wd.quit();
    }
}


