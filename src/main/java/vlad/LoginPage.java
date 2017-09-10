package vlad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='exampleInputEmail1']")
	WebElement usernameTextBox;
	@FindBy(xpath = ".//*[@id='exampleInputPassword1']")
	WebElement passwordTextBox;
	@FindBy(xpath = ".//*[@type='submit']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		
	public void fillUsername(String userName){
		usernameTextBox.sendKeys(userName);
	}
	
	public void fillPassword(String password){
		passwordTextBox.sendKeys(password);
	}
	public void clickLoginButton() throws InterruptedException{
		Thread.sleep(5000);
		loginButton.click();
	}
	
}
