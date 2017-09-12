package ivanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String xPathToDep11RadioButton = "html/body/div[2]/section/" +
            "div/div/form/div[1]/div[2]/div[2]/fieldset/div[3]/div/div/label/span";
    private String xPathToSubjectInformation = "//div[@class=\"fa fa-user size\"]";
    private String xPathToFirstName = "//input[@ng-model=\"wizard.report.firstName\"]";
    private String xPathToLastName = "//input[@ng-model=\"wizard.report.lastName\"]";

    private String xPathToIdentifiers = "//div[@class=\"fa fa-binoculars size\"]";
    private String xPathToTattoosCheckBox = "//input[@ng-model=\"wizard.report.tattoos\"]/../span";
    private String xPathToTattoosInputField = "//input[@ng-model=\"wizard.report.tattoosDescription\"]";

    private String xPathToGangMembership = "//div[@title=\"Gang Membership\"]";
    private String xPathLocationOfStop = "//input[@ng-model=\"wizard.report.locationOfStop\"]";

    private String xPathToPreview = "//div[@title=\"Preview\"]";
    private String xPathToPublishReport = "//button[@ng-click=\"wizard.commitReport()\"]";

    public ReportPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 12);
    }

    public void chooseEntity(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToDep11RadioButton)));
        driver.findElement(By.xpath(xPathToDep11RadioButton)).click();
    }

    public void chooseSubjectInformationSection(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToSubjectInformation)));
        driver.findElement(By.xpath(xPathToSubjectInformation)).click();
    }

    public void fillFirstNameField(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToFirstName)));
        driver.findElement(By.xpath(xPathToFirstName)).sendKeys(firstName);
    }

    public void fillLastNameField(String lastName){
        driver.findElement(By.xpath(xPathToLastName)).sendKeys(lastName);
    }

    public void chooseIdentifiersSection(){
        driver.findElement(By.xpath(xPathToIdentifiers)).click();
    }

    public void clickOnTattoosCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToTattoosCheckBox)));
        driver.findElement(By.xpath(xPathToTattoosCheckBox)).click();
    }

    public void fillTattoosInputField(String tattoosDescription){
        driver.findElement(By.xpath(xPathToTattoosInputField)).sendKeys(tattoosDescription);
    }

    public void clickOnGangMembershipSection(){
        driver.findElement(By.xpath(xPathToGangMembership)).click();
    }

    public void fillLocationOfStopField(String locationOfStop){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathLocationOfStop)));
        driver.findElement(By.xpath(xPathLocationOfStop)).sendKeys(locationOfStop);
    }

    public  void clickOnPreviewSection(){
        driver.findElement(By.xpath(xPathToPreview)).click();
    }

    public void clickOnPublishReportButton(){
        driver.findElement(By.xpath(xPathToPublishReport)).click();
    }
}
