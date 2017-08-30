package vlad;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddReportsBasic {

	public static void main(String[] args) {
		/**
		 * First we open Firefox browser and navigate to our site
		 * 
		 * We are also implementing Webdriver timeouts for the first time, which allows us
		 * to write code without throwing Thread.sleep exceptions
		 */
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://fits.qauber.com");
		driver.manage().window().maximize();
		
		/**
		 * Next we need to log in with valid credentials
		 */
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		WebElement pw = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		
		email.sendKeys("dryrun4@mailinator.com");
		pw.sendKeys("password");
		driver.findElement(By.xpath(".//*[@type='submit']")).sendKeys(Keys.RETURN);
		
		/**
		 * After that we navigate to the 'Add Reports' page that we want to test
		 */
		
		WebElement add = driver.findElement(By.xpath(".//*[text() = 'Add Report']"));
		add.click();
		WebElement subjectInfo = driver.findElement(By.xpath("//div[@class='fa fa-user size']"));
		subjectInfo.click();
		
		/**
		 * Then we need to find all the elements and send information into them
		 * 
		 * There is a more streamlined method of doing this that I will use in the future
		 */
		
		
		WebElement caseID = driver.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']"));
		WebElement last = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));		
		
		last.sendKeys("Gena");
		first.sendKeys("Krokodil");
		caseID.sendKeys("123456789");
		
		/**
		 * This script is for entering only the required fields 
		 */
		
		WebElement gang = driver.findElement(By.xpath("//h4/div[@title='Gang Membership']"));
		gang.click();
		WebElement location = driver.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']"));
		location.sendKeys("1234 Mockingbird Lane");
		
		WebElement preview = driver.findElement(By.xpath("//h4/div[@title='Preview']"));
		preview.click();
		WebElement commit = driver.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']"));
		commit.click();
		
		driver.quit();
	}
}
