package ivanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private WebDriver driver;

    private String xPathToAddReportButton = "//a[@ng-href=\"#/app/add-report-form\"]";

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddReportButton(){
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToAddReportButton)));
        WebElement addReportButton = driver.findElement(By.xpath(xPathToAddReportButton));
        addReportButton.click();


    }

}
