package ivanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportSummaryPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private String xPathToFirstNameInSummary = ".//*[@id='reportBody']/div[1]/div/div[2]/div[2]/div";
    private String xPathToLastNameInSummary = ".//*[@id='reportBody']/div[1]/div/div[2]/div[1]/div";
    private String xPathToLocationOfStopInSummary = ".//*[@id='reportBody']/div[8]/div/div[2]/div/div";

    private String xPathToViewReportButton = "//a[@ng-if=\"report.status==1\"]";

    public ReportSummaryPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void goToViewReport() {
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToViewReportButton)));
        driver.findElement(By.xpath(xPathToViewReportButton)).click();
    }

    public String getFirstNameInSummary(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToFirstNameInSummary)));
        WebElement labelFirstName = driver.findElement(By.xpath(xPathToFirstNameInSummary));
        String textFirstName = labelFirstName.getText();
        return textFirstName;
    }

    public String getLastNameInSummary(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToLastNameInSummary)));
        String labelLastName = driver.findElement(By.xpath(xPathToLastNameInSummary)).getText();
//        String textLastName = labelLastName.getText();
        return labelLastName;
    }

    public String getLocationOfStop(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToLocationOfStopInSummary)));
        WebElement labelLocationOfStop = driver.findElement(By.xpath(xPathToLocationOfStopInSummary));
        String textLocationOfStop = labelLocationOfStop.getText();
        return textLocationOfStop;
    }

}
