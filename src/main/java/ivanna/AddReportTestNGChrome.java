package ivanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AddReportTestNGChrome {
    private WebDriver wd;
    private WebDriverWait wait;

    @BeforeTest
    public void addReport(){
        System.setProperty("webdriver.chrome.driver","/Users/kasavine/Desktop/drivers/chromedriver");
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 12);

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("xPathToAddReportButton", "//a[@ng-href=\"#/app/add-report-form\"]");
        map.put("xPathToEnterEmailField", "//input[@ng-model=\"login.account.email\"]");
        map.put("xPathToEnterPswField", "//input[@ng-model=\"login.account.password\"]");
        map.put("xPathToLoginButton", "//button[@class=\"btn btn-block btn-primary mt-lg\"]");
        map.put("xPathToPreloader", "html/body/div[1]");
        map.put("xPathToDep11RadioButton","html/body/div[2]/section/div/div/" +
                "form/div[1]/div[2]/div[2]/fieldset/div[3]/div/div/label/span" );
        map.put("xPathToSubjectInformation", "//div[@class=\"fa fa-user size\"]");
        map.put("xPathToIdentifiers", "//div[@class=\"fa fa-binoculars size\"]");
        map.put("xPathToTattoosCheckBox", "//input[@ng-model=\"wizard.report.tattoos\"]/../span");
        map.put("xPathToTattoosInputField", "//input[@ng-model=\"wizard.report.tattoosDescription\"]");
        map.put("xPathToGangMembership", "//div[@title=\"Gang Membership\"]");
        map.put("xPathLocationOfStop", "//input[@ng-model=\"wizard.report.locationOfStop\"]");
        map.put("xPathToPreview", "//div[@title=\"Preview\"]");
        map.put("xPathToPublishReport", "//button[@ng-click=\"wizard.commitReport()\"]");
        map.put("xPathToViewReportButton", "//a[@ng-if=\"report.status==1\"]");

        map.put("xPathToFirstName", "//input[@ng-model=\"wizard.report.firstName\"]");
        map.put("validFirstName", "David");

        map.put("xPathToLastName", "//input[@ng-model=\"wizard.report.lastName\"]");
        map.put("validLastName", "Wolf");
        map.put("validLocationOfStop", "Santa Cruz Shop");

        wd.get("http://fits.qauber.com/#/page/login");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToEnterEmailField"))));
        wd.findElement(By.xpath(map.get("xPathToEnterEmailField"))).sendKeys("wonderchap@mailinator.com");
        wd.findElement(By.xpath(map.get("xPathToEnterPswField"))).sendKeys("ivanka.tester");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(map.get("xPathToPreloader"))));
        wd.findElement(By.xpath(map.get("xPathToLoginButton"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToAddReportButton"))));
        wd.findElement(By.xpath(map.get("xPathToAddReportButton"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToDep11RadioButton"))));
        wd.findElement(By.xpath(map.get("xPathToDep11RadioButton"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToSubjectInformation"))));
        wd.findElement(By.xpath(map.get("xPathToSubjectInformation"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathToFirstName"))));
        wd.findElement(By.xpath(map.get("xPathToFirstName"))).sendKeys(map.get("validFirstName"));

        wd.findElement(By.xpath(map.get("xPathToLastName"))).sendKeys(map.get("validLastName"));

        wd.findElement(By.xpath(map.get("xPathToGangMembership"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(map.get("xPathLocationOfStop"))));
        wd.findElement(By.xpath(map.get("xPathLocationOfStop"))).sendKeys(map.get("validLocationOfStop"));

        wd.findElement(By.xpath(map.get("xPathToPreview"))).click();
        wd.findElement(By.xpath(map.get("xPathToPublishReport"))).click();

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.findElement(By.xpath(map.get("xPathToViewReportButton"))).click();
    }

    @Test()
    public void checkFirstName(){
        WebElement label = wd.findElement(By.xpath("html/body/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[2]/div"));
        String text = label.getText();
        Assert.assertEquals(text, "David");
    }

    @Test
    public void checkLastName(){
        WebElement label = wd.findElement(By.xpath("html/body/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[1]/div"));
        String text = label.getText();
        Assert.assertEquals(text, "Wolf");
    }

    @Test
    public void checkLocationOfStop(){
        WebElement label = wd.findElement(By.xpath("html/body/div[2]/section/div/div/div[2]/div[8]/div/div[2]/div/div"));
        String text = label.getText();
        Assert.assertEquals(text, "Santa Cruz Shop");
    }

    @AfterTest
    public void closeBrowser(){
        wd.quit();
    }
}