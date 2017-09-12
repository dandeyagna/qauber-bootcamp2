package ivanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private String xPathToEnterEmailField = "//input[@ng-model=\"login.account.email\"]";
    private String xPathToEnterPswField = "//input[@ng-model=\"login.account.password\"]";
    private String xPathToLoginButton = "//button[@class=\"btn btn-block btn-primary mt-lg\"]";
    private String xPathToPreloader = "html/body/div[1]";

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void fillUsernameField(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathToEnterEmailField)));
        WebElement usernameTextbox = driver.findElement(By.xpath(xPathToEnterEmailField));
        usernameTextbox.sendKeys(username);
    }

    public void fillPasswordField(String password){
        WebElement passwordTextbox = driver.findElement(By.xpath(xPathToEnterPswField));
        passwordTextbox.sendKeys(password);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPathToPreloader)));
        WebElement loginButton = driver.findElement(By.xpath(xPathToLoginButton));
        loginButton.click();
    }



}
